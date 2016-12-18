package com.example.android.newyork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sogekingu on 12/6/16.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView companyName = (TextView) listItemView.findViewById(R.id.company_name_text_view);

        companyName.setText(currentLocation.getCompanyName());

        TextView companyNumber = (TextView) listItemView.findViewById(R.id.company_number_text_view);

        companyNumber.setText(currentLocation.getCompanyNumber());

        TextView companyAddress = (TextView) listItemView.findViewById(R.id.company_address);

        companyAddress.setText(currentLocation.getCompanyAddress());

        return listItemView;
    }
}
