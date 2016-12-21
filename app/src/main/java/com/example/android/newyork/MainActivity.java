package com.example.android.newyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        Random rand = new Random();
        int num = rand.nextInt(4);

        switch (num) {
            case 0:
                ImageView introImageView1 = (ImageView) findViewById(R.id.main_photo);
                introImageView1.setImageResource(R.drawable.main_1);
                break;
            case 1:
                ImageView introImageView2 = (ImageView) findViewById(R.id.main_photo);
                introImageView2.setImageResource(R.drawable.main_2);
                break;
            case 2:
                ImageView introImageView3 = (ImageView) findViewById(R.id.main_photo);
                introImageView3.setImageResource(R.drawable.main_3);
                break;
            case 3:
                ImageView introImageView4 = (ImageView) findViewById(R.id.main_photo);
                introImageView4.setImageResource(R.drawable.main_4);
                break;
            case 4:
                ImageView introImageView5 = (ImageView) findViewById(R.id.main_photo);
                introImageView5.setImageResource(R.drawable.main_5);
                break;
            case 5:
                ImageView introImageView6 = (ImageView) findViewById(R.id.main_photo);
                introImageView6.setImageResource(R.drawable.main_6);
                break;
            case 6:
                ImageView introImageView7 = (ImageView) findViewById(R.id.main_photo);
                introImageView7.setImageResource(R.drawable.main_7);
                break;
            default:
                break;
        }

        // Find the View that shows the first card category
        CardView cardView1 = (CardView) findViewById(R.id.dessert);
        // Set a clickListener on Dessert card
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(cardViewIntent);
            }
        });

        CardView cardView2 = (CardView) findViewById(R.id.museum);
        // Set a clickListener on Museum card
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(cardViewIntent);
            }
        });

        CardView cardView3 = (CardView) findViewById(R.id.pizza);
        // Set a clickListener on Pizza card
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, PizzaActivity.class);
                startActivity(cardViewIntent);
            }
        });

        CardView cardView4 = (CardView) findViewById(R.id.coding);
        // Set a clickListener on Coding card
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, CodingActivity.class);
                startActivity(cardViewIntent);
            }
        });
    }
}
