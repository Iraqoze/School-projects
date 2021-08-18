package com.iraqoz.moviecatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
        RecyclerView animationlist=findViewById(R.id.recycler_view_animation);

        Show s1=new Show("The Irregulars","Misfits investigate a series of supernatural crimes in Victorian London for Dr. Watson and his shadowy associate, Sherlock Holmes.",R.drawable.irregulars);
        Show s2=new Show("Grand Army","Five students at the largest public high school in Brooklyn take on a chaotic world as they fight to succeed, survive, break free, and seize the future.",R.drawable.grandarmy);
        Show s3=new Show("Sentinelle","Following a traumatic experience in Syria, Klara, a highly trained French soldier, is transferred home. The day after a nightclub party, her sister was found raped and almost dead, so Klara uses her lethal skills to hunt down the man responsible.",R.drawable.sentinelle);
        Show s4=new Show("Rogue City","A loyal cop gets caught in the crosshairs of police corruption and warring gangs in Marseille, France, and takes matters into his own hands.",R.drawable.roguecity);
        Show s5=new Show("Sextuplets","When expecting father Alan discovers he has five siblings he's never met before, he decides to reconcile and meet his long lost family before his baby is born.",R.drawable.sextuplets);

        Show[] animations={
                s1,s2,s3,s4,s5
        };
        ShowAdapter animationAdapter=new ShowAdapter(animations);
        animationlist.setAdapter(animationAdapter);
    }
}