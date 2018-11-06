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
        redisService.setValue("shanxiang", "123456");
        redisService.setObject("zhangsan", new Domain("zhangsan"));

    }

    @Test
    public void testObect() {
        Domain domain = new Domain("name");

        redisService.setObject("domain", domain);
        Domain doamin = (Domain) redisService.getObject("domain");
        System.out.println(doamin.getName());
        List list = new ArrayList<String>();
        list.add("123123122312");
        redisService.setObject("list", list);

        System.out.println(redisService.get("shanxiang"));
        Domain domain1 = (Domain)redisService.getObject("zhangsan");
        System.out.println(domain1.getName());
        List<?> list1 = (List<?>) redisService.getObject("list");
        System.out.println(list1.get(0));
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
