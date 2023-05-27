package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quiz1 extends AppCompatActivity {

    private Button move1;
    private Button move2;

    private Button move3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        move1 = findViewById(R.id.ch1_bt);
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quiz1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        move2 = findViewById(R.id.ch2_bt);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quiz1.this, Programming.class);
                startActivity(intent);
            }
        });

        move3 = findViewById(R.id.ch3_bt);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quiz1.this, Security.class);
                startActivity(intent);
            }
        });
                                 }
    }









