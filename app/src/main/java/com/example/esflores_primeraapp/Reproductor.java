package com.example.esflores_primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reproductor extends AppCompatActivity implements
        View.OnClickListener {
    Button iniciar, parar;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        iniciar = (Button)findViewById(R.id.btIniciar);
        parar = (Button)findViewById(R.id.btDetener);
        mediaPlayer = MediaPlayer.create(this,R.raw.bart);



        iniciar.setOnClickListener(this);
        parar.setOnClickListener(this);

        Button ace = (Button) findViewById(R.id.REGRESAMENU);

        ace = findViewById(R.id.REGRESAMENU);
        ace.setOnClickListener(view -> {
            Intent REPRODUCTOR = new Intent (getApplicationContext(), Menu.class);
            startActivity(REPRODUCTOR);
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btIniciar:
                play();
                break;
            case R.id.btDetener:
                stop();
                break;
        }
    }

    private void play(){
        mediaPlayer.start();
    }

    private void stop(){
        mediaPlayer.stop();
    }




}