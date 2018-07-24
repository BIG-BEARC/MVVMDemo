package com.example.yhadmin.mvvmdemo;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo
 *  @文件名:   ViewHolder
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 16:05
 *  @描述：    TODO
 */

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ViewHolder
        extends RecyclerView.ViewHolder
{
    private ViewDataBinding binding;

    public void setBinding(ViewDataBinding binding) {
        this.binding = binding;
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

    public ViewHolder(View itemView) {
        super(itemView);
    }
}
