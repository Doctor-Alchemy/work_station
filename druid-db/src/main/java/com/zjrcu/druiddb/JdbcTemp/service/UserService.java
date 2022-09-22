package com.zjrcu.druiddb.JdbcTemp.service;

import com.zjrcu.druiddb.JdbcTemp.service.dao.User;
import com.zjrcu.druiddb.JdbcTemp.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //添加的方法
    public void addUser(User user){
        userDao.add(user);
    }

    //修改的方法
    public void updateUser(User user){
        userDao.updateUser(user);
    }


    //删除的方法
    public void deleteUser(String id){
        userDao.delete(id);
    }

    //查询表中的记录数
    public int findCount(){
        return userDao.selectCount();
    }

    //查询返回对象
    public User findOne(String id){
        return userDao.findUserInfo(id);
    }

    //查询返回集合
    public List<User> findAll(){
        return userDao.findAllUser();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        userDao.batchAddUser(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        userDao.batchUpdateUser(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs){
        userDao.batchDeleteUser(batchArgs);
    }

}

