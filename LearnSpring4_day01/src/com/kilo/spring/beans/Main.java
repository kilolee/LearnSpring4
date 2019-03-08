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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2、从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //3、调用sayHello方法
        helloWorld.sayHello();

    }


}
