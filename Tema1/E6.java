import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {

        // Declaración de variables
        Scanner lector = new Scanner(System.in);
        double radius, length, area;
        final double PI = 3.14159;

        // Programa principal
        System.out.println("Enter the radius: ");
        radius = lector.nextDouble();

        lector.close();

        length = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("length: " + length);
        System.out.println("area: " + area);
    }
}
