package com.example.busrouteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btnlist,btnsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlist=findViewById(R.id.btnlist);
        btnsearch=findViewById(R.id.btnsearch);

        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Bus_List.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this, "Bus List", Toast.LENGTH_SHORT).show();
                    }
                });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this, "Find your bus", Toast.LENGTH_SHORT).show();
            }
        });
    }
}