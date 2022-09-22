package com.zjrcu.itf.InitializingBean;

import com.zjrcu.itf.BeanPostProcessor.BeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

public class testInitializingBean {
    @Autowired
    private TestInitialize testComponent;
    @Test
    //@RequestMapping("/test4")
    public void testInitializingBean(){
        System.out.println("!!!testInitializingBean() way!!!");
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TestInitialize.class);
        //testComponent.printWay();
    }
}
