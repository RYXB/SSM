package com.atguigu.spring.service;

/**
 * ClassName:BookService
 * Author:lxd
 * Date:2023/3/10 0:05
 * Description:
 */
public interface BookService {

    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId,Integer bookId);
}
