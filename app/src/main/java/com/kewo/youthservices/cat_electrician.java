package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_electrician extends AppCompatActivity {
Button e_domestic, e_general;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_electrician);
        e_domestic = findViewById(R.id.electrician_domestic);
        e_domestic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Electrician (Domestic)");
                startActivity(i);
            }
        });
        e_general = findViewById(R.id.general_electrician);
        e_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","General Electrician");
                startActivity(i);
            }
        });
    }
}
