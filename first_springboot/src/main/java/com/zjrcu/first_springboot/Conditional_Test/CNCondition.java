package com.zjrcu.first_springboot.Conditional_Test;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CNCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // user.language=CN 表示中文返回 true
        return conditionContext.getEnvironment().getProperty("user.language").contains("cn");
    }
}