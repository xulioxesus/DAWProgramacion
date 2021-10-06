import java.util.Scanner;

public class E10 {
public static void main(String[] args) {
        
        //Declaración de variables
        double numero;
        Scanner lector = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Introduce un número: ");

        numero = lector.nextDouble();

        lector.close();

        if (numero >= 0) {
            System.out.println("Positivo.");
        }
        else{
            System.out.println("Negativo.");
        }
    }
}
