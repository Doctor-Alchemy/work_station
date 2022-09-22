package com.zjrcu.first_springboot.Enable_Test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(PersonProper.class)
public class EnableTest {

    @Autowired
    PersonProper person;
    //@Test
    @RequestMapping("/testing")
    public String testing() {
        System.out.println(person);
        return "savitar";
    }

}