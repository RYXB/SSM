package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName:UserDaoImpl
 * @Author:lxd
 * @Date:2023/3/5 22:12
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
