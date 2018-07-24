package com.example.yhadmin.mvvmdemo;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.example.yhadmin.mvvmdemo
 *  @文件名:   InitRecyclerView
 *  @创建者:   YHAdmin
 *  @创建时间:  2018/7/23 17:46
 *  @描述：    TODO
 */

import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class InitRecyclerView {
    public static void initLinearLayoutVERTICAL(Context context, RecyclerView recyclerView){
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    public static void initLinearLayoutWithoutDivid(Context context,RecyclerView recyclerView){
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    public static void initLinearLayoutHorizontal(Context context,RecyclerView recyclerView){
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    public static void initStaggered(Context context,RecyclerView recyclerView){
        StaggeredGridLayoutManager sgm = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(sgm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

}
