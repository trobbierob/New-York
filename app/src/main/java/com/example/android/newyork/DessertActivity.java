package com.example.android.newyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.tipsy_title_name), getString(R.string.tipsy_number),
                getString(R.string.tipsy_address), R.drawable.d_tipsy_scoop));
        locations.add(new Location(getString(R.string.dominique_ansel_title_name), getString(R.string.dominique_ansel_number),
                getString(R.string.dominique_ansel_address), R.drawable.d_dominique_ansel));
        locations.add(new Location(getString(R.string.spot_dessert_title_name), getString(R.string.spot_dessert_number),
                getString(R.string.spot_dessert_address), R.drawable.d_spot_dessert_bar));
        locations.add(new Location(getString(R.string.levain_bakery_title_name), getString(R.string.levain_bakery_number),
                getString(R.string.levain_bakery_address), R.drawable.d_levain_bakery));
        locations.add(new Location(getString(R.string.milk_bar_title_name), getString(R.string.milk_bar_number),
                getString(R.string.milk_bar_address), R.drawable.d_momofuku));
        locations.add(new Location(getString(R.string.schmackary_title_name), getString(R.string.schmackary_number),
                getString(R.string.schmackary_address), R.drawable.d_schmackarys));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent tipsyIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        tipsyIntent.putExtra(getString(R.string.name), getString(R.string.tipsy_name));
                        tipsyIntent.putExtra(getString(R.string.title), getString(R.string.tipsy_title_name));
                        tipsyIntent.putExtra(getString(R.string.number), getString(R.string.tipsy_number));
                        tipsyIntent.putExtra(getString(R.string.address), getString(R.string.tipsy_address));
                        tipsyIntent.putExtra(getString(R.string.about), getString(R.string.tipsy_description));
                        companyBackground = R.drawable.d_tipsy_scoop;
                        tipsyIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(tipsyIntent);
                        break;
                    case 1:
                        Intent dominiqueAnselIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        dominiqueAnselIntent.putExtra(getString(R.string.name), getString(R.string.dominique_ansel_name));
                        dominiqueAnselIntent.putExtra(getString(R.string.title), getString(R.string.dominique_ansel_title_name));
                        dominiqueAnselIntent.putExtra(getString(R.string.number), getString(R.string.dominique_ansel_number));
                        dominiqueAnselIntent.putExtra(getString(R.string.address), getString(R.string.dominique_ansel_address));
                        dominiqueAnselIntent.putExtra(getString(R.string.about), getString(R.string.dominique_ansel_description));
                        companyBackground = R.drawable.d_dominique_ansel;
                        dominiqueAnselIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(dominiqueAnselIntent);
                        break;
                    case 2:
                        Intent spotDessertIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        spotDessertIntent.putExtra(getString(R.string.name), getString(R.string.spot_dessert_name));
                        spotDessertIntent.putExtra(getString(R.string.title), getString(R.string.spot_dessert_title_name));
                        spotDessertIntent.putExtra(getString(R.string.number), getString(R.string.spot_dessert_number));
                        spotDessertIntent.putExtra(getString(R.string.address), getString(R.string.spot_dessert_address));
                        spotDessertIntent.putExtra(getString(R.string.about), getString(R.string.spot_dessert_description));
                        companyBackground = R.drawable.d_spot_dessert_bar;
                        spotDessertIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(spotDessertIntent);
                        break;
                    case 3:
                        Intent levainBakeryIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        levainBakeryIntent.putExtra(getString(R.string.name), getString(R.string.levain_bakery_name));
                        levainBakeryIntent.putExtra(getString(R.string.title), getString(R.string.levain_bakery_title_name));
                        levainBakeryIntent.putExtra(getString(R.string.number), getString(R.string.levain_bakery_number));
                        levainBakeryIntent.putExtra(getString(R.string.address), getString(R.string.levain_bakery_address));
                        levainBakeryIntent.putExtra(getString(R.string.about), getString(R.string.levain_bakery_description));
                        companyBackground = R.drawable.d_levain_bakery;
                        levainBakeryIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(levainBakeryIntent);
                        break;
                    case 4:
                        Intent milkBarIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        milkBarIntent.putExtra(getString(R.string.name), getString(R.string.milk_bar_name));
                        milkBarIntent.putExtra(getString(R.string.title), getString(R.string.milk_bar_title_name));
                        milkBarIntent.putExtra(getString(R.string.number), getString(R.string.milk_bar_number));
                        milkBarIntent.putExtra(getString(R.string.address), getString(R.string.milk_bar_address));
                        milkBarIntent.putExtra(getString(R.string.about), getString(R.string.milk_bar_description));
                        companyBackground = R.drawable.d_momofuku;
                        milkBarIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(milkBarIntent);
                        break;
                    case 5:
                        Intent schmackaryIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        schmackaryIntent.putExtra(getString(R.string.name), getString(R.string.schmackary_name));
                        schmackaryIntent.putExtra(getString(R.string.title), getString(R.string.schmackary_title_name));
                        schmackaryIntent.putExtra(getString(R.string.number), getString(R.string.schmackary_number));
                        schmackaryIntent.putExtra(getString(R.string.address), getString(R.string.schmackary_address));
                        schmackaryIntent.putExtra(getString(R.string.about), getString(R.string.schmackary_description));
                        companyBackground = R.drawable.d_schmackarys;
                        schmackaryIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(schmackaryIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}