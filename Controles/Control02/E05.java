import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        String numero = lector.next();

        System.out.println(numero.charAt(2) +
        "" + numero.charAt(1) + 
        "" + numero.charAt(0));

        //345

        /*
        int primero = numero%10; // Obtengo el 5
        int segundo = (numero/10)%10; // Obtengo el 4
        int tercero = numero/100;
        */

        //System.out.println(primero + "" + segundo + "" + tercero);
    }
}
