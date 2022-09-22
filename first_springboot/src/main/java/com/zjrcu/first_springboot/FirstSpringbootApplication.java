package com.zjrcu.first_springboot;

import com.zjrcu.first_springboot.Bean_Test.bean_first;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(FirstSpringbootApplication.class, args);

        bean_first bean = run.getBean(bean_first.class);
        bean_first bean1 = run.getBean(bean_first.class);
        System.out.println(bean1==bean1);
        bean_first b2 = new bean_first();
        bean_first b3 = new bean_first();
        System.out.println(b2==b3);
    }

}
