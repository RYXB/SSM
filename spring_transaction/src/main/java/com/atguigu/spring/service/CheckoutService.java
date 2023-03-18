package com.atguigu.spring.service;

/**
 * ClassName:CheckoutService
 * Author:lxd
 * Date:2023/3/10 14:58
 * Description:
 */
public interface CheckoutService {
    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
