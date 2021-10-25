import java.util.Scanner;

public class Control01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numLados = 0;
        double longitudLado = 0;
        double perimetro = 0;

        System.out.println("Dime el número de lados del polígono:");
        numLados = lector.nextInt();

        if (numLados == 3 || numLados == 4){
            System.out.println("Dime la longitud del lado del polígono");
            longitudLado = lector.nextDouble();

            perimetro = numLados * longitudLado;

            switch (numLados) {
                case 3:
                    System.out.println("El perímetro del triángulo es: " + perimetro);
                    break;
                case 4:
                    System.out.println("El perímetro del cuadrado es: " + perimetro);
                    break;
                default:
                    break;
            }
        }

        lector.close();
    }
}
