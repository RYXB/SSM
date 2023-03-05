package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import com.atguigu.spring.service.impl.UserServiceImpl;

/**
 * @ClassName:UserController
 * @Author:lxd
 * @Date:2023/3/5 21:25
 * @Description:
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
