package com.zjrcu.druiddb.NamedJdbcTemp;

public class UserModel {

    private int id;
    private String name;
    private String pswd;

    public UserModel() {
        super();
    }

    public UserModel(int id, String name, String pswd) {
        super();
        this.id = id;
        this.name = name;
        this.pswd = pswd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public String toString() {
        return '\n'+"UserModel [id=" + id + ", name=" + name + ", pswd=" + pswd + "]";
    }

}

