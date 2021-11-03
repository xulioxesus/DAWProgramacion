import java.util.Scanner;

public class E36 {
    //Pide 10 numeros e imprime el mayor

    public static void main(String[] args) {
        
        double[] numeros = new double[10];
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dame un número: ");
            numeros[i] = lector.nextDouble();
            System.out.println("");
        }
        
        double maximo = numeros[9];

        for (int i = 8; i >= 0; i--) {
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }

        System.out.println(maximo);
    }
}
