package com.example.android.fastorder;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.fastorder.PanelMenuFragment;
import com.example.android.fastorder.PanelOrderFragment;

/**
 * Created by yorick on 2018/2/2.
 */

public class PanelFragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    private String[] mTitles = new String[] {"menu", "order"};

    public PanelFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new PanelMenuFragment();
                break;
            case 1:
                fragment = new PanelOrderFragment();
                break;
            default:
                fragment = null;
        }

        return fragment;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
