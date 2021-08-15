package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_refrigeration extends AppCompatActivity {
Button domestic, tech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_refrigeration);
        domestic = findViewById(R.id.domestic);
        domestic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Refrigeration and Air Conditioning (Domestic)");
                startActivity(i);
            }
        });
        tech = findViewById(R.id.tech);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Refrigeration and Air Conditioning Technician");
                startActivity(i);
            }
        });
    }
}
