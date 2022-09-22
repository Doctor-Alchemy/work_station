package com.zjrcu.first_springboot.Bean_Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testbean {
    public static void main (String [] args){
        // @Configuration注解的spring容器加载方式
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(bean_second.class);

        bean_first  tb1 = (bean_first)  context.getBean("testBean");
        System.out.println(tb1);

        bean_first  tb2 = (bean_first)  context.getBean("testBean");
        System.out.println(tb2);

    }
}
