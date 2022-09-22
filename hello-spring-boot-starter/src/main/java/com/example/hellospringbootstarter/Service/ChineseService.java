package com.example.hellospringbootstarter.Service;

import com.example.hellospringbootstarter.pojo.Chinese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChineseService {
//    @Autowired
    @Resource
    private Chinese chinese;
    public String show() {
        return "I say " + chinese.getSay() + ",I come from" + chinese.getCity() ;
    }

}
