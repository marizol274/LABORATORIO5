package com.example.mary.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponents();
    }

    private void loadComponents() {

        //RECUPERA EL ID DE LOS BOTONES
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){ // RECUPERA EL ID DEL VIEW INTRODUCIDO
            case R.id.btn1:{
                Intent actividad1 =new Intent(this, Actividad1.class); // CREA UNA NUEVA INTEN PARA LA ACTIVIDAD1
                actividad1.putExtra("msn", "vamos a la actividad 1"); //PASA EL MENSAJE A INTANT CREADA
                startActivity(actividad1); // INICIALIZA LA ACTIVIDAD
                break;
            }
            case R.id.btn2:{
                Intent actividad2=new Intent(this,Actividad2.class );// CREA UNA NUEVA INTEN PARA LA ACTIVIDAD2
                actividad2.putExtra("msn", "vamos a la actividad 2");//PASA EL MENSAJE A INTANT CREADA
                startActivity(actividad2);// INICIALIZA LA ACTIVIDAD
                break;

            }
            case R.id.btn3:{
                Intent actividad3=new Intent(this,Actividad3.class );// CREA UNA NUEVA INTEN PARA LA ACTIVIDAD 3
                actividad3.putExtra("msn", "vamos a la actividad 3");//PASA EL MENSAJE A INTANT CREADA
                startActivity(actividad3);// INICIALIZA LA ACTIVIDAD
                break;

            }
            case R.id.btn4:{
                Intent actividad4=new Intent(this,Actividad4.class );//se encarga de llamar las activdades
                actividad4.putExtra("msn", "vamos a la actividad 4");//se encarga de pasar parametros entre ellos
                startActivity(actividad4); // INICIALIZA LA ACTIVIDAD 4
                break;

            }

        }
    }
}