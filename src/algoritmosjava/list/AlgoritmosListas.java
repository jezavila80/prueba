/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosjava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jezreel_avila
 */
public class AlgoritmosListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosListas al = new AlgoritmosListas();
        // Manejo de listas y arrays
        al.listasArrays();
        // Manejo de listas con Sort
        al.listasSort();
        // Manejo de listas con Iterator
        al.listasIterator();
    }

    public void listasArrays() {
        // Manejo de listas
        List<String> letras = new ArrayList<>();

        // Añadir letras
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");

        System.out.println("Lista: " + letras);

        // Convertir lista a array
        String[] strArray = new String[5];
        letras.toArray(strArray);

        for (String s : strArray) {
            System.out.println("Cadena: " + s);
        }
    }

    public void listasSort() {
        // Manejo de listas
        List<Integer> numeros = new ArrayList<>();

        // Añadir letras
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);

        System.out.println("Lista: " + numeros);

        // ordenamiento natural usando la clase Collections 
        Collections.sort(numeros);

        System.out.println("Cadena: " + numeros);
        
        // Mi ordenamiento al reves
        numeros.sort((o1,o2) -> { return (o2-o1); });
        System.out.println("Cadena al reves: " + numeros);
    }
    
    public void listasIterator() {
        // Manejo de listas
        List<Integer> numeros = new ArrayList<>();

        // Añadir numeros
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);

        System.out.println("Lista: " + numeros);

        // Crear Iterator
        Iterator<Integer> iterator = numeros.iterator();

        // iteración simple
        while (iterator.hasNext()) {
            int i = (int)iterator.next();
            System.out.print(i + ",");
        }
        
        System.out.println("Lista: " + numeros);
    }
}
