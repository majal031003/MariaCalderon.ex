package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {
    EditText ingreso;
    CheckBox cba,cbb, cbc;
    RadioButton rba,rbb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        ingreso = findViewById(R.id.etResp);
        cba= findViewById(R.id.cb1);
        cbb= findViewById(R.id.cb2);
        cbc= findViewById(R.id.cb3);
        rba=findViewById(R.id.rbn1);
        rbb=findViewById(R.id.rbn2);

    }

    public void Enviar (View v) {
        Intent intentEnvio = new Intent(this, Resumen.class);

        if (cba.isChecked() == true) {

            intentEnvio.putExtra("R4", cba.getText().toString());

        }
        if (cbb.isChecked() == true) {

            intentEnvio.putExtra("R5", cbb.getText().toString());

        }

        if (cbc.isChecked() == true) {

            intentEnvio.putExtra("R6", cbc.getText().toString());

        }

        if(rba.isChecked()==true) {

            intentEnvio.putExtra("R7", rba.getText().toString());

        }
        if (rbb.isChecked()==true) {

            intentEnvio.putExtra("R8", rbb.getText().toString());

        }

        intentEnvio.putExtra("R9", ingreso.getText().toString());
        startActivity(intentEnvio);

    }
    { Toast.makeText(getApplicationContext(), "USUARIO CONECTADO: estudiante2020 ", Toast.LENGTH_LONG).show();}
}
