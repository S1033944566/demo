package com.baozun.demo.service.impl;

import com.baozun.demo.service.RedisService;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import java.io.*;
import java.util.*;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/2 17:35
 */
@Service
public class RedisServiceImpl implements RedisService {


    private JedisPool jedisPool;

    private static final int DAY = 60 * 60 * 24;

    private static final int HOUR = 60 * 60;

    private static final int WEEK = 60 * 60 * 24 * 7;


    @Override
    public void setValue(String key, String value) {
        jedisPool.getResource().set(key, value);
    }

    @Override
    public void setValue(String key, String value, int expireTime) {
        getJedis().setex(key, expireTime, value);

    }

    @Override
    public <T> void setObject(String key, T t) {
        byte[] bytes = t2Bytes(t);
        getJedis().set(key.getBytes(), bytes);
    }

    @Override
    public <T> void setObject(String key, T t, int expireTime) {
        byte[] bytes = t2Bytes(t);
        getJedis().setex(key.getBytes(), expireTime, bytes);
    }

    @Override
    public Object getObject(String f) {

        return bytes2T(getJedis().get(f.getBytes()));
    }

    @Override
    public String get(String key) {
        return getJedis().get(key);
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }


    private Jedis getJedis() {
        return jedisPool.getResource();
    }


    /**
     * 单个对象转换为字节数组
     * @param t
     * @param <T>
     * @return
     */
    private <T> byte[] t2Bytes(T t) {
        if (t == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        byte[] bytes = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(t);
            bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 将字节转换为 T
     * @param bytes
     * @param <T>
     * @return
     */
    private <T> T bytes2T(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (T) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
