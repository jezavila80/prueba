package algoritmosjez;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Clase AlgoritmoJezReverse {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 16/04/2019
 */
public class AlgoritmoJezReverse {
    public static void main(String[] args) throws IOException {
        /*creacion del objeto para leer por teclado*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        /*ingreso del tamaño de arreglos*/
        System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
        int tam = Integer.parseInt(in.readLine());
        /*creacion del arreglo*/
        int arr[] = new int[tam];
        System.out.println();
        /*lectura del arreglo*/
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j += 1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        reverseJez(arr);
    }
    static void reverseJez(int arreglo[]) {
        int impar = parImpar(arreglo);
        int inicio = 0;
        int fin = arreglo.length - 1;
        int maximo = sacarLimite(arreglo, impar);
        for (int i = 0; i <= maximo; i++) {
            int tmp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = tmp;
            inicio = inicio + 1;
            fin = fin - 1;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+"\t");
        }
    }
    static int parImpar(int arreglo[]) {
        if (arreglo.length % 2 != 0) {
            return (arreglo.length / 2);
        }
        return 0;
    }
    static int sacarLimite(int arreglo [], int impar) {
        if (impar > 0) {
            return impar - 1;
        } else {
            return (arreglo.length / 2) - 1;
        }
    }
}
