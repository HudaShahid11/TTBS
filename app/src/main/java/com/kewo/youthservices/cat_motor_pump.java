package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_motor_pump extends AppCompatActivity {
Button mech,operator,tech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_motor_pump);
        mech = findViewById(R.id.mp_mechanic);
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Motor Pump Mechanic");
                startActivity(i);
            }
        });
        operator = findViewById(R.id.mp_operator);
        operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Motor Pump Operator");
                startActivity(i);
            }
        });
        tech = findViewById(R.id.mp_technician);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Motor Pump Technician");
                startActivity(i);
            }
        });
    }
}
