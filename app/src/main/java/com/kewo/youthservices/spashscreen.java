package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class spashscreen extends AppCompatActivity {
    private static  int t =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spashscreen);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent intent= new Intent(spashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },t);
    }
}
