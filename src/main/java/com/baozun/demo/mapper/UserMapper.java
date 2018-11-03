package com.baozun.demo.mapper;

import com.baozun.demo.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/1 15:54
 */

public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

    int getCount();

}
