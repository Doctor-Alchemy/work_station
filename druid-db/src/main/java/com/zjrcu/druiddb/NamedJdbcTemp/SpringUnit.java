package com.zjrcu.druiddb.NamedJdbcTemp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringUnit {

    private ClassPathXmlApplicationContext ctx = null;
    private UserService userService = null;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean2.xml");
        userService = (UserService) ctx.getBean("userService");
    }

    @After
    public void tearDown() throws Exception {
        ctx.close();
    }

    @Test
    public void test() {
        //testInsert();
        //testUpdate();
        //testDelete();
        testGetUsers();
    }

    private void testInsert() {
        userService.insertUser(new UserModel(147, "wangwu", "105032014140"));
        System.out.println(userService.getUser(147).toString());
    }

    private void testUpdate() {
        userService.updateUser(new UserModel(147, "wangwu", "105032014147"));
        System.out.println(userService.getUser(147).toString());
    }

    private void testDelete() {
        userService.deleteUser(146);
        System.out.println(userService.getUser(146).toString());
    }

    private void testGetUsers() {
        List<UserModel> userList = userService.getUsers();
        for(UserModel user: userList) {
            System.out.println(user.toString());
        }
    }

}

