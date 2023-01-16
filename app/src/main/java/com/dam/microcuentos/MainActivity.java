package com.dam.microcuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btn_empezar;
    EditText et_nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_empezar = findViewById(R.id.btn_empezar);
        et_nombre = findViewById(R.id.et_nombre);

        btn_empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = et_nombre.getText().toString();
                if (nombre.isEmpty()){
                    Snackbar.make(view, "Debes introducir un nombre", Snackbar.LENGTH_LONG).show();
                } else {
//                  usamos el método setNombre de la clase Microcuentos para guardar el nombre del usuario
                    ((Microcuentos)getApplication()).setNombre(nombre);
                    Intent i = new Intent(MainActivity.this, EligeCuentoActivity.class);
//                  i.putExtra("nombre", nombre);
                    startActivity(i);
                }
            }
        });

    }
}