package com.example.homedi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dolores extends AppCompatActivity {

    Button Aguadearroz;
    Button Masticarjengibrefreco;
    @SuppressLint("MissingInflatedId")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dolores);

        Aguadearroz=(Button)findViewById(R.id.dolores1);
        Masticarjengibrefreco=(Button)findViewById(R.id.Dolores2);
        Aguadearroz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(dolores.this, DolordeEstomago.class);
                startActivity(i);
            }




        } );
        Masticarjengibrefreco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(dolores.this, DolordeEstomago2.class);
                startActivity(i);
            }




        } );





    }
}