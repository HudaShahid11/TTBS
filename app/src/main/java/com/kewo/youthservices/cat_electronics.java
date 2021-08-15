package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_electronics extends AppCompatActivity {
Button general_electronics,elect_tech,industrial_elect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_electronics);
        general_electronics = findViewById(R.id.general_electronics);
        general_electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","General Electronics");
                startActivity(i);
            }
        });
        elect_tech = findViewById(R.id.electronics_technician);
        elect_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Electronics Technician");
                startActivity(i);
            }
        });
        industrial_elect = findViewById(R.id.industrial_electronics);
        industrial_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Industrial Electronics");
                startActivity(i);
            }
        });
    }
}
