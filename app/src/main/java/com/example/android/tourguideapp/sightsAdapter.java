package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class sightsAdapter extends ArrayAdapter<sight> {

    private int mColorResourceId;

    public sightsAdapter(Context context, ArrayList<sight> sights, int colorResourceId) {
        super(context, R.layout.list_item, sights);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        sight currentSight = getItem(position);

        TextView addressTextView = (TextView) listView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentSight.getAddress());

        TextView nameTextView = (TextView) listView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentSight.getName());

        ImageView imageView = (ImageView) listView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentSight.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSight.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listView;
    }
}

