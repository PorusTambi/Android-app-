package com.example.android.thescientistsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class Pager_Adapter extends FragmentPagerAdapter {

    public Pager_Adapter(android.support.v4.app.FragmentManager fm){

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new fragmentone();
            case 1:
                return new fragmenttwo();
            case 2:
                return new fragmentthree();
            case 3:
                return new fragmentfour();
            case 4:
                return new fragmentfive();
            default:
                break;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}

