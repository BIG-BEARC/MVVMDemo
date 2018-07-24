package com.example.yhadmin.mvvmdemo.bean.bean;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo.bean
 *  @文件名:   User
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 14:27
 *  @描述：    TODO
 */

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
