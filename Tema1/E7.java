import java.util.Scanner;

public class E7 {

    public static void main (String argv[]) {
        //Declaracion de variables
        double precio, precioRebajado;
        double descuento;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        //Inicio de programa
        System.out.println("Introduce el precio real:");
        precio = inputValue.nextDouble();

        System.out.println("Introduce el precio rebajado:");
        precioRebajado = inputValue.nextDouble();

        descuento =((precio - precioRebajado)/precio *100);
        System.out.println("Se le ha aplicado un descuento del: " + descuento+"%");
        
        inputValue.close();
    }
}