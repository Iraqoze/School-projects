package com.iraqoz.moviecatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView moviesCardview=findViewById(R.id.card_view_movies);
        CardView seriesCardview=findViewById(R.id.card_view_Series);
        CardView animationCardView=findViewById(R.id.card_view_animation);

        moviesCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moviesIntent= new Intent (MainActivity.this, MoviesActivity.class );
                startActivity(moviesIntent);
            }
        });
        seriesCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seriesIntent=new Intent(MainActivity.this, SeriesActivity.class);
                startActivity(seriesIntent);
            }
        });
        animationCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animationIntent=new Intent(MainActivity.this, AnimationsActivity.class);
                startActivity(animationIntent);
            }
        });
    }
}