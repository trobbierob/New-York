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
        locations.add(new Location("Name", "(555) 555-5555", "Address"));
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

                if (position == 0) {
                    Intent location1Intent = new Intent(Location1.this, LocationDetailActivity.class);
                    location1Intent.putExtra("Name", "Tipsy Scoop");
                    location1Intent.putExtra("Number", "(646) 812-4996");
                    location1Intent.putExtra("AddressLineA", "229 Knickerbocker Ave.");
                    location1Intent.putExtra("AddressLineB", "Brooklyn, NY 11199");
                    location1Intent.putExtra("About", getString(R.string.tipsy_description));
                    startActivity(location1Intent);
                } else {
                    return;
                }
            }
        });
    }
}