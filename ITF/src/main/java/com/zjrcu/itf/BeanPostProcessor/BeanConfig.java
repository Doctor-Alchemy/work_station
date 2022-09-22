package com.zjrcu.itf.BeanPostProcessor;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    // 在Spring中注册Car这个bean
    @Bean
    public Car car() {
        return new Car();
    }

    // 在Spring中注册PostBean这个bean，实现BeanPostProcessor接口
    @Bean
    public PostBean postBean() {
        return new PostBean();
    }
}
