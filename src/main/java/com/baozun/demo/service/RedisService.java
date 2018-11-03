package com.baozun.demo.service;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/2 17:35
 */
public interface RedisService {


    void setValue(String key, String value);

    void setValue(String key, String value, int expireTime);

    void setValue(String key, int value);

    void setValue(String key, int value, int expireTime);

    <T> void setObject(String key, T t);

    <T> void setObject(String key, T t, int expireTime);

    String get();

}
