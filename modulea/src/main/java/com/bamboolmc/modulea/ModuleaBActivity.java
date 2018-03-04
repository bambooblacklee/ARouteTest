package com.bamboolmc.modulea;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bamboolmc.modulebase.BaseActivity;
import com.bamboolmc.modulebase.utils.RouteUtils;

import butterknife.BindView;

@Route(path = RouteUtils.ModuleA_Activity2)
public class ModuleaBActivity extends BaseActivity {

    @BindView(R2.id.tv_modulea_b)
    TextView mTextView;

    @BindView(R2.id.bt_modulea_b)
    Button mButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_modulea_b;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mTextView.setText("我是第A个模块儿的第二个Activity");

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.ModuleB_Activity1).navigation();
            }
        });

    }

}
