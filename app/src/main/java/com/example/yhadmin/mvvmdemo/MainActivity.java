package com.example.yhadmin.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.yhadmin.mvvmdemo.bean.DoubleBindBean;
import com.example.yhadmin.mvvmdemo.bean.DoubleBindBean2;
import com.example.yhadmin.mvvmdemo.bean.OnClickHandler;
import com.example.yhadmin.mvvmdemo.bean.Student;
import com.example.yhadmin.mvvmdemo.bean.User;
import com.example.yhadmin.mvvmdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity
        extends AppCompatActivity
        implements View.OnClickListener
{

    private boolean mFlag2;
    private boolean flag2;
    private DoubleBindBean doubleBindBean;
    private DoubleBindBean2 doubleBindBean2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,
                                                                     R.layout.activity_main);
        User user = new User();
        user.setName("张三");
        user.setAge("12");
        //绑定数据
        binding.setUser(user);
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        binding.setList(list);

        HashMap<String, Object> map = new HashMap<>();
        map.put("key0", "map_value0");
        map.put("key1", "map_value1");
        binding.setMap(map);

        String[] arrays = {"字符串1", "字符串2"};
        binding.setArray(arrays);
        com.example.yhadmin.mvvmdemo.bean.bean.User user1 = new com.example.yhadmin.mvvmdemo.bean.bean.User("user2",15);
        binding.setUser2(user1);
        binding.setClickListener(this);
        binding.setHandler(new OnClickHandler());



        List<Student> students = new ArrayList<>();
        Student       student  = new Student(R.drawable.splash,"Kate");
        students.add(student);
        student = new Student(R.drawable.toast_negative,"Kate");
        students.add(student);
        student = new Student(R.drawable.toast_normal,"Johnson");
        students.add(student);
        student = new Student(R.drawable.toast_positive,"Make");
        students.add(student);

        SimpleAdapter<Student> simpleAdapter = new SimpleAdapter<>(students,
                                                                   R.layout.student_item,
                                                                   com.example.yhadmin.mvvmdemo.BR.student);
        InitRecyclerView.initLinearLayoutVERTICAL(this,binding.showList);
        binding.showList.setAdapter(simpleAdapter);

        doubleBindBean = new DoubleBindBean("我是原始内容");
        binding.setDoubleBindBean(doubleBindBean);

        doubleBindBean2 = new DoubleBindBean2();
        doubleBindBean2.username.set("我是原始内容2");
        binding.setDoubleBindBean2(doubleBindBean2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.userName_btn:
                Toast.makeText(this, "点击了userName_btn", Toast.LENGTH_SHORT).show();
                //ObservableFields
                flag2 = !flag2;
                if (flag2) {
                    doubleBindBean2.username.set("我是更新后的内容2");
                } else {
                    doubleBindBean2.username.set("我是原始内容2");
                }

                 break;
            case R.id.age_btn:
                Toast.makeText(this, "点击了age_btn", Toast.LENGTH_SHORT).show();
                //ObservableFields
                mFlag2 = !mFlag2;
                if (mFlag2) {
                    doubleBindBean.setContent("我是更新后的内容");
                } else {
                    doubleBindBean.setContent("我是原始内容");
                }


                break;
            default:
                 break;
        }
    }
}
