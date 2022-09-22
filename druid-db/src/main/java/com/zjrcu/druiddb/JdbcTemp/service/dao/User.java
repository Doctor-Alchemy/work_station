package com.zjrcu.druiddb.JdbcTemp.service.dao;

public class User {
    private String userId;
    private String username;
    private String ustatus;
    public User() {
    }
    public User(String userId, String username, String ustatus) {
        this.userId = userId;
        this.username = username;
        this.ustatus = ustatus;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
    public String getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getUstatus() {
        return ustatus;
    }
    @Override
    public String toString() {
        return "User{" + "userId='" + userId + '\'' + ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' + '}'+'\n';
    }
}

