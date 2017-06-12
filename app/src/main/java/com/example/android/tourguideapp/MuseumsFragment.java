package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        // Create a list of museums
        final ArrayList<sight> sights = new ArrayList<>();
        sights.add(new sight(R.string.name_zwack, R.string.address_zwack));
        sights.add(new sight(R.string.name_pinball, R.string.address_pinball));
        sights.add(new sight(R.string.name_nemzeti, R.string.address_nemzeti));
        sights.add(new sight(R.string.name_szepmuveszeti, R.string.address_szepmuveszeti));
        sights.add(new sight(R.string.name_neprajzi, R.string.address_neprajzi));
        sights.add(new sight(R.string.name_ipar, R.string.address_ipar));
        sights.add(new sight(R.string.name_ludwig, R.string.address_ludwig));
        sights.add(new sight(R.string.name_railway, R.string.address_railway));
        sights.add(new sight(R.string.name_aquincum, R.string.address_aquincum));
        sights.add(new sight(R.string.name_petofi, R.string.address_petofi));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}