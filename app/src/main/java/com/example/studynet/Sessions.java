package com.example.studynet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sessions extends AppCompatActivity {
    private Button btn_sessions1;
    private Button btn_sessions2;
    private Button btn_sessions3;
    private Button btn_sessions4;
    private Button btn_sessions5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions);

        btn_sessions1 = (Button) findViewById(R.id.btn_sessions1);
        btn_sessions2 = (Button) findViewById(R.id.btn_sessions2);
        btn_sessions3 = (Button) findViewById(R.id.btn_sessions3);
        btn_sessions4 = (Button) findViewById(R.id.btn_sessions4);
        btn_sessions5 = (Button) findViewById(R.id.btn_sessions5);

        btn_sessions1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(Sessions.this, Sessions1.class);
                startActivity(intent_session);
            }
        });

        btn_sessions2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(Sessions.this, Sessions2.class);
                startActivity(intent_session);
            }
        });

        btn_sessions3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(Sessions.this, Sessions3.class);
                startActivity(intent_session);
            }
        });

        btn_sessions4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(Sessions.this, Sessions4.class);
                startActivity(intent_session);
            }
        });

        btn_sessions5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(Sessions.this, Sessions5.class);
                startActivity(intent_session);
            }
        });
    }
}