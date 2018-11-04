package com.baozun.demo.service;

import java.util.Collection;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/2 17:35
 */
public interface RedisService {


    void setValue(String key, String value);

    void setValue(String key, String value, int expireTime);

    <T> void setObject(String key, T t);

    <T> void setObject(String key, T t, int expireTime);

    Object getObject(String f);

    String get(String key);

}
