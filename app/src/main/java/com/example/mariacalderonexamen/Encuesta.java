package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Encuesta extends AppCompatActivity {
    EditText ingreso;
    CheckBox cba,cbb, cbc;
    RadioButton rba,rbb;

    Bundle dRecibidos;
    ArrayList<String> rDatos;

    TextView tvUsuario;
    String nombre;
    String total;


    ArrayList alf = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        tvUsuario = findViewById(R.id.tvUsuario);

        dRecibidos = getIntent().getExtras();
        rDatos = dRecibidos.getStringArrayList("R");
        Object[] datos = rDatos.toArray();

        tvUsuario.setText("Usuario: "+datos[0].toString());
        nombre = datos[1].toString();
        total = datos[2].toString();
        ingreso = findViewById(R.id.etResp);
        cba= findViewById(R.id.cb1);
        cbb= findViewById(R.id.cb2);
        cbc= findViewById(R.id.cb3);
        rba=findViewById(R.id.rbn1);
        rbb=findViewById(R.id.rbn2);

    }

    public void Enviar (View v) {

        alf.add(tvUsuario.getText().toString());
        alf.add(nombre);
        alf.add(total);

        Intent intentEnvio = new Intent(Encuesta.this, Resumen.class);
        if (cba.isChecked() == true) {
            alf.add(cba.getText().toString());


        }
        else if (cbb.isChecked() == true) {
            alf.add(cbb.getText().toString());


        }

        else if (cbc.isChecked() == true) {
            alf.add(cbc.getText().toString());


        }


        if(rba.isChecked()==true) {
            alf.add(rba.getText().toString());

        }
        else {
            alf.add(rbb.getText().toString());


        }


        alf.add(ingreso.getText().toString());


        intentEnvio.putExtra("RF", alf);
        startActivity(intentEnvio);

    }

}
