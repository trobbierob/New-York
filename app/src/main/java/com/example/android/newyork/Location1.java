package com.example.android.newyork;

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

                Location location = locations.get(position);

                Toast.makeText(Location1.this, "location is: " + position, Toast.LENGTH_LONG).show();



            }
        });
    }
}
