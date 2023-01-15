package com.dam.microcuentos.model;

public class Cuento {
    private String titulo;
    private String avance;
    private String texto;

    public Cuento(String titulo, String avance, String texto) {
        this.titulo = titulo;
        this.avance = avance;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAvance() {
        return avance;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "Cuento{" +
                "titulo='" + titulo + '\'' +
                ", avance='" + avance + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }
}
