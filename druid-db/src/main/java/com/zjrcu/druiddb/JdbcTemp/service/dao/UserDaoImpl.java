package com.zjrcu.druiddb.JdbcTemp.service.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //添加的方法
    @Override
    public void add(User user) {
        //创建sql语句
        String sql=" INSERT INTO t_user (user_id, username, ustatus) VALUES (?, ?, ?) ";
        // 调用方法实行
        int updat = jdbcTemplate.update(sql,user.getUserId(),user.getUsername(),user.getUstatus());
        // 返回成功的条数
        System.out.println(updat);
    }
    //修改
    @Override
    public void updateUser(User user) {

        String sql = "UPDATE   user_db.t_user SET   username = ?,  ustatus = ? WHERE user_id = ?";
        Object[] args = {user.getUsername(),user.getUstatus(),user.getUserId()};
        int updat = jdbcTemplate.update(sql,args);
        System.out.println(updat);
    }
    //删除
    @Override
    public void delete(String id) {

        String sql ="DELETE FROM user_db.t_user WHERE user_id = ?";
        int updat = jdbcTemplate.update(sql,id);
        System.out.println(updat);
    }

    //查询记录数
    @Override
    public int selectCount() {
        String sql ="SELECT COUNT(*) FROM t_user";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;

    }

    //返回对象
    @Override
    public User findUserInfo(String id) {
        String sql ="SELECT * FROM t_user where user_id = ?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
        return user;
    }

    //返回集合对象
    @Override
    public List<User> findAllUser() {
        String sql = "select * from t_user";
        List<User> userList =jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
        return userList;
    }

    //批量添加
    @Override
    public void batchAddUser(List<Object[]> batchArgs) {
        String sql=" INSERT INTO t_user (user_id, username, ustatus) VALUES (?, ?, ?) ";
        int []ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量修改
    @Override
    public void batchUpdateUser(List<Object[]> batchArgs) {
        String sql = "UPDATE   user_db.t_user SET   username = ?,  ustatus = ? WHERE user_id = ?";
        int []ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量删除
    @Override
    public void batchDeleteUser(List<Object[]> batchArgs) {
        String sql ="DELETE FROM user_db.t_user WHERE user_id = ?";
        int []ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}

