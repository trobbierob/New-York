package com.example.android.newyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sogekingu on 12/14/16.
 */

public class CodingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.nycda_title_name), getString(R.string.nycda_number),
                getString(R.string.nycda_address), R.drawable.c_codedesignacademy));
        locations.add(new Location(getString(R.string.flatiron_title_name), getString(R.string.flatiron_number),
                getString(R.string.flatiron_address), R.drawable.c_flatiron));
        locations.add(new Location(getString(R.string.vwc_title_name), getString(R.string.vwc_number),
                getString(R.string.vwc_address), R.drawable.c_vetswhocode));
        locations.add(new Location(getString(R.string.ga_title_name), getString(R.string.ga_number),
                getString(R.string.ga_address), R.drawable.c_generalassembly));
        locations.add(new Location(getString(R.string.codecademy_title_name), getString(R.string.codecademy_number),
                getString(R.string.codecademy_address), R.drawable.c_codecademy));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent nycdaIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        nycdaIntent.putExtra(getString(R.string.name), getString(R.string.nycda_name));
                        nycdaIntent.putExtra(getString(R.string.title), getString(R.string.nycda_title_name));
                        nycdaIntent.putExtra(getString(R.string.number), getString(R.string.nycda_number));
                        nycdaIntent.putExtra(getString(R.string.address), getString(R.string.nycda_address));
                        nycdaIntent.putExtra(getString(R.string.about), getString(R.string.nycda_description));
                        companyBackground = R.drawable.c_codedesignacademy;
                        nycdaIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(nycdaIntent);
                        break;
                    case 1:
                        Intent flatironIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        flatironIntent.putExtra(getString(R.string.name), getString(R.string.flatiron_name));
                        flatironIntent.putExtra(getString(R.string.title), getString(R.string.flatiron_title_name));
                        flatironIntent.putExtra(getString(R.string.number), getString(R.string.flatiron_number));
                        flatironIntent.putExtra(getString(R.string.address), getString(R.string.flatiron_address));
                        flatironIntent.putExtra(getString(R.string.about), getString(R.string.flatiron_description));
                        companyBackground = R.drawable.c_flatiron;
                        flatironIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(flatironIntent);
                        break;
                    case 2:
                        Intent vWCIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        vWCIntent.putExtra(getString(R.string.name), getString(R.string.vwc_name));
                        vWCIntent.putExtra(getString(R.string.title), getString(R.string.vwc_title_name));
                        vWCIntent.putExtra(getString(R.string.number), getString(R.string.vwc_number));
                        vWCIntent.putExtra(getString(R.string.address), getString(R.string.vwc_address));
                        vWCIntent.putExtra(getString(R.string.about), getString(R.string.vwc_description));
                        companyBackground = R.drawable.c_vetswhocode;
                        vWCIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(vWCIntent);
                        break;
                    case 3:
                        Intent gAIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        gAIntent.putExtra(getString(R.string.name), getString(R.string.ga_name));
                        gAIntent.putExtra(getString(R.string.title), getString(R.string.ga_title_name));
                        gAIntent.putExtra(getString(R.string.number), getString(R.string.ga_number));
                        gAIntent.putExtra(getString(R.string.address), getString(R.string.ga_address));
                        gAIntent.putExtra(getString(R.string.about), getString(R.string.ga_description));
                        companyBackground = R.drawable.c_generalassembly;
                        gAIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(gAIntent);
                        break;
                    case 4:
                        Intent codecademyIntent = new Intent(CodingActivity.this, LocationDetailActivity.class);
                        codecademyIntent.putExtra(getString(R.string.name), getString(R.string.codecademy_name));
                        codecademyIntent.putExtra(getString(R.string.title), getString(R.string.codecademy_title_name));
                        codecademyIntent.putExtra(getString(R.string.number), getString(R.string.codecademy_number));
                        codecademyIntent.putExtra(getString(R.string.address), getString(R.string.codecademy_address));
                        codecademyIntent.putExtra(getString(R.string.about), getString(R.string.codecademy_description));
                        companyBackground = R.drawable.c_codecademy;
                        codecademyIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(codecademyIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}