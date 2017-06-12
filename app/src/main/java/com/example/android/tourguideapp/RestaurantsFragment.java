package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        // Create a list of restaurants
        final ArrayList<sight> sights = new ArrayList<>();
        sights.add(new sight(R.string.name_dallas, R.string.address_dallas, R.drawable.dallas));
        sights.add(new sight(R.string.name_trofea, R.string.address_trofea, R.drawable.trofea));
        sights.add(new sight(R.string.name_menza, R.string.address_menza, R.drawable.menza));
        sights.add(new sight(R.string.name_kakukk, R.string.address_kakukk, R.drawable.kakukk));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}