package com.example.android.newyork;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sogekingu on 12/14/16.
 */

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.moma_title_name), getString(R.string.moma_number),
                getString(R.string.moma_address)));
        locations.add(new Location(getString(R.string.amnh_title_name), getString(R.string.amnh_number),
                getString(R.string.amnh_address)));
        locations.add(new Location(getString(R.string.guggenheim_title_name), getString(R.string.guggenheim_number),
                getString(R.string.guggenheim_address)));
        locations.add(new Location(getString(R.string.asm_title_name), getString(R.string.asm_number),
                getString(R.string.asm_address)));
        locations.add(new Location(getString(R.string.mosex_title_name), getString(R.string.mosex_number),
                getString(R.string.mosex_address)));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Context context = view.getContext();
                Location location = locations.get(position);

                Toast.makeText(MuseumActivity.this, "location is: " + position, Toast.LENGTH_SHORT).show();

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent momaIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        momaIntent.putExtra("Name", getString(R.string.moma_name));
                        momaIntent.putExtra("Title", getString(R.string.moma_title_name));
                        momaIntent.putExtra("Number", getString(R.string.moma_number));
                        momaIntent.putExtra("Address", getString(R.string.moma_address));
                        momaIntent.putExtra("About", getString(R.string.moma_description));
                        companyBackground = R.drawable.m_moma;
                        momaIntent.putExtra("Background", companyBackground);
                        startActivity(momaIntent);
                        break;
                    case 1:
                        Intent amnhIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        amnhIntent.putExtra("Name", getString(R.string.amnh_name));
                        amnhIntent.putExtra("Title", getString(R.string.amnh_title_name));
                        amnhIntent.putExtra("Number", getString(R.string.amnh_number));
                        amnhIntent.putExtra("Address", getString(R.string.amnh_address));
                        amnhIntent.putExtra("About", getString(R.string.amnh_description));
                        companyBackground = R.drawable.m_amnh;
                        amnhIntent.putExtra("Background", companyBackground);
                        startActivity(amnhIntent);
                        break;
                    case 2:
                        Intent guggenheimIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        guggenheimIntent.putExtra("Name", getString(R.string.guggenheim_name));
                        guggenheimIntent.putExtra("Title", getString(R.string.guggenheim_title_name));
                        guggenheimIntent.putExtra("Number", getString(R.string.guggenheim_number));
                        guggenheimIntent.putExtra("Address", getString(R.string.guggenheim_address));
                        guggenheimIntent.putExtra("About", getString(R.string.guggenheim_description));
                        companyBackground = R.drawable.m_guggenheim;
                        guggenheimIntent.putExtra("Background", companyBackground);
                        startActivity(guggenheimIntent);
                        break;
                    case 3:
                        Intent asmIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        asmIntent.putExtra("Name", getString(R.string.asm_name));
                        asmIntent.putExtra("Title", getString(R.string.asm_title_name));
                        asmIntent.putExtra("Number", getString(R.string.asm_number));
                        asmIntent.putExtra("Address", getString(R.string.asm_address));
                        asmIntent.putExtra("About", getString(R.string.asm_description));
                        companyBackground = R.drawable.m_asiasociety;
                        asmIntent.putExtra("Background", companyBackground);
                        startActivity(asmIntent);
                        break;
                    case 4:
                        Intent moSexIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        moSexIntent.putExtra("Name", getString(R.string.mosex_name));
                        moSexIntent.putExtra("Title", getString(R.string.mosex_title_name));
                        moSexIntent.putExtra("Number", getString(R.string.mosex_number));
                        moSexIntent.putExtra("Address", getString(R.string.mosex_address));
                        moSexIntent.putExtra("About", getString(R.string.mosex_description));
                        companyBackground = R.drawable.m_mosex;
                        moSexIntent.putExtra("Background", companyBackground);
                        startActivity(moSexIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}