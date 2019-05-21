package com.example.uts_akb_ammarrifqula_10116116;

import android.content.Intent;

import android.os.Handler;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;



public class SplashScreen extends AppCompatActivity {

    private int waktu_loading;
    protected Bundle savedInstanceState;

    public SplashScreen() {
        waktu_loading = 2000;
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);



        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {



                //setelah loading maka akan langsung berpindah ke home activity

                Intent home=new Intent(SplashScreen.this, Awal.class);

                startActivity(home);

                finish();



            }

        },waktu_loading);

    }

}


