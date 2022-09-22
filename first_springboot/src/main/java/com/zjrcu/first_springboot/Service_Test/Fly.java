package com.zjrcu.first_springboot.Service_Test;

import org.springframework.stereotype.Service;

@Service("bird")
public class Fly implements Bird{

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}

