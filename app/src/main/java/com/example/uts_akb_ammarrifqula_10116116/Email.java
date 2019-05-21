package com.example.uts_akb_ammarrifqula_10116116;

import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;

import android.widget.Toast;



import com.example.uts_akb_ammarrifqula_10116116.R;



/**

 * A simple {@link Fragment} subclass.

 */

public class Email extends Fragment {

    View myView;

    Button send1,send2;



    public Email() {

        // Required empty public constructor

    }





    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {



        myView = inflater.inflate(R.layout.fragment_email, container, false);

        // Inflate the layout for this fragment

        send1 = myView.findViewById(R.id.email1);

        send2 =  myView.findViewById(R.id.email2);



        send1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"ammarriefqul@gmail.com"});

                intent.putExtra(intent.EXTRA_SUBJECT, "Primus Suggestion or Issue");

                intent.setType("text/plain");

                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {

                    getActivity().startActivity(Intent.createChooser(intent, "Send Email using:"));

                }

                else {

                    Toast.makeText(getActivity(), "You don't have any email apps to contact us.", Toast.LENGTH_SHORT).show();

                }

            }

        });



        send2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"ammarrifqul@mahasiswa.unikom.ac.id"});

                intent.putExtra(intent.EXTRA_SUBJECT, "Primus Suggestion or Issue");

                intent.setType("text/plain");

                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {

                    getActivity().startActivity(Intent.createChooser(intent, "Send Email using:"));

                }

                else {

                    Toast.makeText(getActivity(), "You don't have any email apps to contact us.", Toast.LENGTH_SHORT).show();

                }

            }

        });









        return myView;

    }



}
