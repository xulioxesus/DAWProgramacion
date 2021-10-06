import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        
        //Declaración de variables
        short age = 0;
        Scanner lector = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Enter the age: ");

        age = lector.nextShort();

        lector.close();

        if (age >= 18) {
            System.out.println("You have the legal age.");
        }
    }
}
