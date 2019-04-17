package algoritmosjava;

import java.util.Stack;

/**
 * Clase AlgoritmosPilas {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 17/04/2019
 */
public class AlgoritmosPilas {
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        
        
        for (Object i : pila) {
            System.out.println(i);
        }
        
    }
}
