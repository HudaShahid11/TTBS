package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_auto extends AppCompatActivity {
Button auto_mechanic,auto_denter,auto_electrician;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_auto);
        auto_mechanic = findViewById(R.id.auto_mechanic);
        auto_mechanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Auto Mechanic");
                startActivity(i);
            }
        });
        auto_denter = findViewById(R.id.auto_denter);
        auto_denter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Auto Denter (Panel Beater)");
                startActivity(i);
            }
        });
        auto_electrician = findViewById(R.id.auto_elctrician);
        auto_electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Auto Electrician");
                startActivity(i);
            }
        });
    }
}
