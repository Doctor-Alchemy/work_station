package com.zjrcu.first_springboot.Conditional_Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(ZHCondition.class)

public class TestConditionalConfig {
    public String namez="Chinese book";//西游记
    public String typez="classic";//中国名著
    @Bean
    @Conditional(ZHCondition.class)//中文
    public Book bookZH()    {
        return new Book(namez ,typez ,97);
    }
    public String namec="English book";//哈姆雷特
    public String typec="classic";//外国名著
    @Bean
    @Conditional(CNCondition.class)//英文
    public Book bookCN()    {
        return new Book(namec,typec,80);
    }
}