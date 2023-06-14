package com.example.homedi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalladeincio extends AppCompatActivity {

    Button Dolores;
    Button Bajardepeso;
    Button Mascotas;
    Button Cuidadopersonal;
    Button Golpes;
    @SuppressLint("MissingInflatedId")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalladeinicio);

        Dolores=(Button)findViewById(R.id.botonB);
        Bajardepeso=(Button)findViewById(R.id.botonC);
        Mascotas=(Button)findViewById(R.id.botonD);
        Cuidadopersonal=(Button)findViewById(R.id.botonE);
        Golpes=(Button)findViewById(R.id.botonF);
        Dolores.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalladeincio.this, dolores.class);
                startActivity(i);
            }




        } );

        /*aqui vas a poner lo siguiente boton*/

        Bajardepeso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalladeincio.this, Bajardepeso.class);
                startActivity(i);
            }




        } );

        Mascotas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalladeincio.this, Mascotas.class);
                startActivity(i);
            }




        } );


        Cuidadopersonal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalladeincio.this, Cuidadopersonal.class);
                startActivity(i);
            }




        } );


        Golpes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pantalladeincio.this, Golpes.class);
                startActivity(i);
            }




        } );


    }





}

