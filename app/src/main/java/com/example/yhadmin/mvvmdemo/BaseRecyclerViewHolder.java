package com.example.yhadmin.mvvmdemo;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo
 *  @文件名:   BaseRecyclerViewHolder
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 17:00
 *  @描述：    TODO
 */

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class BaseRecyclerViewHolder<T, D extends ViewDataBinding>
        extends RecyclerView.ViewHolder
{
    public D binding;

    public BaseRecyclerViewHolder(ViewGroup parent, @LayoutRes int layoutId) {
        super(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                                      layoutId,
                                      parent,
                                      false)
                             .getRoot());
        binding = DataBindingUtil.getBinding(itemView);
    }

    public void onBaseBindViewHolder(T t, int position) {
        onBindViewHolder(t, position);
        binding.executePendingBindings();//解决数据闪烁问题
    }

    public abstract void onBindViewHolder(T t, int position);

}
