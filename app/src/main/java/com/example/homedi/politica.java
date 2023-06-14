package com.example.homedi;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class politica extends AppCompatActivity {
    Button Aceptar;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.politica);
       Aceptar=(Button)findViewById(R.id.botonA);

Aceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               Intent i = new Intent(politica.this, Pantalladeincio.class);
                startActivity(i);
            }



        } );
    }
}