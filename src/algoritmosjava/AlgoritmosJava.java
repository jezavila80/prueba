/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosjava;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author jezreel_avila
 */
public class AlgoritmosJava {

    /**
     * @param args the command line arguments
     */
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
        burbuja(arr);
    }

    static void burbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                //if (arreglo[j] < arreglo[j + 1]) {
                if (j < arreglo.length) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
                //}
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
        }
    }
}
