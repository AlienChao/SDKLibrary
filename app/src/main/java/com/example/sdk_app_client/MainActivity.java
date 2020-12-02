package com.example.sdk_app_client;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sdk.MyStringUtil;

public class MainActivity extends AppCompatActivity {

    private TextView tvApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvApp = (TextView) findViewById(R.id.tv_app);
        tvApp.setText(MyStringUtil.ndkString());
    }
}