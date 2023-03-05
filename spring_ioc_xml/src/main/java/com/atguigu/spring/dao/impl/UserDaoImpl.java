package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;

/**
 * @ClassName:UserDaoImpl
 * @Author:lxd
 * @Date:2023/3/5 21:27
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
