package com.atguigu.spring.controller;

import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:BookContronller
 * Author:lxd
 * Date:2023/3/10 0:04
 * Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }
}
