/**
 * Ejemplo1
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int [][] matriz = new int[4][3];
           
        Utilidades.rellenaMatriz(matriz, 20, 40);

        Utilidades.mostrarMatriz(matriz);
        
        System.out.println("Fin");
    }
}