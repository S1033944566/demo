package com.baozun.demo;

import com.baozun.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/1 17:00
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1()
    {
        System.out.println(userMapper.getCount());
        System.out.println(userMapper.getAll().get(0).getUserSex().name());
    }

}
