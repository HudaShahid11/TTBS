package com.kewo.youthservices;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CourseDetail extends AppCompatActivity {
    TextView title, description,duration,cost,assessment,certification,responsive,publisher,info;
    ImageView image;
    CourseResponse userResponse;
    Button wapp,phone;
    RatingBar simpleRatingBar;

    TextView id,first_name,last_name,father_name,category,cer_by,trade,feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        id= findViewById(R.id.id);
        first_name=findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        father_name = findViewById(R.id.father_name);
        wapp=findViewById(R.id.wapp);
        phone = findViewById(R.id.phone);
        category = findViewById(R.id.category);
        cer_by= findViewById(R.id.cer_by);
        trade = findViewById(R.id.trade);
        simpleRatingBar=findViewById(R.id.simpleRatingBar);

        feedback = findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent feedback_page= new Intent(getBaseContext(),feedback.class);
//                startActivity(feedback_page);
                startActivity(new Intent(CourseDetail.this,feedback.class).putExtra("data",userResponse));
            }
        });
        Intent intent = getIntent();
        if(intent.getExtras() != null){
            userResponse = (CourseResponse) intent.getSerializableExtra("data");


            String id_data = userResponse.getId();
            String first_data = userResponse.getFirst_name();
            String last_data = userResponse.getLast_name();
            String father_data = userResponse.getFather_name();
            String category_data=userResponse.getCategory();
            String cer_data= userResponse.getCertified_by();
            String phone_data=userResponse.getPhone_number();
            String wapp_data = userResponse.getWhatsapp_number();
            String avg_rating_data = userResponse.getAvg_rating();

            id.setText(id_data);
            first_name.setText(first_data);
            last_name.setText(last_data);
            father_name.setText(father_data);
            category.setText(category_data);
            cer_by.setText(cer_data);
            trade.setText(category_data);
            simpleRatingBar.setRating(Float.parseFloat(avg_rating_data));

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri number = Uri.parse("tel:".concat(phone_data));
                    Intent callInent = new Intent(Intent.ACTION_DIAL,number);
                    startActivity(callInent);
                }
            });
            wapp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String text = "I want to contact you for ".concat(category_data);// Replace with your message.

                        String toNumber = wapp_data; // Replace with mobile phone number without +Sign or leading zeros, but with country code
                        //Suppose your country is India and your phone number is “xxxxxxxxxx”, then you need to send “91xxxxxxxxxx”.


                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
                        startActivity(i);
                    }
                    catch (Exception e){

                        Toast.makeText(CourseDetail.this,"You do not have Whatsapp installed in your phone",Toast.LENGTH_LONG).show();
                    }


                }
            });

//          Picasso.get().load(img_data).into(image);



//            info.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if(!userResponse.getCategory().equals("safecon_safety")){
//                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(info_data));
//                        startActivity(i);
//                    }
//
//                }
//            });

        }
    }

}
