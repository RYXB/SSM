package com.atguigu.spring.test;

import com.atguigu.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:AOPTest
 * Author:lxd
 * Date:2023/3/8 19:54
 * Description:
 */
public class AOPByAnnotationTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10,2);
    }
}
