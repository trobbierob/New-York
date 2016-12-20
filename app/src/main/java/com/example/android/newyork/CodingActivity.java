package com.example.android.newyork;

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
        locations.add(new Location(getString(R.string.nycda_title_name), getString(R.string.nycda_number),
                getString(R.string.nycda_address)));
        locations.add(new Location(getString(R.string.flatiron_title_name), getString(R.string.flatiron_number),
                getString(R.string.flatiron_address)));
        locations.add(new Location(getString(R.string.vwc_title_name), getString(R.string.vwc_number),
                getString(R.string.vwc_address)));
        locations.add(new Location(getString(R.string.ga_title_name), getString(R.string.ga_number),
                getString(R.string.ga_address)));
        locations.add(new Location(getString(R.string.codecademy_title_name), getString(R.string.codecademy_number),
                getString(R.string.codecademy_address)));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(CodingActivity.this, "location is: " + position, Toast.LENGTH_SHORT).show();

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent nycdaIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        nycdaIntent.putExtra("Name", getString(R.string.nycda_name));
                        nycdaIntent.putExtra("Title", getString(R.string.nycda_title_name));
                        nycdaIntent.putExtra("Number", getString(R.string.nycda_number));
                        nycdaIntent.putExtra("Address", getString(R.string.nycda_address));
                        nycdaIntent.putExtra("About", getString(R.string.nycda_description));
                        companyBackground = R.drawable.c_codecademy;
                        nycdaIntent.putExtra("Background", companyBackground);
                        startActivity(nycdaIntent);
                        break;
                    case 1:
                        Intent flatironIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        flatironIntent.putExtra("Name", getString(R.string.flatiron_name));
                        flatironIntent.putExtra("Title", getString(R.string.flatiron_title_name));
                        flatironIntent.putExtra("Number", getString(R.string.flatiron_number));
                        flatironIntent.putExtra("Address", getString(R.string.flatiron_address));
                        flatironIntent.putExtra("About", getString(R.string.flatiron_description));
                        companyBackground = R.drawable.c_flatiron;
                        flatironIntent.putExtra("Background", companyBackground);
                        startActivity(flatironIntent);
                        break;
                    case 2:
                        Intent vWCIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        vWCIntent.putExtra("Name", getString(R.string.vwc_name));
                        vWCIntent.putExtra("Title", getString(R.string.vwc_title_name));
                        vWCIntent.putExtra("Number", getString(R.string.vwc_number));
                        vWCIntent.putExtra("Address", getString(R.string.vwc_address));
                        vWCIntent.putExtra("About", getString(R.string.vwc_description));
                        companyBackground = R.drawable.c_vetswhocode;
                        vWCIntent.putExtra("Background", companyBackground);
                        startActivity(vWCIntent);
                        break;
                    case 3:
                        Intent gAIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        gAIntent.putExtra("Name", getString(R.string.ga_name));
                        gAIntent.putExtra("Title", getString(R.string.ga_title_name));
                        gAIntent.putExtra("Number", getString(R.string.ga_number));
                        gAIntent.putExtra("Address", getString(R.string.ga_address));
                        gAIntent.putExtra("About", getString(R.string.ga_description));
                        companyBackground = R.drawable.c_generalassembly;
                        gAIntent.putExtra("Background", companyBackground);
                        startActivity(gAIntent);
                        break;
                    case 4:
                        Intent codecademyIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        codecademyIntent.putExtra("Name", getString(R.string.codecademy_name));
                        codecademyIntent.putExtra("Title", getString(R.string.codecademy_title_name));
                        codecademyIntent.putExtra("Number", getString(R.string.codecademy_number));
                        codecademyIntent.putExtra("Address", getString(R.string.codecademy_address));
                        codecademyIntent.putExtra("About", getString(R.string.codecademy_description));
                        companyBackground = R.drawable.c_codecademy;
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