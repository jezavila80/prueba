/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosjava;

/**
 *
 * @author jezreel_avila
 */
public class AlgoritmoCaracol2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int caption = 0; 
        try {
            caption = Integer.parseInt(args[0]);
        } catch (Exception e) {
            
        }
        int[][] arreglo = null;
        int n = caption > 0 ? caption : 5;
        int nlimite = n - 1;
        arreglo = new int [n][n];
        
        caracol(arreglo, n, nlimite);
    }
    
    private static void caracol(int arreglo [][], int n, int nlimite) {
        int inicio = 0;
        int c = 1;
        while (c <= (n * n)) {
            for (int i = inicio; i <= nlimite; i++) {
                arreglo[inicio][i] = c++;
            }
            for (int i = inicio + 1; i <= nlimite; i++) {
                arreglo[i][nlimite] = c++;
            }
            for (int i = nlimite - 1; i >= inicio; i--) {
                arreglo[nlimite][i] = c++;
            }
            for (int i = nlimite - 1; i >= inicio + 1; i--) {
                arreglo[i][inicio] = c++;
            }
            inicio = inicio + 1;
            nlimite = nlimite - 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(arreglo[i][j] +"\t");
            }            
        }
    }
    
}
