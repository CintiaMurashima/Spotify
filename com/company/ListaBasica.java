package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ListaBasica implements Reproduccion {

    private String name;
    private Stack<Cancion> miLista= new Stack<>();
    private Stack<Cancion> miListaAux= new Stack<>();


    public ListaBasica(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public Stack<Cancion> getMiLista() {
            return miLista;
        }

        public void setMiLista(Stack<Cancion> miLista) {
            this.miLista = miLista;
        }

        @Override
        public void reproducir() {
        Cancion cancion=miLista.pop();
        System.out.println("Reproduciendo" + cancion);

        while (!miLista.empty()) {
                miListaAux.push(miLista.pop());
            }
        miLista.push(cancion);

        while(!miListaAux.empty()){
            miLista.push(miListaAux.pop());
        }
    }


    @Override
    public void añadirCancion(Cancion cancion) {
        System.out.println("Añadiendo una cancion a la lista");
        miLista.add(cancion);
    }


    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verMiLista() {
        for(Cancion cancion: miLista) {
            System.out.println(cancion);
        }
    }

    @Override
    public String toString() {
        return "ListaBasica" +
                "name='" + name + '\'' +
                "miLista=" + miLista;
    }
}
