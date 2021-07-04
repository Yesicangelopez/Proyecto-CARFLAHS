package com.example.carflahs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.Theme_CARFLAHS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // configuración del boton conductor para pasar a la activity conductor

        Button btnConductor;
        btnConductor = findViewById(R.id.btnConductor);

        btnConductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityConductor.class);
                startActivity(intent);

            }
        });

        // configuración del boton conductor para pasar a la activity pasajero

        Button btnPasajero;
        btnPasajero = findViewById(R.id.btnPasajero);

        btnPasajero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityPasajero.class);
                startActivity(intent);

            }
        });

    }
}