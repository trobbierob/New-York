package com.example.android.newyork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sogekingu on 12/11/16.
 */

public class LocationDetailActivity extends AppCompatActivity{

    public static final String EXTRA_NAME = "location_name";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        TextView detailName = (TextView) findViewById(R.id.detail_name);
        detailName.setText(extras.getString("Name"));

        TextView detailNumber = (TextView) findViewById(R.id.detail_number);
        detailNumber.setText(extras.getString("Number"));

        TextView detailAddressLineA = (TextView) findViewById(R.id.detail_addy_1);
        detailAddressLineA.setText(extras.getString("AddressLineA"));

        TextView detailAddressLineB = (TextView) findViewById(R.id.detail_addy_2);
        detailAddressLineB.setText(extras.getString("AddressLineB"));

        TextView detailAbout = (TextView) findViewById(R.id.detail_about);
        detailAbout.setText(extras.getString("About"));

    }
}
