package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Person;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCByXMLTest {

    /**
     * 获取Bean的三种方式
     * 1、根据bean的id获取
     * 2、根据bean的类型获取
     * 注意：根据类型获取bean时，要求IOC容器有且只有一个类型匹配的bean
     * 若没有任何一个类型匹配的bean,此时抛出异常：NoSuchBeanDefinitionException
     * 若有多个一个类型匹配的bean,此时抛出异常：NoUniqueBeanDefinitionException
     * 3、根据bean的id和类型获取
     * 结论：
     * 即通过bean的类型，bean所继承的类的类型，bean所实现的接口的类型都可以获取bean对象
     */


    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");

//        Student studentOne = (Student) ioc.getBean("studentOne");
//        Student student = ioc.getBean(Student.class);
//        Student student = ioc.getBean("studentOne", Student.class);
        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void testDI(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = ioc.getBean("studentTwo", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = ioc.getBean("studentThree", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = ioc.getBean("studentFour", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI3(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = ioc.getBean("studentFive", Student.class);
        System.out.println(student);
//        Clazz clazz = ioc.getBean("clazzInner", Clazz.class);
//        System.out.println(clazz);
    }

    @Test
    public void testDI4(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
        System.out.println(clazz);
    }

    @Test
    public void testDI5(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = ioc.getBean("studentSix", Student.class);
        System.out.println(student);
    }
}
