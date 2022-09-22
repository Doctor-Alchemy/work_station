package com.zjrcu.itf.ApplicationContextAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplicationContextAware {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.zjrcu.itf");
        //从AnnotationConfigApplicationContext中获取SpringUtil工具类
        SpringUtil springUtil = (SpringUtil) applicationContext.getBean("springUtil");
        //之后要获取spring容器中的bean就可以通过springUtil.getBean方法获取了
        MyApplicationContextAware TestApp = (MyApplicationContextAware) springUtil.getBean("myApplicationContextAware");
        TestApp.hello();
    }
}

