package com.example.uts_akb_ammarrifqula_10116116;

import android.content.ActivityNotFoundException;

import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;

import com.example.uts_akb_ammarrifqula_10116116.R;


/**

 * A simple {@link Fragment} subclass.

 */

public class SocialMedia extends Fragment {

    View myView;

    Button instagram,facebook;



    public SocialMedia() {

        // Required empty public constructor

    }





    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        myView = inflater.inflate(R.layout.fragment_social_media, container, false);

        instagram = myView.findViewById(R.id.btn_instagram);

        facebook = myView.findViewById(R.id.btn_facebook);



        instagram.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.instagram.com/riefqul_99/");

                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);



                likeIng.setPackage("com.instagram.android");



                try {

                    startActivity(likeIng);

                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,

                            Uri.parse("https://www.instagram.com/riefqul_99/")));

                }

            }

        });



        facebook.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Uri uri = Uri.parse("http://www.facebook.com/ammarriefqul");

                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);



                likeIng.setPackage("com.facebook.android");



                try {

                    startActivity(likeIng);

                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,

                            Uri.parse("http://www.facebook.com/ammarriefqul")));

                }

            }

        });



        return myView;

    }



}