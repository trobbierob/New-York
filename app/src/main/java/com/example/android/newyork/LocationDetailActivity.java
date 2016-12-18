package com.example.android.newyork;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Sogekingu on 12/11/16.
 */

public class LocationDetailActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(extras.getString("Name"));

        TextView detailName = (TextView) findViewById(R.id.detail_name);
        detailName.setText(extras.getString("Name"));

        TextView detailNumber = (TextView) findViewById(R.id.detail_number);
        detailNumber.setText(extras.getString("Number"));

        TextView detailAddressLineA = (TextView) findViewById(R.id.detail_address);
        detailAddressLineA.setText(extras.getString("Address"));

        TextView detailAbout = (TextView) findViewById(R.id.detail_about);
        detailAbout.setText(extras.getString("About"));

        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(extras.getInt("Background", 0)).into(imageView);
    }
}
