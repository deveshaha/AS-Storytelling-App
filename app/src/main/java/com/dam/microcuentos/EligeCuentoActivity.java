package com.dam.microcuentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dam.microcuentos.model.Cuento;
import com.dam.microcuentos.model.FuenteDatos;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class EligeCuentoActivity extends AppCompatActivity {

    RecyclerView rv;
    CuentoAdapter adapter;
    RecyclerView.LayoutManager lm;
    FuenteDatos datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elige_cuento);

        rv = findViewById(R.id.rv_cuentos);

        datos = new FuenteDatos();
        adapter = new CuentoAdapter(datos.getListaCuentos());
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = rv.getChildAdapterPosition(view);
                String nombre = getIntent().getStringExtra("nombre");

                Intent i = new Intent(EligeCuentoActivity.this, LeeCuentoActivity.class);
                i.putExtra("titulo", datos.getListaCuentos().get(pos).getTitulo());
                i.putExtra("texto", datos.getListaCuentos().get(pos).getTexto());
                i.putExtra("nombre", nombre);
                startActivity(i);
            }
        });

        lm = new LinearLayoutManager(this);

        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }
}