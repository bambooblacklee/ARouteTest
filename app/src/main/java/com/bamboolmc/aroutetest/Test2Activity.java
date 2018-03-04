package com.bamboolmc.aroutetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bamboolmc.modulebase.utils.RouteUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = RouteUtils.App_Activity_Test2)
public class Test2Activity extends AppCompatActivity {

    @BindView(R2.id.tv_test2)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
//        TextView mTextView =(TextView)findViewById(R.id.tv_test2) ;
        ButterKnife.bind(this);
        mTextView.setText("我是跳转过来app/Test2");
    }
}
