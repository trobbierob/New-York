package com.example.android.newyork;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sogekingu on 12/14/16.
 */

public class CodingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.nycda_name), getString(R.string.nycda_number),
                getString(R.string.nycda_address)));
        locations.add(new Location(getString(R.string.flatiron_name), getString(R.string.flatiron_number),
                getString(R.string.flatiron_address)));
        locations.add(new Location(getString(R.string.vwc_name), getString(R.string.vwc_number),
                getString(R.string.vwc_address)));
        locations.add(new Location(getString(R.string.ga_name), getString(R.string.ga_number),
                getString(R.string.ga_address)));
        locations.add(new Location(getString(R.string.codecademy_name), getString(R.string.codecademy_number),
                getString(R.string.codecademy_address)));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Context context = view.getContext();
                Location location = locations.get(position);

                Toast.makeText(CodingActivity.this, "location is: " + position, Toast.LENGTH_SHORT).show();

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent location1Intent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        location1Intent.putExtra("Name", getString(R.string.nycda_name));
                        location1Intent.putExtra("Number", getString(R.string.nycda_number));
                        location1Intent.putExtra("Address", getString(R.string.nycda_address));
                        location1Intent.putExtra("About", getString(R.string.nycda_description));
                        companyBackground = R.drawable.notfound;
                        location1Intent.putExtra("Background", companyBackground);
                        startActivity(location1Intent);
                        break;
                    case 1:
                        Intent location2Intent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        location2Intent.putExtra("Name", getString(R.string.flatiron_name));
                        location2Intent.putExtra("Number", getString(R.string.flatiron_number));
                        location2Intent.putExtra("Address", getString(R.string.flatiron_address));
                        location2Intent.putExtra("About", getString(R.string.flatiron_description));
                        companyBackground = R.drawable.found;
                        location2Intent.putExtra("Background", companyBackground);
                        startActivity(location2Intent);
                        break;
                    case 2:
                        Intent vWCIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        vWCIntent.putExtra("Name", getString(R.string.vwc_name));
                        vWCIntent.putExtra("Number", getString(R.string.vwc_number));
                        vWCIntent.putExtra("Address", getString(R.string.vwc_address));
                        vWCIntent.putExtra("About", getString(R.string.vwc_description));
                        companyBackground = R.drawable.notfound;
                        vWCIntent.putExtra("Background", companyBackground);
                        startActivity(vWCIntent);
                        break;
                    case 3:
                        Intent gAIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        gAIntent.putExtra("Name", getString(R.string.ga_name));
                        gAIntent.putExtra("Number", getString(R.string.ga_number));
                        gAIntent.putExtra("Address", getString(R.string.ga_address));
                        gAIntent.putExtra("About", getString(R.string.ga_description));
                        companyBackground = R.drawable.found;
                        gAIntent.putExtra("Background", companyBackground);
                        startActivity(gAIntent);
                        break;
                    case 4:
                        Intent codecademyIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        codecademyIntent.putExtra("Name", getString(R.string.codecademy_name));
                        codecademyIntent.putExtra("Number", getString(R.string.codecademy_number));
                        codecademyIntent.putExtra("Address", getString(R.string.codecademy_address));
                        codecademyIntent.putExtra("About", getString(R.string.codecademy_description));
                        companyBackground = R.drawable.notfound;
                        codecademyIntent.putExtra("Background", companyBackground);
                        startActivity(codecademyIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}