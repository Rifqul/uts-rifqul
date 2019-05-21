package com.example.uts_akb_ammarrifqula_10116116;

import android.Manifest;

import android.content.Intent;

import android.content.pm.PackageManager;

import android.net.Uri;

import android.os.Bundle;

import android.support.v4.app.ActivityCompat;

import android.support.v4.app.Fragment;

import android.support.v4.content.ContextCompat;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;





/**

 * A simple {@link Fragment} subclass.

 */

public class Telepon extends Fragment {

    View myView;

    Button call1,call2;



    public Telepon() {

        // Required empty public constructor

    }





    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        myView =inflater.inflate(R.layout.fragment_telepon, container, false);

        call1 = myView.findViewById(R.id.btn_call1);

        call2 = myView.findViewById(R.id.btn_call2);



        call1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                Intent callIntent = new Intent(Intent.ACTION_CALL);

                callIntent.setData(Uri.parse("tel:" + "082242609620"));

                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(callIntent);

            }



        });



        call2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);

                callIntent.setData(Uri.parse("tel:" + "0892231245"));

                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(callIntent);

            }

        });







        return myView;







    }







}