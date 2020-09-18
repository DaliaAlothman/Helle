package com.example.helle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);

        TextView v = (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        v.setText("Holle ,"+ i.getStringExtra("PersonName1"));

    }
}