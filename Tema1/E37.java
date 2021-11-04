import java.util.Scanner;

public class E37 {
    public static void main(String[] args) {
        double [] numeros = new double[10];

        double max;
        double min;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lector.nextDouble();
        }

        max = numeros[0];
        min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max){
                max = numeros[i];
            }

            if (numeros[i] < min){
                min = numeros[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
