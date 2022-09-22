package com.zjrcu.druiddb.NamedJdbcTemp;

import java.util.List;

public class UserServiceImp implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserModel getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public List<UserModel> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public int insertUser(UserModel user) {
        return userDao.insertUser(user);
    }

    @Override
    public int updateUser(UserModel user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

}

