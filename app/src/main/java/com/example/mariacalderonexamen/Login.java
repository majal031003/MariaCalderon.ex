package com.example.mariacalderonexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText usuario, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.etUsuario);
        contraseña = findViewById(R.id.etContraseña);
    }
    public void log(View v) {
        if (usuario.getText().toString().equals("estudiante2020") && contraseña.getText().toString().equals("uisrael2020")) {
            Toast.makeText(getApplicationContext(), "USUARIO CONECTADO: estudiante2020 ", Toast.LENGTH_LONG).show();
            Intent intentEnvio = new Intent(Login.this,Registro.class);
            intentEnvio.putExtra("datoUsuario", usuario.getText().toString());
            startActivity(intentEnvio);
        } else {
            Toast.makeText(getApplicationContext(), "DATO INCORRECTO", Toast.LENGTH_LONG).show();
        }
    }
}
