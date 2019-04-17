package algoritmosjava;

import java.util.LinkedList;

/**
 * Clase AlgoritmosColas {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 17/04/2019
 */
public class AlgoritmosColas {
    public static void main(String[] args) {
        LinkedList cola = new LinkedList();
        cola.addFirst(1);
        cola.addFirst(2);
        cola.addFirst(3);
        cola.addFirst(4);
        cola.addFirst(5);
        cola.removeLast();
        
        for (Object o : cola) {
            System.out.println(o);
        }
        
    }
}
