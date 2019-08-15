package com.gyd.controller;

import com.gyd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by acer on 2019/8/15.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public Integer login(){
        return userService.login();
    }
    @PostMapping("/checkLogin")
    public String checkLogin(String username, String password){
        Integer id = userService.checkLogin(username, password);
        if (id != null ){
            return "ok";
        } else {
            return "no";
        }
    }
}
