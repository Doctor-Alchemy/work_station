package com.zjrcu.druiddb.druid_test;

import com.zjrcu.druiddb.druid_test.Student;
import com.zjrcu.druiddb.druid_test.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*
连接测试数据库：druid_test
数据库的表：student
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertdb(Student user) {
        return jdbcTemplate.update("INSERT INTO student(name, sex, age) values(?, ?, ?)",
                user.getName(), user.getSex(), user.getAge());
    }

    @Override
    public int updatedb(Student user) {
        return jdbcTemplate.update("UPDATE student SET name = ? , sex = ? , age = ?  WHERE id=?"
                ,user.getName(), user.getSex(), user.getAge(), user.getId());
    }

    @Override
    public int deletedb(long id) {
        return jdbcTemplate.update("DELETE FROM student where id = ? ",id);
    }

    @Override
    public Student selectdb(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM student WHERE id=?"
                , new Object[] { id }, new BeanPropertyRowMapper<Student>(Student.class));
    }
}

