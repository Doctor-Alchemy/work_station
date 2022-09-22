package com.zjrcu.first_springboot.Conditional_Test1;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public interface Condition {
    boolean matches(ConditionContext var1, AnnotatedTypeMetadata var2);
}
