package com.asiacomBigData.boot.service.impl;

import com.asiacomBigData.boot.mapper.UserMapper;
import com.asiacomBigData.boot.model.User;
import com.asiacomBigData.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public User getUserById(int id) {
        return mapper.getUserById(id);
    }
}