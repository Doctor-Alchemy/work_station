package com.zjrcu.druiddb.druid_test;

import com.zjrcu.druiddb.druid_test.Student;

public interface StudentRepository {
    int insertdb(Student user);
    int updatedb(Student user);
    int deletedb(long id);
    Student selectdb(long id);
}
