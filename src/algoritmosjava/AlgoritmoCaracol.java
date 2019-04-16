package algoritmosjava;

/**
 * Clase AlgoritmoCaracol {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 15/04/2019
 */
public class AlgoritmoCaracol {
    public static void main(String[] args) {
        int [][] matriz = null;
        matriz = new int [10][10];
        int n = 3;
        int nlimite = n - 1;
        caracol(matriz, n, nlimite);
        imprimir(matriz, nlimite);
    }
    static void caracol(int matriz[][], int n, int nlimite) {
        int c = 1, inicio = 0;
        
        if (n > matriz.length) {
            System.out.println("El indice meta supera el numero de espacios en el arreglo");
            System.exit(0);
        }
        while (c <= (n * n)) {
            for (int i = inicio; i <= nlimite; i++) {
                matriz[inicio] [i] = c++;
            }
            for (int i = inicio + 1; i <= nlimite; i++) {
                matriz[i] [nlimite] = c++;
            }
            for (int i = nlimite - 1; i >= inicio; i--) {
                matriz[nlimite] [i] = c++;
            }
            for (int i = nlimite - 1; i >= inicio + 1; i--) {
                matriz[i] [inicio] = c++;
            }
            inicio = inicio + 1;
            nlimite = nlimite - 1;
        }
    }    
    static void imprimir(int matriz[][], int nlimite) {
        for (int i = 0; i <= nlimite; i++) {
            System.out.println("");
            for (int j = 0; j <= nlimite; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
