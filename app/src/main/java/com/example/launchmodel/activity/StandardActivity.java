package com.example.launchmodel.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class StandardActivity extends LaunchModelBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mTvAction.setText("Jump Single Top");
//        mTvAction.setOnClickListener(v -> {
//            Intent intent = new Intent(this, SingleTopActivity.class);
//            startActivity(intent);
//        });

//        mTvAction.setText("Jump Single Task");
//        mTvAction.setOnClickListener(v -> {
//            Intent intent = new Intent(this, SingleTaskActivity.class);
//            startActivity(intent);
//        });

        mTvAction.setText("Jump Single Instance");
        mTvAction.setOnClickListener(v -> {
            Intent intent = new Intent(this, SingleInstanceActivity.class);
            startActivity(intent);
        });

        mTvAction2.setText("Jump Standard");
        mTvAction2.setOnClickListener(v -> {
            Intent intent = new Intent(this, StandardActivity.class);
            startActivity(intent);
        });
    }
}
