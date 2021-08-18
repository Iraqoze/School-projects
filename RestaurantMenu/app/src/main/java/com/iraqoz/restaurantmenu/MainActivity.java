package com.iraqoz.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView starterCard, mealsCard, drinksCard;
    TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterCard=findViewById(R.id.card_view_starters);
        mealsCard=findViewById(R.id.card_view_meals);
        drinksCard=findViewById(R.id.card_view_drinks);
        emailTextView=findViewById(R.id.email_address_TextView);

        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starterActivityIntent= new Intent(MainActivity.this, StarterActivity.class);
                startActivity(starterActivityIntent);
            }
        });
        mealsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mealsActivityIntent=new Intent(MainActivity.this, MealsActivity.class);
                startActivity(mealsActivityIntent);
            }
        });
        drinksCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drinksActivityIntent=new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(drinksActivityIntent);
            }
        });
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailLaunchAppIntent= new Intent(Intent.ACTION_SENDTO);
                emailLaunchAppIntent.setData(Uri.parse("mailto:shawnbienvenu@gmail.com"));
                startActivity(emailLaunchAppIntent);
            }
        });
    }
}