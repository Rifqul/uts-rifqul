package com.example.uts_akb_ammarrifqula_10116116.Adapter;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentStatePagerAdapter;



import com.example.uts_akb_ammarrifqula_10116116.Email;

import com.example.uts_akb_ammarrifqula_10116116.SocialMedia;

import com.example.uts_akb_ammarrifqula_10116116.Telepon;



public class AdapterTelepon extends FragmentStatePagerAdapter {


    private int mNoOfTabs;



    public AdapterTelepon(FragmentManager fm, int NumberOfTabs)

    {

        super(fm);

        this.mNoOfTabs = NumberOfTabs;

    }







    @Override

    public Fragment getItem(int position) {

        switch(position)

        {



            case 0:

                Telepon tab1;
                tab1 = new Telepon();

                return tab1;

            case 1:

                Email tab2;
                tab2 = new Email();

                return  tab2;

            case 2:

                SocialMedia tab3;
                tab3 = new SocialMedia();

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
