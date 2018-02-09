package com.example.android.fastorder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;


public class PanelMenuFragment extends ListFragment {

    public static PanelMenuFragment newInstance() {

        Bundle args = new Bundle();

        PanelMenuFragment fragment = new PanelMenuFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);


        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewPrepare();
    }

    private void viewPrepare() {
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("bubble tea", 15 ));
        items.add(new MenuItem("red tea", 25 ));

        MenuItemAdapter itemsAdapter = new MenuItemAdapter(getContext(), items);

        getListView().setAdapter(itemsAdapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "item clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
