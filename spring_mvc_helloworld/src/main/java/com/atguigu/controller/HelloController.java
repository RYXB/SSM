package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:HelloController
 * Author:lxd
 * Date:2023/3/10 16:04
 * Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal(){
//        将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
