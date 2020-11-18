package com.example.launchmodel.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;


public class SingleInstanceActivity extends LaunchModelBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTvAction.setText("Jump Standard");
        mTvAction.setOnClickListener(v -> {
            Intent intent = new Intent(this, StandardActivity.class);
            startActivity(intent);
        });
    }
}
