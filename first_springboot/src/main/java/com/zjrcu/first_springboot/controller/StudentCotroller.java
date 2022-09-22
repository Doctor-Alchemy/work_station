package com.zjrcu.first_springboot.controller;

import com.zjrcu.first_springboot.Respon_Test.Service.StudentService;
import com.zjrcu.first_springboot.Respon_Test.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCotroller {
    @Autowired
    StudentService studentService ;
    //@GetMapping ("/getstu")
    @Test
    public Student getStu(){
        return studentService .getStudent() ;
    }
}
