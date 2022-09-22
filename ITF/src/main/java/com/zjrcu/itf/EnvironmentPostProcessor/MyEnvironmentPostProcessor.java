package com.zjrcu.itf.EnvironmentPostProcessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try{
            InputStream inputStream =
                    new FileInputStream("E:\\springboot_project\\ITF\\src\\main\\resources\\application.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my",properties);
            environment.getPropertySources().addLast(propertiesPropertySource);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
