package com.company;

public class Album {

    private int añoPublicacion;
    private String titulo;
    private Artista artista;

    public Album(int añoPublicacion, String titulo, Artista artista) {
        this.añoPublicacion = añoPublicacion;
        this.titulo = titulo;
        this.artista = artista;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "añoPublicacion=" + añoPublicacion +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
