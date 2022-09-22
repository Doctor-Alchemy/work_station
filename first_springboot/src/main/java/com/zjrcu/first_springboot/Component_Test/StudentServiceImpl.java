package com.zjrcu.first_springboot.Component_Test;

import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentServiceImpl implements StudentService {
    public void addStudent(){
        System.out.println("StudentService way");
    }
}
