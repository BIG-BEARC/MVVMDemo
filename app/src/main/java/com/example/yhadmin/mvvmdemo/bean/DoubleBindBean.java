package com.example.yhadmin.mvvmdemo.bean;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo.bean
 *  @文件名:   DoubleBindBean
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 18:18
 *  @描述：    TODO
 */

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.yhadmin.mvvmdemo.BR;

public class DoubleBindBean
        extends BaseObservable
{
    //BR 是编译阶段生成的一个类，功能与 R.java 类似，用 @Bindable 标记过 getter 方法会在 BR 中生成一个 entry，当我们
    //通过代码可以看出，当数据发生变化时还是需要手动发出通知。
    // 通过调用notifyPropertyChanged(BR.firstName)来通知系统 BR.firstName 这个 entry 的数据已经发生变化，需要更新 UI。

    private String content; //内容

    public DoubleBindBean(String content) {
        this.content = content;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyPropertyChanged(BR.content);
    }
}
