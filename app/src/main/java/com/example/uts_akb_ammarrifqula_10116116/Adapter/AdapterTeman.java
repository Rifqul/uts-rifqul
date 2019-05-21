package com.example.uts_akb_ammarrifqula_10116116.Adapter;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentStatePagerAdapter;





import com.example.uts_akb_ammarrifqula_10116116.Teman;




public class AdapterTeman extends FragmentStatePagerAdapter {


    private int mNoOfTabs;



    public AdapterTeman(FragmentManager fm, int NumberOfTabs)

    {

        super(fm);

        this.mNoOfTabs = NumberOfTabs;

    }







    @Override

    public Fragment getItem(int position) {

        if (position == 0) {
            return new Teman();
        }
        return null;

    }



    @Override

    public int getCount() {

        return mNoOfTabs;

    }

}
