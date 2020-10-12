package com.Labbay;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.Labbay.fragments.OverallFragment;
import com.Labbay.fragments.RatioFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(@NonNull Context context,FragmentManager fm,int totalTabs) {

        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                OverallFragment overall = new OverallFragment();
                return overall;
            case 1:
                RatioFragment ratio = new RatioFragment();
                return ratio;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
