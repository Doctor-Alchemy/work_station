package com.example.startertest;

import com.example.hellospringbootstarter.HelloSpringBootStarterApplication;
import com.example.hellospringbootstarter.Service.ChineseService;
import com.example.hellospringbootstarter.pojo.Chinese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"com.example.hellospringbootstarter"})
public class StarterTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterTestApplication.class, args);

//        ConfigurableApplicationContext run = SpringApplication.run(StarterTestApplication.class, args);
//        Chinese chinese = new Chinese();
//        chinese.getSay();
//        ChineseService bean = run.getBean(ChineseService.class);
//        bean.show();
//        System.out.println(bean);

    }

}
