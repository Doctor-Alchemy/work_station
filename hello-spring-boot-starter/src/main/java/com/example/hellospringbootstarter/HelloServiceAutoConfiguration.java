package com.example.hellospringbootstarter;

import com.example.hellospringbootstarter.Service.ChineseService;
import com.example.hellospringbootstarter.Service.EnglishService;
import com.example.hellospringbootstarter.pojo.Chinese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConditionalOnClass(Chinese.class)
public class HelloServiceAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix="hello.chinese", name="chineseService", havingValue="true")//读取hello.chinese中的chineseService，如果havingValue为true就注入
    @ConditionalOnMissingBean (ChineseService.class )
    public ChineseService chineseService() {
        return new ChineseService();
    }
    @Bean
    @ConditionalOnProperty(prefix="hello.english",name="englishService",havingValue="true")
    @ConditionalOnMissingBean (EnglishService.class )
    public EnglishService englishService() {
        return new EnglishService();
    }
}
