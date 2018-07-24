package com.example.yhadmin.mvvmdemo;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo
 *  @文件名:   BindingUtil
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 17:26
 *  @描述：    TODO
 */

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class BindingUtil {
    @BindingAdapter("studentAvatar")
    public static void showImgByUrl(ImageView imageView,int resId){
        imageView.setImageResource(resId);
    }
}
