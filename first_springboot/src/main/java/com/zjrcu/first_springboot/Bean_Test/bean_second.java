package com.zjrcu.first_springboot.Bean_Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class bean_second {
    //@Bean注解注册bean,同时可以指定初始化和销毁方法
    @Bean(name="testBean",initMethod="start",destroyMethod="cleanup")
    @Scope("prototype")
    public bean_first testBean() {
        return new bean_first();
    }

}
