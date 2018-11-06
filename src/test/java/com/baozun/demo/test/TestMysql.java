package com.baozun.demo.test;

import com.baozun.demo.entity.UserEntity;
import com.baozun.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMysql {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void tsetMysql(){
        List<UserEntity> userList = userMapper.getAll();
        for (int i = 0; i <userList.size() ; i++) {
            System.out.println(userList.get(i).getNickName());
        }
    }
}
