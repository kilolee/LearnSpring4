package com.kilo.spring.beans.scope;

import com.kilo.spring.beans.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by kilo on 2019/4/11.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");

        Car car1 = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");
        System.out.println(car1==car2);
    }
}
