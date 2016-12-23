package com.example.android.newyork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(extras.getString("Title"));

        //Set a listener to know the current visible state of CollapseLayout
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(final AppBarLayout appBarLayout, int verticalOffset) {
                //Initialize the size of the scroll
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                //Check if the view is collapsed
                if (scrollRange + verticalOffset == 0) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(LocationDetailActivity.this, R.color.colorStart));
                }else{
                    toolbar.setBackgroundColor(ContextCompat.getColor(LocationDetailActivity.this, R.color.colorEnd));
                }
            }
        });

        TextView detailName = (TextView) findViewById(R.id.detail_name);
        detailName.setText(extras.getString("Name"));

        /*
        This will allow the user to call the location from within the detail
         */
        final TextView detailNumber = (TextView) findViewById(R.id.detail_number);
        detailNumber.setText(extras.getString("Number"));
        final String companyNumber  = extras.getString("Number");
        detailNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + companyNumber));

                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });

        /*
        This will allow the user to find the location on a map within the detail
         */
        TextView detailAddress = (TextView) findViewById(R.id.detail_address);
        detailAddress.setText(extras.getString("Address"));
        final String address  = extras.getString("Address");
        detailAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mapLocation = "http://maps.google.co.in/maps?q=" + address;
                Intent addressIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapLocation));
                startActivity(addressIntent);
            }
        });

        TextView detailAbout = (TextView) findViewById(R.id.detail_about);
        detailAbout.setText(extras.getString("About"));

        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(extras.getInt("Background", 0)).into(imageView);
    }
}
