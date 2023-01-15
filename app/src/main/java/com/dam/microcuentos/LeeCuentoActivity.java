package com.dam.microcuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LeeCuentoActivity extends AppCompatActivity {

    TextView tv_titulo_cuento,tv_texto_cuento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lee_cuento);

        tv_titulo_cuento = findViewById(R.id.tv_titulo_cuento);
        tv_texto_cuento = findViewById(R.id.tv_texto_cuento);

        tv_titulo_cuento.setText(getIntent().getStringExtra("titulo"));
        String nombre = getIntent().getStringExtra("nombre");
        tv_texto_cuento.setText(String.format(getIntent().getStringExtra("texto"), nombre));
    }
}