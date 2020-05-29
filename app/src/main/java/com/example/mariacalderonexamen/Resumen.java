package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resumen extends AppCompatActivity {
    TextView datoR, datoR1 ,datoR2, datoR3,datoR4,datoR5,datoR6,datoR7,datoR8;
    Bundle RES;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        datoR = findViewById(R.id.te1);
        datoR1= findViewById(R.id.te2);
        datoR2= findViewById(R.id.te3);
        datoR3= findViewById(R.id.te4);
        datoR4= findViewById(R.id.te5);
        datoR5= findViewById(R.id.te6);
        datoR6= findViewById(R.id.te7);
        datoR7= findViewById(R.id.te8);
        datoR8= findViewById(R.id.te9);

        RES = getIntent().getExtras();

        String recibir = RES.getString("R1");
        datoR.setText(recibir);

        String recibir1 = RES.getString("R2");
        datoR1.setText(recibir1);

        String recibir2 = RES.getString("R3");
        datoR2.setText(recibir2);

        String recibir3 = RES.getString("R4");
        datoR3.setText(recibir3);

        String recibir4 = RES.getString("R5");
        datoR4.setText(recibir4);

        String recibir5 = RES.getString("R6");
        datoR1.setText(recibir5);

        String recibir6 = RES.getString("R7");
        datoR2.setText(recibir6);

        String recibir7 = RES.getString("R8");
        datoR3.setText(recibir7);

        String recibir8 = RES.getString("R9");
        datoR4.setText(recibir8);


    }
    { Toast.makeText(getApplicationContext(), "USUARIO CONECTADO: estudiante2020 ", Toast.LENGTH_LONG).show();}
}
