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
        mediaPlayer = MediaPlayer.create(this,R.raw.lit );



        iniciar.setOnClickListener(this);
        parar.setOnClickListener(this);

        Button ace = (Button) findViewById(R.id.REGRESAMENU);

        ace = findViewById(R.id.REGRESAMENU);
        ace.setOnClickListener(view -> {
            Intent repro = new Intent (Reproductor.this, Menu.class);
            startActivity(repro);
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