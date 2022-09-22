package com.example.hellospringbootstarter.pojo;

import com.example.hellospringbootstarter.Service.ChineseService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello.chinese")
@ConditionalOnBean(ChineseService.class)
public class Chinese {
    private String say;
    private String city;

//    @Bean
    public String getSay() {
        return say;
    }
    public void setSay(String say) {
        this.say = say;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
