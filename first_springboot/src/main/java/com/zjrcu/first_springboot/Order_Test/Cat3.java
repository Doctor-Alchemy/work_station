package com.zjrcu.first_springboot.Order_Test;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Cat3 {

    private String catName;
    private int age;

    public Cat3() {
        System.out.println("Order:Cat3");
    }
    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

