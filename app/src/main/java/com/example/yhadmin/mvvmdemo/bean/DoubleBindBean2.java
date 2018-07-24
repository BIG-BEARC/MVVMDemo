package com.example.yhadmin.mvvmdemo.bean;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo.bean
 *  @文件名:   DoubleBindBean2
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 18:39
 *  @描述：    TODO
 */

import android.databinding.ObservableField;

public class DoubleBindBean2 {
    //变量需要为public
    public final ObservableField<String> username = new ObservableField<>();
}
