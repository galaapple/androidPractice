package com.example.launchmodel.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class SingleTaskActivity extends LaunchModelBaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTvAction.setText("Jump Standard");
        mTvAction.setOnClickListener(v -> {
            Intent intent = new Intent(this, StandardActivity.class);
            startActivity(intent);
        });

//        mTvAction.setText("Jump Single Task");
//        mTvAction.setOnClickListener(v -> {
//            Intent intent = new Intent(this, SingleTaskActivity.class);
//            startActivity(intent);
//        });
    }
}
