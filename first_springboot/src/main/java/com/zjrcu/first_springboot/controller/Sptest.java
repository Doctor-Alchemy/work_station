package com.zjrcu.first_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//如果用@Controller运行后登录http://localhost:8088/springtest/test   会报错
               //端口在application.properties改了之后，登录时要记得修改
@RequestMapping ("/springtest")//这里爆红，引入依赖：  spring-boot-starter-web
public class Sptest {
    @RequestMapping ("/test")
    public String test(){
        return "Spring test";
    }
}
