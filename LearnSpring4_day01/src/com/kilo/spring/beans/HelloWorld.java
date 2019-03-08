package com.kilo.spring.beans;

/**
 * Created by kilo on 2019/3/8.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }


    public void sayHello() {
        System.out.println("hello: " + name);
    }
}
