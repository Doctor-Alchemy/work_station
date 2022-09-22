package com.zjrcu.first_springboot.controller.Autowired_Test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class testautow0 {
    private autowire_first0 autowire;
    @Autowired
    public testautow0(autowire_first0 autowire){
        this.autowire=autowire ;
    }
    @Test
    public void contextLoads(){

        System.out.println(autowire);
        System.out.println(autowire.getId());
        System.out.println(autowire.getName());
    }
}
