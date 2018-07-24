package com.example.yhadmin.mvvmdemo;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo
 *  @文件名:   SimpleAdapter
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 16:15
 *  @描述：    TODO
 */

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class SimpleAdapter<T>
        extends RecyclerView.Adapter<ViewHolder>
{

    private List<T> mData;
    private int     layoutId;
    private int     brId;

    public SimpleAdapter(List<T> data, int layoutId, int brId) {
        this.mData = data;
        this.layoutId = layoutId;
        this.brId = brId;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                                                          layoutId,
                                                          parent,
                                                          false);
        ViewHolder viewHolder = new ViewHolder(binding.getRoot());
        viewHolder.setBinding(binding);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getBinding()
              .setVariable(brId, mData.get(position));
        holder.getBinding()
              .executePendingBindings();//解决数据闪烁问题
    }

    @Override
    public int getItemCount() {
        return mData == null
               ? 0
               : mData.size();
    }
}
