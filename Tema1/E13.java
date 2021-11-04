import java.util.Scanner;

public class E13 {
public static void main(String[] args) {
        
        //Declaración de variables
        double x,y;
        byte opcion;
        Scanner lector = new Scanner(System.in);

        //Empieza el programa
        System.out.println("x: ");
        x = lector.nextDouble();

        System.out.println("y: ");
        y = lector.nextDouble();

        System.out.println("Ascendente (1) o descendente (2):");
        opcion = lector.nextByte();

        lector.close();

        if (opcion == 1){
            if (x <= y) {
                System.out.println(x + " " + y);
            }
            else{
                System.out.println(y + " " + x);
            }
        }else if (opcion == 2){
            if (x <= y) {
                System.out.println(y + " " + x);
            }
            else{
                System.out.println(x + " " + y);
            }
        }
    }
}
