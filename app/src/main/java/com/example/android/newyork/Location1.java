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

public class Location1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.tipsy_name), getString(R.string.tipsy_number),
                getString(R.string.tipsy_address)));
        locations.add(new Location("Name", "(444) 444-4444", "Address"));
        locations.add(new Location("Name", "(545) 545-4444", "Address"));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Context context = view.getContext();
                Location location = locations.get(position);

                Toast.makeText(Location1.this, "location is: " + position, Toast.LENGTH_SHORT).show();

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent location1Intent = new Intent(Location1.this, LocationDetailActivity.class);
                        location1Intent.putExtra("Name", getString(R.string.tipsy_name));
                        location1Intent.putExtra("Number", getString(R.string.tipsy_number));
                        location1Intent.putExtra("Address", getString(R.string.tipsy_address));
                        location1Intent.putExtra("About", getString(R.string.tipsy_description));

                        companyBackground = R.drawable.notfound;
                        location1Intent.putExtra("Background", companyBackground);
                        startActivity(location1Intent);
                        break;
                    case 1:
                        Intent location2Intent = new Intent(Location1.this, LocationDetailActivity.class);
                        location2Intent.putExtra("Name", getString(R.string.tipsy_name));
                        location2Intent.putExtra("Number", getString(R.string.tipsy_number));
                        location2Intent.putExtra("Address", getString(R.string.tipsy_address));
                        location2Intent.putExtra("About", getString(R.string.tipsy_description));

                        companyBackground = R.drawable.found;
                        location2Intent.putExtra("Background", companyBackground);
                        startActivity(location2Intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}