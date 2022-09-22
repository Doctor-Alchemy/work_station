package com.example.ts.controllor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cdemo {
    @GetMapping("/t")
    public String t(){
        return "hello";
    }
}
