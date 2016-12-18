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

public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.tipsy_name), getString(R.string.tipsy_number),
                getString(R.string.tipsy_address)));
        locations.add(new Location(getString(R.string.dominique_ansel_name), getString(R.string.dominique_ansel_number),
                getString(R.string.dominique_ansel_address)));
        locations.add(new Location(getString(R.string.spot_dessert_name), getString(R.string.spot_dessert_number),
                getString(R.string.spot_dessert_address)));
        locations.add(new Location(getString(R.string.levain_bakery_name), getString(R.string.levain_bakery_number),
                getString(R.string.levain_bakery_address)));
        locations.add(new Location(getString(R.string.milk_bar_name), getString(R.string.milk_bar_number),
                getString(R.string.milk_bar_address)));
        locations.add(new Location(getString(R.string.schmackary_name), getString(R.string.schmackary_number),
                getString(R.string.schmackary_address)));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Context context = view.getContext();
                Location location = locations.get(position);

                Toast.makeText(Dessert.this, "location is: " + position, Toast.LENGTH_SHORT).show();

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent tipsyIntent = new Intent(Dessert.this, LocationDetailActivity.class);
                        tipsyIntent.putExtra("Name", getString(R.string.tipsy_name));
                        tipsyIntent.putExtra("Number", getString(R.string.tipsy_number));
                        tipsyIntent.putExtra("Address", getString(R.string.tipsy_address));
                        tipsyIntent.putExtra("About", getString(R.string.tipsy_description));
                        companyBackground = R.drawable.tipsy_scoop;
                        tipsyIntent.putExtra("Background", companyBackground);
                        startActivity(tipsyIntent);
                        break;
                    case 1:
                        Intent dominiqueAnselIntent = new Intent(Dessert.this, LocationDetailActivity.class);
                        dominiqueAnselIntent.putExtra("Name", getString(R.string.dominique_ansel_name));
                        dominiqueAnselIntent.putExtra("Number", getString(R.string.dominique_ansel_number));
                        dominiqueAnselIntent.putExtra("Address", getString(R.string.dominique_ansel_address));
                        dominiqueAnselIntent.putExtra("About", getString(R.string.dominique_ansel_description));
                        companyBackground = R.drawable.dominique_ansel;
                        dominiqueAnselIntent.putExtra("Background", companyBackground);
                        startActivity(dominiqueAnselIntent);
                        break;
                    case 2:
                        Intent spotDessertIntent = new Intent(Dessert.this, LocationDetailActivity.class);
                        spotDessertIntent.putExtra("Name", getString(R.string.spot_dessert_name));
                        spotDessertIntent.putExtra("Number", getString(R.string.spot_dessert_number));
                        spotDessertIntent.putExtra("Address", getString(R.string.spot_dessert_address));
                        spotDessertIntent.putExtra("About", getString(R.string.spot_dessert_description));
                        companyBackground = R.drawable.spot_dessert_bar;
                        spotDessertIntent.putExtra("Background", companyBackground);
                        startActivity(spotDessertIntent);
                        break;
                    case 3:
                        Intent levainBakeryIntent = new Intent(Dessert.this, LocationDetailActivity.class);
                        levainBakeryIntent.putExtra("Name", getString(R.string.levain_bakery_name));
                        levainBakeryIntent.putExtra("Number", getString(R.string.levain_bakery_number));
                        levainBakeryIntent.putExtra("Address", getString(R.string.levain_bakery_address));
                        levainBakeryIntent.putExtra("About", getString(R.string.levain_bakery_description));
                        companyBackground = R.drawable.levain_bakery;
                        levainBakeryIntent.putExtra("Background", companyBackground);
                        startActivity(levainBakeryIntent);
                        break;
                    case 4:
                        Intent milkBarIntent = new Intent(Dessert.this, LocationDetailActivity.class);
                        milkBarIntent.putExtra("Name", getString(R.string.milk_bar_name));
                        milkBarIntent.putExtra("Number", getString(R.string.milk_bar_number));
                        milkBarIntent.putExtra("Address", getString(R.string.milk_bar_address));
                        milkBarIntent.putExtra("About", getString(R.string.milk_bar_description));
                        companyBackground = R.drawable.momofuku;
                        milkBarIntent.putExtra("Background", companyBackground);
                        startActivity(milkBarIntent);
                        break;
                    case 5:
                        Intent schmackaryIntent = new Intent(Dessert.this, LocationDetailActivity.class);
                        schmackaryIntent.putExtra("Name", getString(R.string.schmackary_name));
                        schmackaryIntent.putExtra("Number", getString(R.string.schmackary_number));
                        schmackaryIntent.putExtra("Address", getString(R.string.schmackary_address));
                        schmackaryIntent.putExtra("About", getString(R.string.schmackary_description));
                        companyBackground = R.drawable.schmackarys2;
                        schmackaryIntent.putExtra("Background", companyBackground);
                        startActivity(schmackaryIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}