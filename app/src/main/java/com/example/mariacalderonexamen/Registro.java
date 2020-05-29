package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText ingreso, ingreso1 , ingreso2;
    TextView ingreso3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ingreso = findViewById(R.id.etNombre);
        ingreso1 = findViewById(R.id.etMonto);
        ingreso2 = findViewById(R.id.etPago);
        ingreso3 = findViewById(R.id.te3);
    }
    public void Calcular (View v) {
        double  A,B,B1,T1,VC,TOT;
        A = Double.parseDouble(ingreso1.getText().toString());
        VC = 1800;
        T1= VC-A;
        B = T1/3;
        B1 = ((B * 0.05)+B);
        TOT = B1 + A;
        ingreso2.setText(Double.toString(B));
        ingreso3.setText(Double.toString(TOT));
    }

    public void Guardar (View v) {
        Intent intentEnvio = new Intent(Registro.this, Resumen.class);

        intentEnvio.putExtra("R1", ingreso.getText().toString());
        intentEnvio.putExtra("R2", ingreso1.getText().toString());
        intentEnvio.putExtra("R3", ingreso3.getText().toString());

        Toast.makeText(getApplicationContext(), "ELEMENTO GUARDADO CON EXITO", Toast.LENGTH_LONG).show();

        startActivity(intentEnvio);

    }
    {
        Toast.makeText(getApplicationContext(), "USUARIO CONECTADO: estudiante2020 ", Toast.LENGTH_LONG).show();
    }
}

