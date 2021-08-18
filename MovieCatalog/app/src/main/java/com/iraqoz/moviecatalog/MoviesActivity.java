package com.iraqoz.moviecatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        RecyclerView movielist=findViewById(R.id.recycler_view_movies);

        Show s1=new Show("Sentinelle","Following a traumatic experience in Syria, Klara, a highly trained French soldier, is transferred home. The day after a nightclub party, her sister was found raped and almost dead, so Klara uses her lethal skills to hunt down the man responsible.",R.drawable.sentinelle);
        Show s2=new Show("Rogue City","A loyal cop gets caught in the crosshairs of police corruption and warring gangs in Marseille, France, and takes matters into his own hands.",R.drawable.roguecity);
        Show s3=new Show("Sextuplets","When expecting father Alan discovers he has five siblings he's never met before, he decides to reconcile and meet his long lost family before his baby is born.",R.drawable.sextuplets);
        Show[] movies={
                s1,s2,s3,s1,s2,s3
        };

        ShowAdapter movieAdapter = new ShowAdapter(movies);
        movielist.setAdapter(movieAdapter);
    }
}