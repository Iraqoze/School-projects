package com.iraqoz.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inchesEditText;
    private TextView metersTextView;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });

        Toast.makeText(this,"Welcome to the unit converter App", Toast.LENGTH_LONG);
        Toast.makeText(this,"Brought to You by Iraqoze", Toast.LENGTH_LONG);

    }
    private void findviews(){
        inchesEditText=findViewById(R.id.inchesTextView);
        metersTextView=findViewById(R.id.metersTextView);
        convertButton=findViewById(R.id.convertButton);
    }
    private void convert(){
        String inchesText=inchesEditText.getText().toString();
        //converting the units to double
        double inches= Double.valueOf(inchesText);
        double meters = inches * 0.0254;
        DecimalFormat df=new DecimalFormat("#.##");

        if(meters >= 1000)
            metersTextView.setText(df.format(meters/1000)+ " Km");
        else if( meters<1)
            metersTextView.setText((df.format(meters * 100))+" Cm");
        else
            metersTextView.setText(df.format(meters)+ " m");
    }


}