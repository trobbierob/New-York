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
                getString(R.string.moma_address), R.drawable.m_moma));
        locations.add(new Location(getString(R.string.amnh_title_name), getString(R.string.amnh_number),
                getString(R.string.amnh_address), R.drawable.m_amnh));
        locations.add(new Location(getString(R.string.guggenheim_title_name), getString(R.string.guggenheim_number),
                getString(R.string.guggenheim_address), R.drawable.m_guggenheim));
        locations.add(new Location(getString(R.string.asm_title_name), getString(R.string.asm_number),
                getString(R.string.asm_address), R.drawable.m_asiasociety));
        locations.add(new Location(getString(R.string.mosex_title_name), getString(R.string.mosex_number),
                getString(R.string.mosex_address), R.drawable.m_mosex));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent momaIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        momaIntent.putExtra(getString(R.string.name), getString(R.string.moma_name));
                        momaIntent.putExtra(getString(R.string.title), getString(R.string.moma_title_name));
                        momaIntent.putExtra(getString(R.string.number), getString(R.string.moma_number));
                        momaIntent.putExtra(getString(R.string.address), getString(R.string.moma_address));
                        momaIntent.putExtra(getString(R.string.about), getString(R.string.moma_description));
                        companyBackground = R.drawable.m_moma;
                        momaIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(momaIntent);
                        break;
                    case 1:
                        Intent amnhIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        amnhIntent.putExtra(getString(R.string.name), getString(R.string.amnh_name));
                        amnhIntent.putExtra(getString(R.string.title), getString(R.string.amnh_title_name));
                        amnhIntent.putExtra(getString(R.string.number), getString(R.string.amnh_number));
                        amnhIntent.putExtra(getString(R.string.address), getString(R.string.amnh_address));
                        amnhIntent.putExtra(getString(R.string.about), getString(R.string.amnh_description));
                        companyBackground = R.drawable.m_amnh;
                        amnhIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(amnhIntent);
                        break;
                    case 2:
                        Intent guggenheimIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        guggenheimIntent.putExtra(getString(R.string.name), getString(R.string.guggenheim_name));
                        guggenheimIntent.putExtra(getString(R.string.title), getString(R.string.guggenheim_title_name));
                        guggenheimIntent.putExtra(getString(R.string.number), getString(R.string.guggenheim_number));
                        guggenheimIntent.putExtra(getString(R.string.address), getString(R.string.guggenheim_address));
                        guggenheimIntent.putExtra(getString(R.string.about), getString(R.string.guggenheim_description));
                        companyBackground = R.drawable.m_guggenheim;
                        guggenheimIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(guggenheimIntent);
                        break;
                    case 3:
                        Intent asmIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        asmIntent.putExtra(getString(R.string.name), getString(R.string.asm_name));
                        asmIntent.putExtra(getString(R.string.title), getString(R.string.asm_title_name));
                        asmIntent.putExtra(getString(R.string.number), getString(R.string.asm_number));
                        asmIntent.putExtra(getString(R.string.address), getString(R.string.asm_address));
                        asmIntent.putExtra(getString(R.string.about), getString(R.string.asm_description));
                        companyBackground = R.drawable.m_asiasociety;
                        asmIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(asmIntent);
                        break;
                    case 4:
                        Intent moSexIntent = new Intent(MuseumActivity.this, LocationDetailActivity.class);
                        moSexIntent.putExtra(getString(R.string.name), getString(R.string.mosex_name));
                        moSexIntent.putExtra(getString(R.string.title), getString(R.string.mosex_title_name));
                        moSexIntent.putExtra(getString(R.string.number), getString(R.string.mosex_number));
                        moSexIntent.putExtra(getString(R.string.address), getString(R.string.mosex_address));
                        moSexIntent.putExtra(getString(R.string.about), getString(R.string.mosex_description));
                        companyBackground = R.drawable.m_mosex;
                        moSexIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(moSexIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}