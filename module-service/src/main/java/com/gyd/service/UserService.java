package com.gyd.service;

/**
 * Created by acer on 2019/8/15.
 */
public interface UserService {
    Integer login();
    Integer checkLogin(String username,String password);
}
