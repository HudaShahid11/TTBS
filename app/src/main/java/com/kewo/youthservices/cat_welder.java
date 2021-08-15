package com.kewo.youthservices;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cat_welder extends AppCompatActivity {
Button g,d,pe,steel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_welder);
        g = findViewById(R.id.g_welder);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","General Welder");
                startActivity(i);
            }
        });
        d = findViewById(R.id.welder_d);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Welder (Domestic)");
                startActivity(i);
            }
        });
        steel = findViewById(R.id.steel_welding);
        steel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Steel Welding");
                startActivity(i);
            }
        });
        pe = findViewById(R.id.pe_welding);
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","PE Welder");
                startActivity(i);
            }
        });
    }
}
