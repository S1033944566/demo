package com.baozun.demo;

import com.mongodb.util.JSON;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import net.sf.json.JSONObject;
import org.apache.tomcat.jni.Time;
import org.junit.rules.Timeout;
import org.omg.CORBA.TIMEOUT;
import redis.clients.jedis.Jedis;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/22 13:33
 */
public class Test2 {


    public static void main(String[] args) {

        Jedis jedis = new Jedis("47.100.201.19", 6379);
        jedis.auth("redis123**");
        System.out.println(jedis.ping());

        //jedis.set("test", "testvalue");

        jedis.setex("key", 10, "value");



    }
}
