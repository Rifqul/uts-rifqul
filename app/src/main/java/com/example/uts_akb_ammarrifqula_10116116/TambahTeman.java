package com.example.uts_akb_ammarrifqula_10116116;

import android.content.Intent;

import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;

import android.widget.EditText;





/**

 * A simple {@link Fragment} subclass.

 */

public class TambahTeman extends Fragment {

    public static String KEY_ACTIVITY = "msg_activity";

    EditText masuk;

    Button btn;



    View myView;

    public TambahTeman() {

        // Required empty public constructor

    }





    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        myView=inflater.inflate(R.layout.fragment_tambah_teman, container, false);



        return inflater.inflate(R.layout.fragment_tambah_teman, container, false);

    }



}