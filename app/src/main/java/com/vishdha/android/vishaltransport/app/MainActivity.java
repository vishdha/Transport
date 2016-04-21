package com.vishdha.android.vishaltransport.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //set back button
//        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Initialize daily info , payment info , petrol info and about us image button
        ImageButton dailyinfo = (ImageButton) findViewById(R.id.Daily_challan);
        ImageButton petrolinfo  = (ImageButton) findViewById(R.id.Petrol_info);
        ImageButton paymentinfo = (ImageButton) findViewById(R.id.Payment_info);
        ImageButton Aboutus = (ImageButton) findViewById(R.id.About_u);

        //set a listener on dailyinfo action image button
        dailyinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dailyintent = new Intent(MainActivity.this, DailyInformation.class);
                MainActivity.this.startActivity(dailyintent);

            }
        });

        //set a listener on Petrol Information action image button
        petrolinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent petrolintent = new Intent(MainActivity.this, DieselInformation.class);
                MainActivity.this.startActivity(petrolintent);

            }
        });
//set a listener on Payment Information action image button
        paymentinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentintent = new Intent(MainActivity.this, paymentinformation.class);
                MainActivity.this.startActivity(paymentintent);

            }
        });

        //set a listener on About us Information action image button
       Aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutintent = new Intent(MainActivity.this, Aoutus.class);
                MainActivity.this.startActivity(aboutintent);

            }
        });
    }
    //set back button





}
