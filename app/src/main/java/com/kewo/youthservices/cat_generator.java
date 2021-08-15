package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_generator extends AppCompatActivity {
Button gen_mec,gen_tech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_generator);
        gen_mec = findViewById(R.id.generator_mechanic);
        gen_mec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Generator Mechanic");
                startActivity(i);
            }
        });
        gen_tech = findViewById(R.id.gen_tech);
        gen_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Generator Mechanic Technician");
                startActivity(i);
            }
        });
    }
}
