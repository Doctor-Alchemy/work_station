package com.zjrcu.first_springboot.EnableAuto_Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication


//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

@Repository

public class AutoTest {
    public static void main(String[] args) {
        SpringApplication.run(AutoTest.class, args);
    }
}

