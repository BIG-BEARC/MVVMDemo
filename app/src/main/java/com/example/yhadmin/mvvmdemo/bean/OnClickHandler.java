package com.example.yhadmin.mvvmdemo.bean;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo.bean
 *  @文件名:   OnClickHandler
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 15:37
 *  @描述：    TODO
 */

import android.view.View;
import android.widget.Toast;

public class OnClickHandler {
    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }
}
