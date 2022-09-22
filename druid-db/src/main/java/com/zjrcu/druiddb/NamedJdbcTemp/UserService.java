package com.zjrcu.druiddb.NamedJdbcTemp;

import java.util.List;

public interface UserService {

    public UserModel getUser(int id);
    public List<UserModel> getUsers();
    public int insertUser(UserModel user);
    public int updateUser(UserModel user);
    public int deleteUser(int id);

}

