package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Resumen extends AppCompatActivity {
    TextView datoR, datoR1, datoR2, datoR3, datoR4, datoR5, datoR6, datoR7, datoR8, tvUsuario;
    Bundle RES;
    ArrayList<String> rD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        tvUsuario = findViewById(R.id.tvUsuario);
        datoR = findViewById(R.id.te1);
        datoR1 = findViewById(R.id.te2);

        datoR2 = findViewById(R.id.te3);
        datoR3 = findViewById(R.id.te4);
        datoR4 = findViewById(R.id.te5);


        RES = getIntent().getExtras();
        rD = RES.getStringArrayList("RF");
        Object[] datos = rD.toArray();


        //Toast.makeText(this, "codigo "+datos[0], Toast.LENGTH_SHORT).show();
        tvUsuario.setText("" + datos[0].toString());
        datoR.setText("Nombre: " + datos[1].toString());
        datoR1.setText("Total a pagar: " + datos[2].toString());




        datoR2.setText(datos[3].toString());

        datoR3.setText(datos[4].toString());

        datoR4.setText(datos[5].toString());




    }

}
