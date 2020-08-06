package com.example.calcshabalkova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView);
        final Button btDot = findViewById(R.id.button_);
        final Button bt0 = findViewById(R.id.button0);
        final Button bt1 = findViewById(R.id.button1);
        final Button bt2 = findViewById(R.id.button2);
        final Button bt3 = findViewById(R.id.button3);
        final Button bt4 = findViewById(R.id.button4);
        final Button bt5 = findViewById(R.id.button5);
        final Button bt6 = findViewById(R.id.button6);
        final Button bt7 = findViewById(R.id.button7);
        final Button bt8 = findViewById(R.id.button8);
        final Button bt9 = findViewById(R.id.button9);

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(btDot, textView);
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt0, textView);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt1, textView);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt2, textView);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt3, textView);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt4, textView);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt5, textView);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt6, textView);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt7, textView);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt8, textView);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt9, textView);
            }
        });

    }
    public static void addText(Button btn, TextView txt){
        String text = txt.getText().toString();
        text = text+btn.getText().toString();
        txt.setText(text);
    }
}