package com.example.launchmodel.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import static android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;

public class SingleTopActivity extends LaunchModelBaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTvAction.setText("Jump Single Top");
        mTvAction.setOnClickListener((v) -> {
            Intent intent = new Intent(this, SingleTopActivity.class);
            intent.setFlags(FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        });
    }
}
