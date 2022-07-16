package com.example.a4_5_2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    static final String TAG=MainActivity2.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
    }
    void initViews(){
        TextView consul=findViewById(R.id.tv_login_id);
        String login=getIntent().getStringExtra("login");
        Log.d(TAG,login);
        consul.setText(login);
    }
}