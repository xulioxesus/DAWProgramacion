/**
 * Array1000
 */
public class Array1000 {

    public static void main(String[] args) {
        int [] numeros = new int [1000];

        int multiplo3 = 3;
        int multiplo7 = 7;

        //En las posiciones pares ponemos los múltiplos de 3
        for (int i = 0; i < numeros.length; i = i + 2) {
            numeros[i] = multiplo3;
            multiplo3 = multiplo3 + 3;
        }

        //En las posiciones impares ponemos los múltiplos de 7
        for (int i = 1; i < numeros.length; i = i + 2) {
            numeros[i] = multiplo7;
            multiplo7 = multiplo7 + 7;
        }

        //Imprimir el contenido de las posiciones múltiplo de 13
        for (int i = 13; i < numeros.length; i = i + 13) {
            System.out.println(numeros[i]);
        }
    }
}