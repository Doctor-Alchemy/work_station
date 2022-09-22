package com.zjrcu.first_springboot.Service_Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bird_Test {
    //private static Bird FLY;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext factory=new ClassPathXmlApplicationContext("BirdBean.xml");
        Fly FLY=(Fly)factory.getBean("bird");
        FLY.fly();
    }
}

