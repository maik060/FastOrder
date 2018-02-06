package com.example.android.fastorder;

/**
 * Created by yorick on 2018/2/6.
 */

public class MenuItem {
    private String mName;
    private int mPrice;

    public MenuItem(String name, int price) {
        mName = name;
        mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public int getPrice() {
        return mPrice;
    }

}
