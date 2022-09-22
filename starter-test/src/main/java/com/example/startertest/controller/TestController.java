package com.example.startertest.controller;

import com.example.hellospringbootstarter.Service.ChineseService ;
import com.example.hellospringbootstarter.Service.EnglishService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ChineseService chineseService ;
    @Autowired
    private EnglishService englishService ;
    @RequestMapping("/t1")
    public String t1(){
        return chineseService.show();
    }
    @RequestMapping ("/t2")
    public String t2(){
        return englishService.show();
    }
}
