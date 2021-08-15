package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static  int t =3000;
    Button cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        new Handler().postDelayed(new Runnable(){
//
//            @Override
//            public void run() {
//                Intent intent= new Intent(MainActivity.this,register.class);
//                startActivity(intent);
//                finish();
//            }
//        },t);

//        final TextView first = (TextView) findViewById(R.id.first);
//        final TextView second = (TextView) findViewById(R.id.second);
//
//        final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
//        animator.setRepeatCount(ValueAnimator.INFINITE);
//        animator.setInterpolator(new LinearInterpolator());
//        animator.setDuration(9000L);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                final float progress = (float) animation.getAnimatedValue();
//                final float width = first.getWidth();
//                final float translationX = width * progress;
//                first.setTranslationX(translationX);
//                second.setTranslationX(translationX - width);
//            }
//        });
        cont = findViewById(R.id.cont);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),register.class);
                startActivity(i);
            }
        });
    }
}
