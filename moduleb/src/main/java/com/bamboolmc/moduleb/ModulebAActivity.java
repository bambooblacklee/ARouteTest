package com.bamboolmc.moduleb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bamboolmc.modulebase.utils.RouteUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = RouteUtils.ModuleB_Activity1)
public class ModulebAActivity extends AppCompatActivity {

    @BindView(R2.id.tv_moduleb_a)
    TextView mTextView;

    @BindView(R2.id.bt_moduleb_a)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testb);
        ButterKnife.bind(this);

        mTextView.setText("我是ModuleB的第1个TextActivity");

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouteUtils.ModuleB_Activity2).navigation();
            }
        });



    }
}
