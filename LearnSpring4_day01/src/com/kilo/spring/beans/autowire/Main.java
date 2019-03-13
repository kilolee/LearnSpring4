package com.kilo.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kilo on 2019/3/13.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
