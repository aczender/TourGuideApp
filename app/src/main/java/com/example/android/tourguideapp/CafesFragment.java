package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CafesFragment extends Fragment {

    public CafesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        // Create a list of cafes
        final ArrayList<sight> sights = new ArrayList<>();
        sights.add(new sight(R.string.name_green, R.string.address_green, R.drawable.my_green));
        sights.add(new sight(R.string.name_panini, R.string.address_panini, R.drawable.cafe_panini));
        sights.add(new sight(R.string.name_shot, R.string.address_shot, R.drawable.double_shot));
        sights.add(new sight(R.string.name_bubo, R.string.address_bubo, R.drawable.bubo_cafe));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}