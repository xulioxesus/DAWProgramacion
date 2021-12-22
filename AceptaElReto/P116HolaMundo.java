import java.util.Scanner;

public class P116HolaMundo {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int cantidad;
        
        cantidad = lector.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Hola mundo.");
        }

        lector.close();
    }
}