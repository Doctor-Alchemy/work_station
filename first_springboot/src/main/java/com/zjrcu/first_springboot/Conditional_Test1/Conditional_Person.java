package com.zjrcu.first_springboot.Conditional_Test1;

public class Conditional_Person {
    private String Pname;
    private Integer Page;

    public String getPname() {
        return Pname;
    }
    public void setPname(String pname) {
        this.Pname = pname;
    }
    public Integer getPage() {
        return Page;
    }
    public void setPage(Integer page) {
        this.Page = page;
    }
    public Conditional_Person(String pname, Integer page) {
        this.Pname = pname;
        this.Page = page;
    }
    @Override
    public String toString() {
        System .out.println() ;
        return "{" + "name='" + Pname + '\'' + ", age=" + Page + '}';
    }

}
