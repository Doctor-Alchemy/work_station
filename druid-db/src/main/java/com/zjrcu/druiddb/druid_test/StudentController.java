package com.zjrcu.druiddb.druid_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/selectdb/{id}")
    public Student selectdb(@PathVariable Long id){
        return studentRepository.selectdb(id);
    }
}

