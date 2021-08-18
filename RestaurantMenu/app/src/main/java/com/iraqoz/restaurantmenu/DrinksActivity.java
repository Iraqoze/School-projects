package com.iraqoz.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.ListIterator;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        ListView drinksListView = findViewById(R.id.drinks_list_view);
        ArrayList<Dish> drinks= new ArrayList<>();
        Dish dish1=new Dish("Mango","500 ml Mango Juice",100);
        Dish dish2=new Dish("Mint","500 ml Mint Juice",100);
        Dish dish3=new Dish("Water","250 ml Dasani",40);
        drinks.add(dish1);
        drinks.add(dish2);
        drinks.add(dish3);

        ArrayAdapter<Dish> drinksAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,drinks);
        drinksListView.setAdapter(drinksAdapter);

    }
}