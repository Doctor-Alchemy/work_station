package com.example.hellospringbootstarter.Service;

import com.example.hellospringbootstarter.pojo.English;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EnglishService {
//    @Autowired
    @Resource
    private English english;
    public String show() {
            return "I say " + english.getSpeak() + ",I eat" + english.getEat() ;
        }

}
