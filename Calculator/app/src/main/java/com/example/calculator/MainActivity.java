package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button plus,minus,multi,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.et1);
        etSecondValue = findViewById(R.id.et2);
        tvAns = findViewById(R.id.tvAns);
        plus = findViewById(R.id.bPlus);
        minus = findViewById(R.id.bMinus);
        multi = findViewById(R.id.bMulti);
        div = findViewById(R.id.bdiv);

        plus.setOnClickListener(v -> {
            int firstValue,secondValue,ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());
            ans = firstValue + secondValue;
            tvAns.setText("Ans is= "+ans);
        });

        minus.setOnClickListener(v -> {
            int firstValue,secondValue,ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());
            ans = firstValue - secondValue;
            tvAns.setText("Ans is= "+ans);
        });

        multi.setOnClickListener(v -> {
            int firstValue,secondValue,ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());
            ans = firstValue * secondValue;
            tvAns.setText("Ans is= "+ans);
        });

        div.setOnClickListener(v -> {
            int firstValue,secondValue,ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());
            ans = firstValue / secondValue;
            tvAns.setText("Ans is= "+ans);
        });

    }
}