package com.example.homedi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mascotas extends AppCompatActivity {

    Button Aceitedecoco;
    Button TedeCacomilla;
    @SuppressLint("MissingInflatedId")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas);

        Aceitedecoco=(Button)findViewById(R.id.botonM);
        TedeCacomilla=(Button)findViewById(R.id.botonM2);

        Aceitedecoco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mascotas.this, Mascotas1.class);
                startActivity(i);
            }




        } );


        TedeCacomilla.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mascotas.this, Mascotas2.class);
                startActivity(i);
            }




        } );

    }

}
