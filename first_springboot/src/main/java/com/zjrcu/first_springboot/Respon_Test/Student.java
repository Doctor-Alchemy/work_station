package com.zjrcu.first_springboot.Respon_Test;

public class Student {
    private String sno;
    private String sname;
    private int age;

    public Student() {
        this.sno = "089";
        this.sname = "savitar";
        this.age = 28;
    }

    public Student(String sno, String sname, int age) {
        this.sno = sno;
        this.sname = sname;
        this.age = age;
    }

    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
