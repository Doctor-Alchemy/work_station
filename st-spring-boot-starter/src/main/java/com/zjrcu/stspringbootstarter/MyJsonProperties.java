package com.zjrcu.stspringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zjrcu.json")
public class MyJsonProperties {

    public static final String DEFAULT_NAME = "zjrcu";

    private String name = DEFAULT_NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
