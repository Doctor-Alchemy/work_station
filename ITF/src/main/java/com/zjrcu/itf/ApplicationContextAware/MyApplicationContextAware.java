package com.zjrcu.itf.ApplicationContextAware;

import org.springframework.stereotype.Component;

@Component
public class MyApplicationContextAware {

    public void hello(){
        System.out.println("!!!  MyApplicationContextAware test   !!!");
    }
}
