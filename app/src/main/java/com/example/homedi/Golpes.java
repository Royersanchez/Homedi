package com.example.homedi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Golpes extends AppCompatActivity {

    Button Compresasfrias;
    Button Curcuma;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.golpes);

        Compresasfrias=(Button)findViewById(R.id.BotonGolpes);
        Curcuma=(Button)findViewById(R.id.botongolpes2);

        Compresasfrias.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Golpes.this, golpes1.class);
                startActivity(i);
            }




        } );

        Curcuma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Golpes.this, Golpes2.class);
                startActivity(i);
            }




        } );


    }
}
