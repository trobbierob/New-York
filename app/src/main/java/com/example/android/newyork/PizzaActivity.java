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

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.pizzarte_name), getString(R.string.pizzarte_number),
                getString(R.string.pizzarte_address)));
        locations.add(new Location(getString(R.string.rockys_pizzeria_name), getString(R.string.rockys_pizzeria_number),
                getString(R.string.rockys_pizzeria_address)));
        locations.add(new Location(getString(R.string.capizzi_name), getString(R.string.capizzi_number),
                getString(R.string.capizzi_address)));
        locations.add(new Location(getString(R.string.famous_ben_name), getString(R.string.famous_ben_number),
                getString(R.string.famous_ben_address)));
        locations.add(new Location(getString(R.string.joes_pizza_name), getString(R.string.joes_pizza_number),
                getString(R.string.joes_pizza_address)));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Context context = view.getContext();
                Location location = locations.get(position);

                Toast.makeText(PizzaActivity.this, "location is: " + position, Toast.LENGTH_SHORT).show();

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent location1Intent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        location1Intent.putExtra("Name", getString(R.string.pizzarte_name));
                        location1Intent.putExtra("Number", getString(R.string.pizzarte_number));
                        location1Intent.putExtra("Address", getString(R.string.pizzarte_address));
                        location1Intent.putExtra("About", getString(R.string.pizzarte_description));
                        companyBackground = R.drawable.notfound;
                        location1Intent.putExtra("Background", companyBackground);
                        startActivity(location1Intent);
                        break;
                    case 1:
                        Intent location2Intent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        location2Intent.putExtra("Name", getString(R.string.rockys_pizzeria_name));
                        location2Intent.putExtra("Number", getString(R.string.rockys_pizzeria_number));
                        location2Intent.putExtra("Address", getString(R.string.rockys_pizzeria_address));
                        location2Intent.putExtra("About", getString(R.string.rockys_pizzeria_description));
                        companyBackground = R.drawable.found;
                        location2Intent.putExtra("Background", companyBackground);
                        startActivity(location2Intent);
                        break;
                    case 2:
                        Intent capizziIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        capizziIntent.putExtra("Name", getString(R.string.capizzi_name));
                        capizziIntent.putExtra("Number", getString(R.string.capizzi_number));
                        capizziIntent.putExtra("Address", getString(R.string.capizzi_address));
                        capizziIntent.putExtra("About", getString(R.string.capizzi_description));
                        companyBackground = R.drawable.notfound;
                        capizziIntent.putExtra("Background", companyBackground);
                        startActivity(capizziIntent);
                        break;
                    case 3:
                        Intent famousBenIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        famousBenIntent.putExtra("Name", getString(R.string.famous_ben_name));
                        famousBenIntent.putExtra("Number", getString(R.string.famous_ben_number));
                        famousBenIntent.putExtra("Address", getString(R.string.famous_ben_address));
                        famousBenIntent.putExtra("About", getString(R.string.famous_ben_description));
                        companyBackground = R.drawable.found;
                        famousBenIntent.putExtra("Background", companyBackground);
                        startActivity(famousBenIntent);
                        break;
                    case 4:
                        Intent joesPizzaIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        joesPizzaIntent.putExtra("Name", getString(R.string.joes_pizza_name));
                        joesPizzaIntent.putExtra("Number", getString(R.string.joes_pizza_number));
                        joesPizzaIntent.putExtra("Address", getString(R.string.joes_pizza_address));
                        joesPizzaIntent.putExtra("About", getString(R.string.joes_pizza_description));
                        companyBackground = R.drawable.notfound;
                        joesPizzaIntent.putExtra("Background", companyBackground);
                        startActivity(joesPizzaIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}