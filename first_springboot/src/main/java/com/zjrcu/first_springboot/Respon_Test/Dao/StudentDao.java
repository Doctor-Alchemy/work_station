package com.zjrcu.first_springboot.Respon_Test.Dao;

import com.zjrcu.first_springboot.Respon_Test.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    private Student stu;

    public StudentDao() {
        this.stu = new Student("089","savitar",28);
    }
    public Student getStudent(){
        return this.stu;
    }
    public int addStudent(Student stu){
        return 0;
    }
    List<Student> getAllStudent(){
        return null;
    }
}
