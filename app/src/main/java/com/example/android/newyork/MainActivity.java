package com.example.android.newyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the first card category
        CardView cardView = (CardView) findViewById(R.id.card1);
        // Set a clickListener on the view
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViewIntent = new Intent(MainActivity.this, Location1.class);
                startActivity(cardViewIntent);
            }
        });
    }
}
