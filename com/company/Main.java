package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cancion> canciones = new ArrayList<>();

        ListaBasica listaBasica = new ListaBasica("LOLA");
        ListaPremium listaPremium = new ListaPremium("PALLOZA");

        Artista artista = new Artista("Soda Stereo", 50, "Argentina");
        Album album = new Album(1990, "cancion animal", artista);
        Cancion cancion = new Cancion("cancion animal", 2, Genero.rock, artista, album);
        Cancion cancion1 = new Cancion("loco por ti", 2, Genero.rock, artista, album);
        Cancion cancion2 = new Cancion("Hello baby", 2, Genero.rock, artista, album);
        Cancion cancion3 = new Cancion("All my loving", 2, Genero.rock, artista, album);
        Cancion cancion4 = new Cancion("Dont look at my", 2, Genero.rock, artista, album);

        Reproduccion lista;
        lista = listaBasica;

        lista.añadirCancion(cancion);
        lista.añadirCancion(cancion1);
        lista.añadirCancion(cancion2);

        int opcion = 1;
        Scanner teclado = new Scanner(System.in);


        while (opcion!=5){

            System.out.println("Seleccionar algunas de las siguientes opciones");
            System.out.println("1-Reproducir");
            System.out.println("2-Añadir");
            System.out.println("3-Eliminar");
            System.out.println("4-Listar");
            System.out.println("5-Salir");


            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    String salir="m";
                    Scanner tecla = new Scanner(System.in);
                    while(!salir.equals("p")) {
                        lista.reproducir();
                      salir = tecla.nextLine();
                    }

                    break;
                case 2:

                    if(lista instanceof ListaPremium){

                        lista.añadirCancion(cancion3);
                        System.out.println("2-Añadiendo" + cancion3);
                        lista.añadirCancion(cancion4);
                        System.out.println("2-Añadiendo" + cancion4);

                    }else{
                        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
                    }


                    break;
                case 3:
                    System.out.println("3-Eliminar");
                    lista.eliminarCancion();

                    break;
                case 4:
                    System.out.println("4-Listando canciones");
                    lista.verMiLista();

                    break;
                case 5:

                    break;

                default:

                    System.out.println("Seleccion incorrecta");


            }

        }
    }
}
