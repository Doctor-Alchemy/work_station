package com.zjrcu.itf.EnvironmentPostProcessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        String username = context.getEnvironment().getProperty("root.user");
        String password = context.getEnvironment().getProperty("root.password");
        System.out.println("username==="+username);
        System.out.println("password==="+password);
        context.close();
    }
}
