package com.baozun.demo.service.impl;

import com.baozun.demo.service.RedisService;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/2 17:35
 */
@Service
public class RedisServiceImpl implements RedisService {


    private JedisPool jedisPool;


    @Override
    public void setValue(String key, String value) {
        jedisPool.getResource().set(key, value);
    }

    @Override
    public void setValue(String key, String value, int expireTime) {

    }

    @Override
    public void setValue(String key, int value) {

    }

    @Override
    public void setValue(String key, int value, int expireTime) {

    }

    @Override
    public <T> void setObject(String key, T t) {

    }

    @Override
    public <T> void setObject(String key, T t, int expireTime) {

    }

    @Override
    public String get() {
        return "111";
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
}
