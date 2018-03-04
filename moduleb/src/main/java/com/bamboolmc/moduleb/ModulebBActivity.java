package com.bamboolmc.moduleb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bamboolmc.modulebase.BaseActivity;
import com.bamboolmc.modulebase.utils.RouteUtils;

import butterknife.BindView;

@Route(path = RouteUtils.ModuleB_Activity2)
public class ModulebBActivity extends BaseActivity {
    @BindView(R2.id.tv_moduleb_b)
    TextView mTextView;

    @BindView(R2.id.bt_moduleb_b)
    Button mButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_bb;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mTextView.setText("我是ModuleB的第2个TextActivity");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ARouter.getInstance().build(RouteUtils.)
            }
        });

    }


}
