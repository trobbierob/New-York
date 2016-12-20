package com.example.android.newyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find the View that shows the first card category
        CardView cardView1 = (CardView) findViewById(R.id.card1);
        // Set a clickListener on the view
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(cardViewIntent);
            }
        });

        CardView cardView2 = (CardView) findViewById(R.id.card2);
        // Set a clickListener on the view
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(cardViewIntent);
            }
        });

        CardView cardView3 = (CardView) findViewById(R.id.card3);
        // Set a clickListener on the view
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, PizzaActivity.class);
                startActivity(cardViewIntent);
            }
        });

        CardView cardView4 = (CardView) findViewById(R.id.card4);
        // Set a clickListener on the view
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, CodingActivity.class);
                startActivity(cardViewIntent);
            }
        });
    }
}
