package com.atguigu.spring.service.impl;

import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:CheckoutServiceImpl
 * Author:lxd
 * Date:2023/3/10 14:58
 * Description:
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
//    @Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId,bookId);
        }
    }
}
