package com.bamboolmc.aroutetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bamboolmc.modulebase.BaseActivity;
import com.bamboolmc.modulebase.utils.RouteUtils;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R2.id.bt_test2)
    Button mbt_test2;
    @BindView(R2.id.bt_module_a)
    Button mbt_module_a;
    @BindView(R2.id.bt_module_b)
    Button mbt_module_b;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mbt_test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.App_Activity_Test2).navigation();

            }
        });

        mbt_module_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.ModuleA_Activity1).navigation();

            }
        });

        mbt_module_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.ModuleB_Activity1).navigation();

            }
        });

    }

}
