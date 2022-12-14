package com.zjrcu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.zjrcu.dao")
@SpringBootApplication
@EnableTransactionManagement
public class TransactionBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(TransactionBootstrap.class, args);
    }
}
