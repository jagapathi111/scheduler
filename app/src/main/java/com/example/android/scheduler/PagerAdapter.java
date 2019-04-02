package com.example.android.scheduler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {

        super(fm);
        this.mNoOfTabs = NumberOfTabs;

    }

    @Override

    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                BreakfastActivity breakfastActivity = new BreakfastActivity();
                return breakfastActivity;

            case 1:
                LunchActivity lunchActivity = new LunchActivity();
                return lunchActivity;

            case 2:
                DinnerActivity dinnerActivity = new DinnerActivity();
                return dinnerActivity;

           default:
            return null;
        }
    }

    @Override

    public int getCount()  {

        return mNoOfTabs;
    }
}
