package com.baozun.demo.service.impl;

import com.baozun.demo.entity.UserEntity;
import com.baozun.demo.mapper.UserMapper;
import com.baozun.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }
}
