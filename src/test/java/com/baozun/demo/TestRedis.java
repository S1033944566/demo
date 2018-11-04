package com.baozun.demo;

import com.baozun.demo.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.Serializable;
import java.util.*;

/**
 * @description: 测试redis存储
 * @author: Rover Wang
 * @date: 2018/11/4 13:50
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private RedisService redisService;

    @Test
    public void testCollection() {
        List<Domain> list = new ArrayList<>();
        Domain domain = new Domain("domainName");
        list.add(domain);
        list.add(domain);

        Set set = new HashSet();
        set.add("11111");

        Map<String, String> map = new HashMap<>();
        map.put("map", "mapValue");

        redisService.setObject("list", list, 10);
        redisService.setObject("set", set);
        redisService.setObject("map", map);
        redisService.setObject("int", 1111);
        redisService.setValue("str", "2222");
        List<Domain> ll = (ArrayList)redisService.getObject("list");
        System.out.println(ll.get(0).getName());
        System.out.println(redisService.getObject("set"));
        System.out.println(redisService.getObject("int"));

    }

    @Test
    public void testObect() {
        Domain domain = new Domain("name");

        redisService.setObject("domain", domain);
        Domain doamin = (Domain) redisService.getObject("domain");
        System.out.println(doamin.getName());


    }
}
class Domain implements Serializable {

    String name;

    Domain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
