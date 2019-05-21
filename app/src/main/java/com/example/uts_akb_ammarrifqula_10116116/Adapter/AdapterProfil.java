package com.example.uts_akb_ammarrifqula_10116116.Adapter;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentStatePagerAdapter;



import com.example.uts_akb_ammarrifqula_10116116.Deskripsi;

import com.example.uts_akb_ammarrifqula_10116116.Informasi;

import com.example.uts_akb_ammarrifqula_10116116.Profil;





public class AdapterProfil extends FragmentStatePagerAdapter {


    private int mNoOfTabs;



    public AdapterProfil(FragmentManager fm, int NumberOfTabs)

    {

        super(fm);

        this.mNoOfTabs = NumberOfTabs;

    }







    @Override

    public Fragment getItem(int position) {

        switch(position)

        {



            case 0:

                Profil tab1;
                tab1 = new Profil();

                return tab1;

            case 1:

                Deskripsi tab2;
                tab2 = new Deskripsi();

                return  tab2;

            case 2:

                Informasi tab3;
                tab3 = new Informasi();

                return  tab3;

            default:

                return null;

        }

    }



    @Override

    public int getCount() {

        return mNoOfTabs;

    }

}