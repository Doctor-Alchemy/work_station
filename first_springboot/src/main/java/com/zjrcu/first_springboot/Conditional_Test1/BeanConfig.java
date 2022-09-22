package com.zjrcu.first_springboot.Conditional_Test1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    //@Conditional(WindowsCondition.class)
    @Bean( "bill")
    public Conditional_Person person1(){
        return new Conditional_Person("Bill Gates",62);
    }

    //@Conditional({LinuxCondition.class})
    @Bean("linus")
    public Conditional_Person person2(){
        return new Conditional_Person("Linus",48);
    }
}

