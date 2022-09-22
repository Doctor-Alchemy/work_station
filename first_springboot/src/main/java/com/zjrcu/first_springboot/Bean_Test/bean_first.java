package com.zjrcu.first_springboot.Bean_Test;

import org.springframework.stereotype.Component;

@Component
public class bean_first {

    private String username;
    private String url;
    private String password;

    public void say() {
        System.out.println("TestBean say...");
    }
    public void start() {
        System.out.println("TestBean init...");
    }
    public void cleanup() {
        System.out.println("TestBean destroy...");
    }
}
