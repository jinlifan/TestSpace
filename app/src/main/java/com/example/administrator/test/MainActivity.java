package com.example.administrator.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "开发新代码", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "修复代码bug22222222222", Toast.LENGTH_SHORT).show();

 Toast.makeText(this, "同事代码", Toast.LENGTH_SHORT).show();
    }
}
