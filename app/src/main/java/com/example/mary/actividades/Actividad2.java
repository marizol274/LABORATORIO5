package com.example.mary.actividades;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String msn = this.getIntent().getExtras().getString("msn");// RECUPERA EL MENSAJE QUE SE ENCUENTRA EN ACTIVITYMAIN
        TextView txt= findViewById(R.id.txt);//RECUPERA EL ID DE TEXTVIEW QUE SE ENCUENTRA EN EL DOCUMENTO XML  DE LA ACTIVIDAD1
        txt.setText(msn);// MUESTRA EL MENSAJE RECUPERADO EL EL TEXTVIEW POR MEDIO DEL ID RECUPERADO
    }


}
