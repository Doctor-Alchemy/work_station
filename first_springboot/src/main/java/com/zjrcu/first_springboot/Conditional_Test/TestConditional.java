package com.zjrcu.first_springboot.Conditional_Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Map;

public class TestConditional {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(TestConditionalConfig.class);
        Map<String, Book> map = annotationContext.getBeansOfType(Book.class);
        System.out.println(map);
    }
}