package com.zjrcu.first_springboot.controller.Autowired_Test;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class autowire_first0 {
    private int id;
    private String name;

    public autowire_first0(){
        System.out.println("no class");
    }
    public autowire_first0(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("class exist");
    }
}
