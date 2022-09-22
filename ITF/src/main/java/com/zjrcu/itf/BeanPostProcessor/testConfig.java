package com.zjrcu.itf.BeanPostProcessor;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testConfig {
    @Test
    public void testConfig() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
    }
}
