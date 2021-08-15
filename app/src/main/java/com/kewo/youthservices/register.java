package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class register extends AppCompatActivity {
Button login, signup,register_ser,email;
Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        session = new Session(getApplicationContext());
        if(session.getlogin()){
            startActivity(new Intent(getApplicationContext(),home.class));
        }
        login = findViewById(R.id.login);
        login.setOnClickListener(v -> {
            Intent i = new Intent(getBaseContext(),login.class);
            startActivity(i);
        });
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(v -> {
            Intent i = new Intent(getBaseContext(),signup.class);
            startActivity(i);
        });
        register_ser= findViewById(R.id.register_ser);
        register_ser.setOnClickListener(v -> {
                Intent i = new Intent(getBaseContext(),service_provider_form.class);
                startActivity(i);

        });
        email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"info@kewo.org"}); // recipients
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Certificate of service provider");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Name:\nCNIC:\nNote: Write Name and CNIC. Then, attach certificate, and click send button");
                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(register.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
