package com.iraqoz.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText ageEditText, weightEditText, heightEditText;
    private TextView resultEditText;
    private Button calculateButton;
    private RadioButton femaleRadioButton, maleRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
        Toast.makeText(this, "Welcome to the BMI calculator App",Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Iraqoze Copyright 2021",Toast.LENGTH_LONG).show();
    }
    private void findViews(){
        ageEditText =findViewById(R.id.ageTextView);
        weightEditText =findViewById(R.id.weightTextView);
        heightEditText =findViewById(R.id.heightTextView);
        femaleRadioButton =findViewById(R.id.female_radioButton);
        maleRadioButton =findViewById(R.id.male_radioButton);
        calculateButton = findViewById(R.id.calculate_Button);
        resultEditText = findViewById(R.id.resultTextView);
    }

    private void calculateBMI(){
        String ageText= ageEditText.getText().toString();
        String weightText=weightEditText.getText().toString();
        String heightText=heightEditText.getText().toString();

        //Converting the string into integers
        int age=Integer.parseInt(ageText);
        int weight=Integer.parseInt(weightText);
        int height= Integer.parseInt(heightText);

        double result;
        double heightInMeters;

        heightInMeters=(Double.valueOf(height))/100;
        System.out.println(heightInMeters);
        result= weight/(Math.pow(heightInMeters,2));
        displayBMI(result);

    }

    private void displayBMI(double bmi){

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedResult=df.format(bmi);

        //Checking the BMI
        if(bmi>=25.0)
            resultEditText.setText("BMI: "+formattedResult+"\nTherefore, You are overweight");
        else if(bmi<18.5)
            resultEditText.setText("BMI: "+formattedResult+"\nTherefore, You are underweight");
        else
            resultEditText.setText("BMI: "+formattedResult+"\nTherefore, You have normal weight");
        //End
    }
}