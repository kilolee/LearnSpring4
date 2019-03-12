package com.kilo.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kilo on 2019/3/8.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 方法一
         */
        //创建HelloWorld对象
//        HelloWorld helloWorld = new HelloWorld();
        //为name属性赋值
//        helloWorld.setName("kilo");

        /**
         * 方法二：用spring注入
         */
        //1、创建Spring的IOC容器对象
        //ApplicationContext代表IOC容器
        //ClassPathXmlApplicationContext：是ApplicationContext接口的实现类，该实现类从类路径下来加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2、从IOC容器中获取Bean实例
        //利用id定位到IOC容器中的bean
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //3、调用sayHello方法
        helloWorld.sayHello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person3");
        System.out.println(person);
    }


}
