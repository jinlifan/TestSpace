package com.example.administrator.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TV = (TextView)findViewById(R.id.tv);
        Toast.makeText(this, "我做了修改", Toast.LENGTH_SHORT).show();
    }
}
