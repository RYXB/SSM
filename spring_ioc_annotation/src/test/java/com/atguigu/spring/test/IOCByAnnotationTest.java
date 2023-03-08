package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:IOCByAnnotationTest
 * @Author:lxd
 * @Date:2023/3/5 22:13
 * @Description:
 */
public class IOCByAnnotationTest {

    /**
     * @Component：将类标识为普通组件
     * @Controller：将类标识为控制层组件
     * @Service：将类标识为业务层组件
     * @Repository：将类标识为持久层组件
     *
     * 通过注解+扫描所配置的bean的id,默认值为类的小驼峰，即类名的首字母为小写的结果
     * 可以通过标识组件的注解的value属性值设置bean的自定义的id
     *
     * @Autowired:实现自动装配功能的注解
     * 1、标识在成员变量上，不需要设置成员变量的set方法
     * 2、标识在set方法上
     * 3、为当前成员变量赋值的有参构造上
     *
     * @Autowired注解原理
     * 1、默认使用byType的方式，在IOC容器中通过类型匹配某个bean为属性赋值
     * 2、若有多个类型匹配的bean,此时会自动转换为byName的方式实现自动装配的效果
     * 即将要赋值的属性的属性名作为bean的id匹配某个bean赋值
     */

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean("userController",UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean("userServiceImpl",UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean("userDaoImpl",UserDao.class);
//        System.out.println(userDao);
        userController.saveUser();
    }
}
