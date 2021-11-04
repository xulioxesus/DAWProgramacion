import java.util.Scanner;

public class E35 {
    public static void main(String[] args) {

        int [] notas = new int[10];
        Scanner lector = new Scanner(System.in);
        double total = 0;
        boolean hayDiez = false;

        for (int j = 0; j < notas.length; j++) {
            notas[j] = lector.nextInt();

            total = total + notas[j];

            if (notas[j] == 10){
                hayDiez = true;
            }
        }

        System.out.println("Media: " +  total/10);
        
        if (hayDiez) {
            System.out.println("Hay diez");
        } else {
            System.out.println("No hay diez");            
        }

        lector.close();
    }
}
