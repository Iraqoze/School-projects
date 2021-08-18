package com.iraqoz.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        ListView starterListView =findViewById(R.id.starter_list_view);
        ArrayList<Dish> dishes=new ArrayList<>();

        Dish dish1=new Dish("Faraja","Binadamu",500);
        Dish dish2=new Dish("Bienvenu","Munyama",100);
        Dish dish3=new Dish("Mwenzangu","Kuku",00);
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);

        ArrayAdapter<Dish> starterAdapter=new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1, dishes);
        starterListView.setAdapter(starterAdapter);
    }
}