package com.zjrcu.first_springboot.Conditional_Test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class LinuxCondition implements Condition {

    @Override
    @Autowired (required =false)
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Environment environment = conditionContext.getEnvironment();

        String property = environment.getProperty("os.name");
        if (property.contains("Linux")){
            return true;
        }
        return false;
    }
}

