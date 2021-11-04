import java.util.Random;
import java.util.Scanner;

public class Asignaciones {
    public static void main(String[] args) {
        
        double [] memoria = new double[1000000000];
        Random random = new Random();


        for (int i = 0; i < memoria.length; i++) {
            memoria[i] = random.nextInt(1000000000) + 1;
        }
    }
}
