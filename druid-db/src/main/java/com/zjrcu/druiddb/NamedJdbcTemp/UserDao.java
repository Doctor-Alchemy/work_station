package com.zjrcu.druiddb.NamedJdbcTemp;

import com.zjrcu.druiddb.NamedJdbcTemp.UserModel;

import java.util.List;

public interface UserDao {

    public UserModel getUser(int id);
    public List<UserModel> getUsers();
    public int insertUser(UserModel user);
    public int updateUser(UserModel user);
    public int deleteUser(int id);

}

