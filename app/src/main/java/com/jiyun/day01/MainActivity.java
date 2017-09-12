package com.jiyun.day01;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG","onDestroy");
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.e("TAG","onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("TAG","onRestoreInstanceState");
    }


    //横竖屏切换时会调用
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("TAG", "onConfigurationChanged");
    }

}
