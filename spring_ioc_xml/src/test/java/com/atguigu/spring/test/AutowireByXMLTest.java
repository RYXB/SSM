package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:AutowireByXMLTest
 * @Author:lxd
 * @Date:2023/3/5 21:38
 * @Description:
 */
public class AutowireByXMLTest {

    /**
     * 自动装配：
     * 根据指定的策略，在IOC容器中匹配某个bean,自动为bean中的类型的属性或接口的属性赋值
     * 可以通过bean标签中的autowire属性设置自动装配的策略
     * 自动装配的策略：
     * no,default:表示不装配
     * byType:根据要赋值的属性的类型，在IOC容器中匹配某个bean,为属性赋值
     * byName:
     */

    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
