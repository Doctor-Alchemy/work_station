package com.zjrcu.shiwucaozuo.shengming;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig.class);
        context.refresh();

        UserService userService = context.getBean(UserService.class);
        //先执行插入操作
        int count = userService.insertBatch(
                "zhangsan",
                "lisi",
                "wangwu",
                "maliu");
        System.out.println("insert successful num:" + count);
        //然后查询一下
        System.out.println(userService.userList());
    }
}
