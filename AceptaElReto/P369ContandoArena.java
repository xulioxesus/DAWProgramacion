import java.util.Scanner;

public class P369ContandoArena {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
                
        int entrada = lector.nextInt();

        while (entrada != 0){
            for (int i = 0; i < entrada; i++) {
                System.out.print(1);
            }
            System.out.print('\n');

            entrada = lector.nextInt();
        }

        lector.close();

    }
}