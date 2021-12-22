package com.mycompany.myapp.tesy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Paul on 11/23/2017.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {
   private List<Fragment> fragments;
    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragm){
        super(fm);
        this.fragments = fragm;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}
