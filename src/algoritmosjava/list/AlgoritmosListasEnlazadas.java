/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmosjava.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jezreel_avila
 * @since  31-may-2019
 */
public class AlgoritmosListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosListasEnlazadas lz = new AlgoritmosListasEnlazadas();        
        
        // Manejo de listas enlazadas con List
        lz.enlazadasList();
        // Manejo de listas enlazadas con Deque
        lz.enlazadasDeque();
        // Manejo de listas enlazadas con Stream
        lz.enlazadasStream();
        // Manejo de listas enlazadas y sus metodos
        lz.enlazadasMetodos();
    }
    
    public void enlazadasList() {
        // Manejo de listas enlazadas
        List nombres = new LinkedList();
        
        // añadimos nombres
        nombres.add("Ramos");
        //nombres.addFirst("Ramos"); Genera error de compilación
        nombres.add("Rosas");
        nombres.add("Chinni");
        nombres.add(2011);
        
        System.out.println("Listas: " + nombres);        
    }
    
    public void enlazadasDeque() {
        // Manejo de listas enlazadas
        Deque nombres = new LinkedList();
        
        // añadimos nombres
        nombres.add("Ramos");
        nombres.addFirst("Romero"); //No genera error de compilación 
                                   //ya que hereda metodos de Deque
        nombres.addLast("Rosas");
        nombres.addFirst("Chinni");
        nombres.addLast(2011);
        
        System.out.println("Listas: " + nombres);        
        
        // removemos primero y el ultimo
        nombres.removeFirst();
        nombres.removeLast();
        
        System.out.println("Listas: " + nombres);
    }
    
    public void enlazadasStream() {
        // Manejo de listas enlazadas
        List<Integer> numeros = new LinkedList<Integer>();
        
        // añadimos nombres
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        numeros.stream().forEach(System.out::println);
    }
    
    public void enlazadasMetodos() {
        // Manejo de listas enlazadas
        List<Integer> numeros = new LinkedList<Integer>();
        
        // añadimos nombres
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        numeros.add(3,9);
        System.out.println("Listas: " + numeros);
        
        numeros.remove(1);
        System.out.println("Listas: " + numeros);
    }

}
