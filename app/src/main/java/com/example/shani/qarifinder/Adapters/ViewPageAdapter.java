package com.example.shani.qarifinder.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.shani.qarifinder.Fragments.ExperienceFragment;
import com.example.shani.qarifinder.Fragments.StudentsFragment;

/**
 * Created by Shani on 3/24/2017.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public ViewPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                StudentsFragment tab1 = new StudentsFragment();
                return tab1;
            case 1:
                ExperienceFragment tab2 = new ExperienceFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
