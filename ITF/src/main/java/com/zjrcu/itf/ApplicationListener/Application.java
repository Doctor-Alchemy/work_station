package com.zjrcu.itf.ApplicationListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfig.class);
        context.publishEvent(new MyApplicationEvent("Car run"));
    }

}
