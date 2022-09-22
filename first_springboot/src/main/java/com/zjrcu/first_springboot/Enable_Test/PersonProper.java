package com.zjrcu.first_springboot.Enable_Test;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "person")
public class PersonProper {

    private String lastName;
    private Integer age;
    private Boolean power;

    private Map<String, Object> maps;
    private List<Object> lists;

}
