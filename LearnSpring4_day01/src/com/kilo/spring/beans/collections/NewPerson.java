package com.kilo.spring.beans.collections;

import com.kilo.spring.beans.Car;

import java.util.List;
import java.util.Map;

/**
 * Created by kilo on 2019/3/9.
 */
public class NewPerson {
    private String name;
    private int age;
    private Map<String, Car> cars;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
