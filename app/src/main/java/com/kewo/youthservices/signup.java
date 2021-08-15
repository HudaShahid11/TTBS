package com.kewo.youthservices;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class signup extends AppCompatActivity implements View.OnClickListener {
    private EditText username, password, confirm_password, email, phone_number;
    Button submit;
    Session session;
    Url url = new Url();
    String link = url.getUrl();
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirm_password);
        email = findViewById(R.id.email);
        phone_number = findViewById(R.id.phone_number);



        session = new Session(getApplicationContext());
        dialog = new ProgressDialog(this);
        if(session.getlogin()){
            startActivity(new Intent(getApplicationContext(),home.class));
        }
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }
    private void insertUser(){
        //Here we will handle the http request to insert user to mysql db
        //Creating a RestAdapter
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(link) //Setting the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        signup_api api = adapter.create(signup_api.class);

        //Defining the method insertuser of our interface
        api.insertUser(

                //Passing the values by getting it from editTexts

                username.getText().toString(),
                email.getText().toString(),
                password.getText().toString(),
                phone_number.getText().toString(),

                //Creating an anonymous callback
                new Callback<Response>() {


                    @Override
                    public void success(Response result, Response response) {
                        //On success we will read the server's output using bufferedreader
                        //Creating a bufferedreader object
                        dialog.dismiss();
                        BufferedReader reader = null;

                        //An string to store output from the server
                        String output = "";

                        try {
                            //Initializing buffered reader
                            reader = new BufferedReader(new InputStreamReader(result.getBody().in()));

                            //Reading the output in the string
                            output = reader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        if(output.equals("Something went wrong") || output.equals("Empty Fields") || output.equals("Not a Post request")){
                            AlertDialog.Builder builder
                                    = new AlertDialog
                                    .Builder(signup.this);


                            builder.setMessage(output);
                            builder.setTitle("Error");
                            builder.setCancelable(false);
                        /*builder.setPositiveButton(
                                        "Exit",
                                        (dialog, which) -> {

                                            // When the user click yes button
                                            // then app will close
                                            finish();
                                        });*/
                            builder
                                    .setNegativeButton(
                                            "Ok",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.cancel();
                                                }
                                            });
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                        }
                        else{
                            session.setlogin(true);
                            session.setid(output);
                            Intent intent;
                            intent = new Intent(getBaseContext(),home.class);
                            startActivity(intent);
                            finish();
                        }

                    }



                    @Override
                    public void failure(RetrofitError error) {
                        dialog.dismiss();
                        AlertDialog.Builder builder
                                = new AlertDialog
                                .Builder(signup.this);


                        builder.setMessage("Try Again!!");
                        builder.setTitle("Error");
                        builder.setCancelable(false);
                        /*builder.setPositiveButton(
                                        "Exit",
                                        (dialog, which) -> {

                                            // When the user click yes button
                                            // then app will close
                                            finish();
                                        });*/
                        builder
                                .setNegativeButton(
                                        "Ok",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                dialog.cancel();
                                            }
                                        });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                }
        );
    }
    @Override
    public void onClick(View v) {
        //Calling insertUser on button click
        if(username.getText().toString().trim().length() == 0 || email.getText().toString().trim().length() == 0 ||
                phone_number.getText().toString().trim().length() == 0 || password.getText().toString().trim().length() == 0
                ||confirm_password.getText().toString().trim().length() == 0 ){
            Toast.makeText(this,"Fill all fields",Toast.LENGTH_LONG).show();
        }
        else if(!(password.getText().toString().equals(confirm_password.getText().toString()))){
            Toast.makeText(this,"Password and Confirm password are not matched!!",Toast.LENGTH_LONG).show();
        }
        else{
            dialog.setTitle("Loading...");
            dialog.setMessage("Please wait...");
            dialog.setCancelable(false); // disable dismiss by tapping outside of the dialog
            dialog.show();
            insertUser();
        }

    }
}
