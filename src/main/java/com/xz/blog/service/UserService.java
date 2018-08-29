package com.xz.blog.service;

import com.xz.blog.mapper.UserMapper;
import com.xz.blog.mapper.UserMapper;
import com.xz.blog.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

   // 获取单个用户信息
    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

    //获取所有的用户信息
    public ArrayList<Person> selectAllUser() {

        return userMapper.selectAllUser();

    }

}