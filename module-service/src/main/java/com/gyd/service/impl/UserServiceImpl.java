package com.gyd.service.impl;

import com.gyd.dao.UserMapper;
import com.gyd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by acer on 2019/8/15.
 */
@Service(value = "UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer login() {
        return userMapper.login();
    }

    @Override
    public Integer checkLogin(String username,String password) {
        return userMapper.checkLogin(username, password);
    }
}
