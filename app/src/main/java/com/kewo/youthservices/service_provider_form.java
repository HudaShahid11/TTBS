package com.kewo.youthservices;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class service_provider_form extends AppCompatActivity implements View.OnClickListener {
    Spinner spinner_category;
    EditText first_name,last_name,father_name,email,cnic,address,phone_number,whatsapp_number,certifed_by;
    Button submit;
    Url url = new Url();
    String link = url.getUrl();
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_provider_form);
        spinner_category = findViewById(R.id.spinner_category);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner_category.setAdapter(adapter);
        dialog = new ProgressDialog(this);
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        father_name = findViewById(R.id.father_name);
        email = findViewById(R.id.email);
        cnic = findViewById(R.id.cnic);
        address = findViewById(R.id.address);
        phone_number = findViewById(R.id.phone_number);
        whatsapp_number = findViewById(R.id.whatsapp_number);
        certifed_by = findViewById(R.id.certified_by);
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
        service_provider_api api = adapter.create(service_provider_api.class);

        //Defining the method insertuser of our interface
        api.insertUser(

                //Passing the values by getting it from editTexts

                first_name.getText().toString(),
                last_name.getText().toString(),
                father_name.getText().toString(),
                email.getText().toString(),
                cnic.getText().toString(),
                address.getText().toString(),
                phone_number.getText().toString(),
                whatsapp_number.getText().toString(),
                certifed_by.getText().toString(),
                spinner_category.getSelectedItem().toString(),

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
                                    .Builder(service_provider_form.this);


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
                            Toast.makeText(service_provider_form.this,"Your Form has been submitted successfully",Toast.LENGTH_LONG).show();
                            Intent intent;
                            intent = new Intent(getBaseContext(),register.class);
                            startActivity(intent);
                            finish();
                        }

                    }



                    @Override
                    public void failure(RetrofitError error) {
                        dialog.dismiss();
                        AlertDialog.Builder builder
                                = new AlertDialog
                                .Builder(service_provider_form.this);


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
        if(first_name.getText().toString().trim().length() == 0 || last_name.getText().toString().trim().length() == 0 ||
                father_name.getText().toString().trim().length() == 0 || email.getText().toString().trim().length() == 0
                ||cnic.getText().toString().trim().length() == 0 || phone_number.getText().toString().trim().length() == 0 ||
                whatsapp_number.getText().toString().trim().length() == 0 || certifed_by.getText().toString().trim().length() == 0){
            Toast.makeText(this,"Fill all fields",Toast.LENGTH_LONG).show();
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
