package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView first,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        first = findViewById(R.id.tv1a1);
        second = findViewById(R.id.tv2a2);

        Intent intent = getIntent();
        String content = intent.getStringExtra("data");

        first.setText("Welcome to "+content);
        second.setText(content+" is awesome!!");

    }
}