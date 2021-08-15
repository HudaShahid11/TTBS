package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_computer extends AppCompatActivity {
Button comp_hard,comp_operator,data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_computer);
        comp_hard = findViewById(R.id.comp_hardware);
        comp_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Computer Hardware Maintenance");
                startActivity(i);
            }
        });
        comp_operator = findViewById(R.id.comp_operator);
        comp_operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Computer Operator");
                startActivity(i);
            }
        });
        data = findViewById(R.id.data_entry);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Data Entry Operator");
                startActivity(i);
            }
        });
    }
}
