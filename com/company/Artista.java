package com.company;

public class Artista {

    private String name;
    private int edad;
    private String nacionalidad;


    public Artista(String name, int edad, String nacionalidad) {
        this.name = name;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
