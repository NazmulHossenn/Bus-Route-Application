package com.example.busrouteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Bus_List extends AppCompatActivity {
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);

        listview=(ListView) findViewById(R.id.listview);
        String[] busList = getResources().getStringArray(R.array.buslist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Bus_List.this,R.layout.sample_view,R.id.textviewid,busList);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(Bus_List.this,Akash.class));
                    Toast.makeText(Bus_List.this, "Akash", Toast.LENGTH_SHORT).show();
                }
                else if (i==1){
                    startActivity(new Intent(Bus_List.this,Achim.class));
                    Toast.makeText(Bus_List.this, "Achim", Toast.LENGTH_SHORT).show();
                }
                else if (i==2){
                    startActivity(new Intent(Bus_List.this,Agradut.class));
                    Toast.makeText(Bus_List.this, "Agradut", Toast.LENGTH_SHORT).show();
                }
                else if (i==3){
                    startActivity(new Intent(Bus_List.this,Akik.class));
                    Toast.makeText(Bus_List.this, "Akik", Toast.LENGTH_SHORT).show();
                }
                else if (i==4){
                    startActivity(new Intent(Bus_List.this,Victor.class));
                    Toast.makeText(Bus_List.this, "Victor Classic", Toast.LENGTH_SHORT).show();
                }
                else if (i==5){
                    startActivity(new Intent(Bus_List.this,Vip.class));
                    Toast.makeText(Bus_List.this, "VIP 27", Toast.LENGTH_SHORT).show();
                }
                else if (i==6){
                    startActivity(new Intent(Bus_List.this,Anabil.class));
                    Toast.makeText(Bus_List.this, "Anabil", Toast.LENGTH_SHORT).show();
                }
            }
        });
            }
        }


