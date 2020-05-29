package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {
    EditText ingreso,ingreso1;
    TextView ingreso2, ingreso3;

    TextView tvUsuario;
    Bundle usuarioRecibido;
    String recibirUsuario;

    ArrayList al = new ArrayList();

    double TOT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        tvUsuario = findViewById(R.id.tvUsuario);
        usuarioRecibido = getIntent().getExtras();
        recibirUsuario = usuarioRecibido.getString("datoUsuario");
        tvUsuario.setText(recibirUsuario);

        ingreso = findViewById(R.id.etNombre);
        ingreso1 = findViewById(R.id.etMonto);
        ingreso2 = findViewById(R.id.tvPago);
        ingreso3 = findViewById(R.id.tvTotal);

    }

    public void Calcular(View v) {
        double A, B, B1, T1, VC;
        A = Double.parseDouble(ingreso1.getText().toString());
        VC = 1800;
        T1 = VC - A;
        B = T1 / 3;
        B1 = ((B * 0.05) + B);
        TOT = B1 + A;

        ingreso2.setText("  "+B);
        ingreso3.setText("  "+TOT);
    }

    public void Guardar(View v) {

        String nombreP;

        nombreP = ingreso.getText().toString();

        al.add(recibirUsuario);
        al.add(nombreP);
        al.add(TOT);

        Intent intentEnvio = new Intent(Registro.this, Encuesta.class);
        intentEnvio.putExtra("R", al);
        startActivity(intentEnvio);

        Toast.makeText(getApplicationContext(), "ELEMENTO GUARDADO CON EXITO", Toast.LENGTH_LONG).show();

    }


}

