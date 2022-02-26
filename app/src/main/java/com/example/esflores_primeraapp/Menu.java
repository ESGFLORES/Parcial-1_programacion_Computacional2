package com.example.esflores_primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Menu extends AppCompatActivity {
    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button ControlesBasicos = (Button) findViewById(R.id.btControlesBasicos);

        ControlesBasicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent (Menu.this,EnviarDatos.class);
                startActivity(i);
            }
        });

        Button ace = (Button) findViewById(R.id.bSensores);

        ace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent (Menu.this,EjemploAcelerometro.class);
                startActivity(j);
            }
        });

        ace = findViewById(R.id.btnTabs);
        ace.setOnClickListener(view -> {
        Intent tb = new Intent (getApplicationContext(), EjemploTabs.class);
        startActivity(tb);
        });

        ace = findViewById(R.id.btReproductor);
        ace.setOnClickListener(view -> {
            Intent Menu = new Intent (getApplicationContext(), Reproductor.class);
            startActivity(Menu);
        });



    }
}