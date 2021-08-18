package com.iraqoz.moviecatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        RecyclerView serieslist = findViewById(R.id.recycler_view_series);

        Show s1=new Show("The Irregulars","Misfits investigate a series of supernatural crimes in Victorian London for Dr. Watson and his shadowy associate, Sherlock Holmes.",R.drawable.irregulars);
        Show s2=new Show("Grand Army","Five students at the largest public high school in Brooklyn take on a chaotic world as they fight to succeed, survive, break free, and seize the future.",R.drawable.grandarmy);

        Show[] series={
                s1,s2,s1,s2,s1,s2
        };

        ShowAdapter seriesAdapter = new ShowAdapter(series);
        serieslist.setAdapter(seriesAdapter);
    }
}