package com.zjrcu.first_springboot.Conditional_Test1;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConditionalTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

    @Test
    public void test1(){
        String osName = applicationContext.getEnvironment().getProperty("os.name");
        System.out.println("Operateing System:" + osName);
        Map<String, Conditional_Person> map = applicationContext.getBeansOfType(Conditional_Person.class);
        System.out.println(map);
    }

}
