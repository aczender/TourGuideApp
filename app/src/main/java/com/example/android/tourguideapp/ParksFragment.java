package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        // Create a list of parks
        final ArrayList<sight> sights = new ArrayList<>();
        sights.add(new sight(R.string.name_varosliget, R.string.address_varosliget));
        sights.add(new sight(R.string.name_margit, R.string.address_margit));
        sights.add(new sight(R.string.name_nepliget, R.string.address_nepliget));
        sights.add(new sight(R.string.name_varosmajor, R.string.address_varosmajor));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}