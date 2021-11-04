import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        float x;
        float squareArea;

        System.out.print("Enter the side:");

        Scanner lectorTeclado;

        lectorTeclado = new Scanner(System.in);

        x = lectorTeclado.nextFloat();

        lectorTeclado.close();

        squareArea = x * x;

        System.out.println(squareArea);
    }
}
