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
        sights.add(new sight("My Green Cup", "Pozsonyi ùt 15.\n" +
                "Budapest 1137", R.drawable.my_green));
        sights.add(new sight("Cafe Panini", "Radnóti Miklós u. 45/n" +
                "Budapest 1137", R.drawable.cafe_panini));
        sights.add(new sight("Double Shot", "Pozsonyi út 16\n" +
                "Budapest 1137", R.drawable.double_shot));
        sights.add(new sight("Bubo", "Jászai Mari tér 3.\n" +
                "Budapest 1137", R.drawable.bubo_cafe));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}