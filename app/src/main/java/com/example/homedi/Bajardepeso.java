package com.example.homedi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Bajardepeso extends AppCompatActivity {


    Button Piñafrescalinazamolidayagua;
    Button Aguaconjengibreralladoyjugodelimonfresco;
    @SuppressLint("MissingInflatedId")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bajardepeso);


        Piñafrescalinazamolidayagua=(Button)findViewById(R.id.Bpeso1);


        Piñafrescalinazamolidayagua.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bajardepeso.this, Peso1.class);
                startActivity(i);
            }




        } );


        Aguaconjengibreralladoyjugodelimonfresco=(Button)findViewById(R.id.Bpeso2);


        Aguaconjengibreralladoyjugodelimonfresco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bajardepeso.this, Peso2.class);
                startActivity(i);
            }




        } );

    }

}
