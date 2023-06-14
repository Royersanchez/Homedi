package com.example.homedi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cuidadopersonal extends AppCompatActivity {

    Button Mielycanela;
    Button Aguayvinagredemanzana;
    @SuppressLint("MissingInflatedId")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuidadopersonal);

        Mielycanela =(Button)findViewById(R.id.botonC1);

        Mielycanela.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cuidadopersonal.this, Cuidadopersonal1.class);
                startActivity(i);
            }




        } );
        Aguayvinagredemanzana  =(Button)findViewById(R.id.botonC2);
        Aguayvinagredemanzana .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cuidadopersonal.this, Cuidadopersonal2.class);
                startActivity(i);
            }




        } );

    }

}
