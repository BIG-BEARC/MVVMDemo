package com.example.yhadmin.mvvmdemo.bean;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo.bean
 *  @文件名:   Student
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 17:17
 *  @描述：    TODO
 */

public class Student {
    private int resId;

    private String name;

    public Student(int resId, String name) {
        this.resId = resId;
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
