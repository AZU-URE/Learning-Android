package com.example.implictactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView quote,share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quote = findViewById(R.id.tvQuote);
        share = findViewById(R.id.tvShare);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shrText = quote.getText().toString();
                Intent shrIntent = new Intent();
                shrIntent.setAction(Intent.ACTION_SEND);
                shrIntent.setType("Text/Plain");
                shrIntent.putExtra(Intent.EXTRA_TEXT,shrText);

                startActivity(shrIntent);
            }
        });

    }
}