package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class into extends AppCompatActivity {
    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move=findViewById(R.id.submit_btn);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                Intent intent=new Intent(into.this,quiz1.class);
                        startActivity(intent);
            }
        });
    }

}
