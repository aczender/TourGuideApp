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
        sights.add(new sight("Dallas Étterem", "Zay utca 5\n" +
                "Budapest 1037"));
        sights.add(new sight("Trófea Grill Étterem Király utca", "Király utca 30-32.\n" +
                "Budapest 1061"));
        sights.add(new sight("Menza Étterem és Kávézó", "Liszt Ferenc tér 2\n" +
                "Budapest 1061"));
        sights.add(new sight("Újpesti Kakukk Vendéglő", "Nádor u. 31.\n" +
                "Budapest 1046"));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}