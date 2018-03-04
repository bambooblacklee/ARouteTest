package com.bamboolmc.modulebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initViews(savedInstanceState);

    }
    protected abstract int getLayoutId();

    protected abstract void initViews(Bundle savedInstanceState);
}
