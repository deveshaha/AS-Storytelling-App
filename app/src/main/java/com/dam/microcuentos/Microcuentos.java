package com.dam.microcuentos;

import android.app.Application;

public class Microcuentos extends Application {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

