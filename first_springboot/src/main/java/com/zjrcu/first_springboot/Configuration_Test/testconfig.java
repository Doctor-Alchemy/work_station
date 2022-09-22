package com.zjrcu.first_springboot.Configuration_Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testconfig {
    public static void main (String [] args){
        // @Configuration注解的spring容器加载方式
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configurate.class);
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configurate.class);
    }
}
