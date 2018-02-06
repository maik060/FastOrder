package com.example.android.fastorder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yorick on 2018/2/6.
 */

public class MenuItemAdapter extends ArrayAdapter<MenuItem> {
    public MenuItemAdapter(@NonNull Context context, ArrayList<MenuItem> menuItems) {
        super(context, 0, menuItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_menu, parent, false);
        }

        TextView name = listItemView.findViewById(R.id.item_name);
        name.setText("tea");

        TextView price = listItemView.findViewById(R.id.item_price);
        price.setText("15");

        return listItemView;
    }
}
