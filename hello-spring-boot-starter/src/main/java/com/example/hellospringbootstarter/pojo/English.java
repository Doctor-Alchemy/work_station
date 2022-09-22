package com.example.hellospringbootstarter.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello.english")
public class English {
    private String speak;
    private String eat;

    public String getSpeak() {
        return speak;
    }
    public void setSpeak(String speak) {
        this.speak = speak;
    }
    public String getEat() {
        return eat;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
}

