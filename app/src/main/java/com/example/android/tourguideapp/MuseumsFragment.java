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
        sights.add(new sight("Zwack Unicum Múzeum, Látogatóközpont és Mintabolt", "Dandár utca 1. / Dandár street 1.\n" +
                "Budapest 1095"));
        sights.add(new sight("Flippermúzeum - Budapest Pinball Museum", "Radnóti Miklós utca 18.\n" +
                "Budapest 1137"));
        sights.add(new sight("Magyar Nemzeti Múzeum", "Múzeum körút 14-16.\n" +
                "Budapest 1088"));
        sights.add(new sight("Szépművészeti Múzeum", "Dózsa György út 41.\n" +
                "Budapest 1146"));
        sights.add(new sight("Néprajzi Múzeum", "Kossuth Lajos tér 12.\n" +
                "Budapest 1055"));
        sights.add(new sight("Iparművészeti Múzeum", "Üllői út 33-37.\n" +
                "Budapest 1091"));
        sights.add(new sight("Ludwig Múzeum", "Komor Marcell u. 1.\n" +
                "Budapest 1095"));
        sights.add(new sight("Magyar Vasúttörténeti Park / Hungarian Railway Museum", "Tatai út 95.\n" +
                "Budapest 1142"));
        sights.add(new sight("Aquincumi Múzeum", "Szentendrei út 135.\n" +
                "Budapest 1031"));
        sights.add(new sight("Petőfi Irodalmi Múzeum", "Károlyi utca 16.\n" +
                "Budapest 1053"));

        final sightsAdapter adapter = new sightsAdapter(getActivity(), sights, R.color.colorSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}