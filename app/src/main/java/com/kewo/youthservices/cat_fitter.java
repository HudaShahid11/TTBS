package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cat_fitter extends AppCompatActivity {
Button gen_fitter,gas_fitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_fitter);
        gen_fitter = findViewById(R.id.general_fitter);
        gen_fitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","General Fitter");
                startActivity(i);
            }
        });
        gas_fitter = findViewById(R.id.gas_fitter);
        gas_fitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Gas Fitter");
                startActivity(i);
            }
        });
    }
}
