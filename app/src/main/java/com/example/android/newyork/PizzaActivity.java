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

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.pizzarte_title_name), getString(R.string.pizzarte_number),
                getString(R.string.pizzarte_address), R.drawable.p_pizzarte));
        locations.add(new Location(getString(R.string.rockys_pizzeria_title_name), getString(R.string.rockys_pizzeria_number),
                getString(R.string.rockys_pizzeria_address), R.drawable.p_rockyspizzeria));
        locations.add(new Location(getString(R.string.capizzi_title_name), getString(R.string.capizzi_number),
                getString(R.string.capizzi_address), R.drawable.p_capizzi));
        locations.add(new Location(getString(R.string.famous_ben_title_name), getString(R.string.famous_ben_number),
                getString(R.string.famous_ben_address), R.drawable.p_pizza));
        locations.add(new Location(getString(R.string.joes_pizza_title_name), getString(R.string.joes_pizza_number),
                getString(R.string.joes_pizza_address), R.drawable.p_joespizza));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent pizzArteIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        pizzArteIntent.putExtra(getString(R.string.name), getString(R.string.pizzarte_name));
                        pizzArteIntent.putExtra(getString(R.string.title), getString(R.string.pizzarte_title_name));
                        pizzArteIntent.putExtra(getString(R.string.number), getString(R.string.pizzarte_number));
                        pizzArteIntent.putExtra(getString(R.string.address), getString(R.string.pizzarte_address));
                        pizzArteIntent.putExtra(getString(R.string.about), getString(R.string.pizzarte_description));
                        companyBackground = R.drawable.p_pizzarte;
                        pizzArteIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(pizzArteIntent);
                        break;
                    case 1:
                        Intent rockysPizzeriaIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        rockysPizzeriaIntent.putExtra(getString(R.string.name), getString(R.string.rockys_pizzeria_name));
                        rockysPizzeriaIntent.putExtra(getString(R.string.title), getString(R.string.rockys_pizzeria_title_name));
                        rockysPizzeriaIntent.putExtra(getString(R.string.number), getString(R.string.rockys_pizzeria_number));
                        rockysPizzeriaIntent.putExtra(getString(R.string.address), getString(R.string.rockys_pizzeria_address));
                        rockysPizzeriaIntent.putExtra(getString(R.string.about), getString(R.string.rockys_pizzeria_description));
                        companyBackground = R.drawable.p_rockyspizzeria;
                        rockysPizzeriaIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(rockysPizzeriaIntent);
                        break;
                    case 2:
                        Intent capizziIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        capizziIntent.putExtra(getString(R.string.name), getString(R.string.capizzi_name));
                        capizziIntent.putExtra(getString(R.string.title), getString(R.string.capizzi_title_name));
                        capizziIntent.putExtra(getString(R.string.number), getString(R.string.capizzi_number));
                        capizziIntent.putExtra(getString(R.string.address), getString(R.string.capizzi_address));
                        capizziIntent.putExtra(getString(R.string.about), getString(R.string.capizzi_description));
                        companyBackground = R.drawable.p_capizzi;
                        capizziIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(capizziIntent);
                        break;
                    case 3:
                        Intent famousBenIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        famousBenIntent.putExtra(getString(R.string.name), getString(R.string.famous_ben_name));
                        famousBenIntent.putExtra(getString(R.string.title), getString(R.string.famous_ben_title_name));
                        famousBenIntent.putExtra(getString(R.string.number), getString(R.string.famous_ben_number));
                        famousBenIntent.putExtra(getString(R.string.address), getString(R.string.famous_ben_address));
                        famousBenIntent.putExtra(getString(R.string.about), getString(R.string.famous_ben_description));
                        companyBackground = R.drawable.p_pizza;
                        famousBenIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(famousBenIntent);
                        break;
                    case 4:
                        Intent joesPizzaIntent = new Intent(PizzaActivity.this, LocationDetailActivity.class);
                        joesPizzaIntent.putExtra(getString(R.string.name), getString(R.string.joes_pizza_name));
                        joesPizzaIntent.putExtra(getString(R.string.title), getString(R.string.joes_pizza_title_name));
                        joesPizzaIntent.putExtra(getString(R.string.number), getString(R.string.joes_pizza_number));
                        joesPizzaIntent.putExtra(getString(R.string.address), getString(R.string.joes_pizza_address));
                        joesPizzaIntent.putExtra(getString(R.string.about), getString(R.string.joes_pizza_description));
                        companyBackground = R.drawable.p_joespizza;
                        joesPizzaIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(joesPizzaIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}