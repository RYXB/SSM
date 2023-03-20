package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:HelloController
 * Author:lxd
 * Date:2023/3/20 15:57
 * Description:
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
