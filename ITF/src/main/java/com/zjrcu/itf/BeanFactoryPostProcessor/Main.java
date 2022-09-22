package com.zjrcu.itf.BeanFactoryPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.zjrcu.itf.BeanFactoryPostProcessor");
        User user = applicationContext.getBean("user",User.class);
        System.out.println(user.getUserName());
    }
}
