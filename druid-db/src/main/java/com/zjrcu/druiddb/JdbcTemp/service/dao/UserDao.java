package com.zjrcu.druiddb.JdbcTemp.service.dao;

import java.util.List;

public interface UserDao {

    //添加方法
    void add(User user);

    //修改方法
    void updateUser(User user);

    //删除方法
    void delete(String id);

    //查询记录数
    int selectCount();

    //查询返回对象
    User findUserInfo(String id);

    //查询集合
    List<User> findAllUser();

    //批量添加
    void batchAddUser(List<Object[]> batchArgs);

    //批量修改
    void batchUpdateUser(List<Object[]> batchArgs);

    //批量删除
    void batchDeleteUser(List<Object[]> batchArgs);
}
