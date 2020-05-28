package com.company;


public class Cancion {
    private String name;
    private int duracion;
    private Genero genero;
    private Artista artista;
    private Album album;


    public Cancion(String name, int duracion, Genero genero, Artista artista, Album album) {
        this.name = name;
        this.duracion = duracion;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "name='" + name + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", artista=" + artista +
                ", album=" + album +
                '}';
    }
}
