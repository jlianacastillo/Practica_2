package com.example.practica_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void lanzarHorario(View  view){
        Intent i = new Intent(this, Horario.class);
        startActivity(i);
    }

    public void lanzarMain(View view){
        Intent a = new Intent( this, MainActivity.class);
        startActivity(a);
    }
}


