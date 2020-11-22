package com.example.launchmodel.Network;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.myapplication.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class NetworkActivity extends Activity {

    private TextView mTvRequest;
    private TextView mTvResponse;
    private final String url = "https://www.baidu.com/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        mTvRequest = findViewById(R.id.tv_request);
        mTvResponse = findViewById(R.id.tv_response);

        mTvRequest.setOnClickListener(v -> {

            new Thread() {
                @Override
                public void run() {
                    HttpURLConnection connection = null;
                    try {
                        URL uri = new URL(url);
                        connection = (HttpURLConnection) uri.openConnection();
                        connection.setRequestMethod("GET");
                        connection.setReadTimeout(5000);
                        connection.setConnectTimeout(10000);

                        if (200 == connection.getResponseCode()) {
                            InputStream is = connection.getInputStream();
                            String response = getStringFromInputStream(is);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    mTvResponse.setText(response);
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (connection != null) {
                            connection.disconnect();
                        }
                    }
                }
            }.start();


        });

    }

    private static String getStringFromInputStream(InputStream is) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        // 模板代码 必须熟练
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        is.close();
        String state = os.toString();// 把流中的数据转换成字符串,采用的编码是utf-8(模拟器默认编码)
        os.close();
        return state;
    }
}
