package com.zjrcu.first_springboot.Respon_Test.Service;

import com.zjrcu.first_springboot.Respon_Test.Dao.StudentDao;
import com.zjrcu.first_springboot.Respon_Test.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao stuDao;
    public Student getStudent(){
        Student stu=stuDao.getStudent() ;
        return stu;
    }
}
