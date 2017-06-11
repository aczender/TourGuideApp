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
        sights.add(new sight("Városliget", "Kós Károly sétány\n" +
                "Budapest 1146"));
        sights.add(new sight("Margit-sziget", "Budapest"));
        sights.add(new sight("Népliget", "Budapest 1091"));
        sights.add(new sight("Városmajor", "Budapest 1122"));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}