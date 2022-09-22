package com.zjrcu.druiddb.JdbcTemp.service.test;

import com.zjrcu.druiddb.JdbcTemp.service.dao.User;
import com.zjrcu.druiddb.JdbcTemp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUser {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        //添加
//        User user = new User("22","kk","11");
//        userService.addUser(user);

        //更新
//        User user1 = new User("22","kk","2");
//        userService.updateUser(user1);

        //删除
//        String id = "2";
//        userService.deleteUser(id);

        // 返回对象
        User user = userService.findOne("1");
        System.out.println("select result:");
        System.out.println(user);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[]o1 = {"7","pp","2"};
//        Object[]o2 = {"8","rr","1"};
//        Object[]o3 = {"9","vv","1"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        userService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[]o11 = {"tt","1","7"};
//        Object[]o22 = {"uu","2","8"};
//        Object[]o33 = {"ii","2","9"};
//        batchArgs.add(o11);
//        batchArgs.add(o22);
//        batchArgs.add(o33);
//        userService.batchUpdate(batchArgs);

        //批量删除
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[]o1 = {"3"};
//        Object[]o2 = {"5"};
//        Object[]o3 = {"8"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        userService.batchDelete(batchArgs);

        //返回总条数
        int count = userService.findCount();
        System.out.println("data number:"+count);

        // 返回集合对象
        List<User> userList =userService.findAll();
        System.out.println("all datas in table 't_user':");
        System.out.println(userList);

    }
}

