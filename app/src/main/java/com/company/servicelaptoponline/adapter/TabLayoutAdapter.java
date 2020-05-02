package com.company.servicelaptoponline.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.company.servicelaptoponline.CenterFragment;
import com.company.servicelaptoponline.ProblemFragment;

public class TabLayoutAdapter extends FragmentStatePagerAdapter {

    public TabLayoutAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if (position == 0) {
            fragment = new CenterFragment();
        }
        if (position == 1) {
            fragment = new ProblemFragment();
        }

        return fragment;
    }


    @Override
    public int getCount() {
        return 2;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        String name = null;
        if (position == 0) {
            name = "Top Center List";
        }
        if (position == 1) {
            name = "Top Article List";
        }
        return name;
    }
}
