package algoritmosjava;

import java.util.LinkedList;

/**
 * Clase AlgoritmosListasEnlazadas {Inserte una descripción aqui}.
 * 
 * 
 * @author jezreel_avila
 * @created 16/04/2019
 */
public class AlgoritmosListasEnlazadas {
    public static void main(String[] args) {        
        LinkedList ll = new LinkedList();
        
        ll.addFirst("Jezreel");
        ll.addFirst("Arturo");
        ll.addFirst("Avila");
        ll.addFirst("Fierros");
        ll.addFirst("Neto");
        ll.addFirst("Javier");
        
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i).toString());
        }
    }
}
