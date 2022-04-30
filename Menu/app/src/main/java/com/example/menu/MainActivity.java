package com.example.menu;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView menu1 = (TextView) findViewById(R.id.menu_item_1);
        String message1 = menu1.getText().toString();
        Log.v("MainActivity",message1);
        // Find second menu item TextView and print the text to the logs
        TextView menu2 = (TextView) findViewById(R.id.menu_item_2);
        String message2 = menu2.getText().toString();
        Log.v("MainActivity",message2);
        // Find third menu item TextView and print the text to the logs
        TextView menu3 = (TextView) findViewById(R.id.menu_item_3);
        String message3 = menu3.getText().toString();
        Log.v("MainActivity",message3);
    }
}
