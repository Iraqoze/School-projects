package com.iraqoz.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        ListView mealsListView = findViewById(R.id.meals_list_view);
        ArrayList<Dish> meals=new ArrayList<>();

        Dish meal1=new Dish("Chips","Roasted",100);
        Dish meal2=new Dish("Wings","Ewanq Msinisumbue",200);
        Dish meal3=new Dish("Ugali Sukuma Nyama","Ni hio hio",150);
        meals.add(meal1);
        meals.add(meal2);
        meals.add(meal3);

        ArrayAdapter<Dish> mealsAdapter = new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1,meals);
        mealsListView.setAdapter(mealsAdapter);

    }
}