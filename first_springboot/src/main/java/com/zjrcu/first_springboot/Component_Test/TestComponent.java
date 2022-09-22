package com.zjrcu.first_springboot.Component_Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");//创建容器对象
        StudentService studentService= (StudentService) applicationContext.getBean("studentService");
        studentService.addStudent();
    }
}
