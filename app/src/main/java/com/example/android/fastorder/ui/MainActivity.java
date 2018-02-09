package com.example.android.fastorder.ui;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.fastorder.panelItems.PanelMenuFragment;
import com.example.android.fastorder.panelItems.PanelOrderFragment;
import com.example.android.fastorder.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeScreen();

    }

    private void initializeScreen() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        PanelFragmentAdapter panelFragmentAdapter = new PanelFragmentAdapter(getSupportFragmentManager(),
                MainActivity.this);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(panelFragmentAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

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
                    fragment = PanelMenuFragment.newInstance();
                    break;
                case 1:
                    fragment = PanelOrderFragment.newInstance();
                    break;
                default:
                    fragment = PanelMenuFragment.newInstance();
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
}
