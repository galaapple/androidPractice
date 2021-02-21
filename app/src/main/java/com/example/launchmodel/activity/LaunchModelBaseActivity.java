package com.example.launchmodel.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.launchmodel.constant.Constants;
import com.example.myapplication.R;

import java.lang.ref.ReferenceQueue;

public abstract class LaunchModelBaseActivity extends Activity {

    private static int count = 0;
    private String TAG = Constants.MY_TAG + getClass().getSimpleName() + " NO." + count;
    protected TextView mTvTitle;
    protected TextView mTvAction;
    protected TextView mTvAction2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        count++;
        Log.i(TAG, "onCreate");
        setContentView(R.layout.activity_base_launch_model);
        mTvTitle = findViewById(R.id.tv_title);
        mTvAction = findViewById(R.id.tv_action);
        mTvAction2 = findViewById(R.id.tv_action_2);
        mTvTitle.setText(TAG);
        ClassLoader classLoader = getClassLoader();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "onNewIntent");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");

    }

}
