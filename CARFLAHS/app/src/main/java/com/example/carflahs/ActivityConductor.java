package com.example.carflahs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityConductor extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);

        // asignar una accion al TextView (btnRegistrar) para pasar ala activitivy registro

        TextView btnRegistrar;

        btnRegistrar = findViewById(R.id.btnRegistar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityConductor.this,ActivityRegistro.class);
                startActivity(intent);

            }
        });



    }
}