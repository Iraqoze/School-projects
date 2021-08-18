package com.iraqoz.myportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list;
        list=findViewById(R.id.recycler_view_projects);

        Project gettingStartedProject=new Project("Getting Started","This is my very first android application which displays hello world",R.drawable.gettingstarted);
        Project quoteApp=new Project("Quote Generator","This Application, as the name suggests, displays a number of quotes",R.drawable.quote);
        Project bmiCalculator=new Project("BMI calculator","This application enables the user to calculate their body to mass index ",R.drawable.image);
        Project restaurant=new Project("Restaurant","This application enables the user to view the rstaurant menu and to select their desired meal",R.drawable.restaurant);
        Project myPortfolio=new Project("Portfolio","The very current application in use. It display all the projects that i have done",R.drawable.portfolio);
        Project[] projects = {
                gettingStartedProject,
                quoteApp,
                bmiCalculator,
                restaurant,
                myPortfolio,
                gettingStartedProject,
                quoteApp,
                bmiCalculator,
                restaurant,
                myPortfolio
        };

        ProjectsAdapter adapter =new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}