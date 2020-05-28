package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ListaPremium implements Reproduccion{

    private String name;
    private LinkedList<Cancion> miLista=new LinkedList<>();


    public ListaPremium(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(LinkedList<Cancion> miLista) {
        this.miLista = miLista;
    }

    public void mostrarLista(){
        for(Cancion cancion: miLista) {
            System.out.println(cancion);
        }
    }

    @Override
    public void reproducir() {
        String elegida;

        Iterator iterador = miLista.iterator();
        Scanner teclado = new Scanner(System.in);
        mostrarLista();
        System.out.println("Seleccionar una cancion para escuchar");
        elegida = teclado.nextLine();

        while(iterador.hasNext()){
            Object cancion=iterador.next();
            Cancion c=(Cancion) cancion;
            if(elegida.equals(c.getName())) {
                System.out.println("Escuchando" + c);
            }
        }
    }



    @Override
    public void añadirCancion(Cancion cancion) {
        System.out.println("Añadiendo una cancion a la lista");
        miLista.add(cancion);
    }

    @Override
    public void eliminarCancion() {
        String elegida;
        boolean encontrado=false;
        Iterator iterador = miLista.iterator();
        Scanner teclado = new Scanner(System.in);
        mostrarLista();
        System.out.println("Seleccionar el nombre de una cancion para eliminar");
        elegida = teclado.nextLine();

        while(iterador.hasNext() && encontrado == false){
            Object cancion=iterador.next();
            Cancion c=(Cancion) cancion;
            if(elegida.equals(c.getName())){
                System.out.println("Eliminando " + c);
                miLista.remove(c);
                encontrado=true;
            }
        }
    }

    @Override
    public void verMiLista() {
        mostrarLista();
    }

    @Override
    public String toString() {
        return "ListaPremium" +
                "name='" + name + '\'' +
                "miLista=" + miLista;
    }
}
