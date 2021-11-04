import java.util.Scanner;

public class E24 {
    public static void main(String[] args) {

        int numero = 0;
        Scanner lector = new Scanner(System.in);
        double total = 0;
        int contador = 0;
        boolean hayDiez = false;

        do {
            numero = lector.nextInt();

            if (numero != -1) {
                total = total + numero;
                contador++;
            }

            if (numero == 10){
                hayDiez = true;
            }

        } while (numero != -1);

        if (contador > 0)
            System.out.println("Media: " +  total/contador);
        else
            System.out.println("Media: 0");
        
        if (hayDiez) {
            System.out.println("Hay diez");
        } else {
            System.out.println("No hay diez");            
        }

        lector.close();
    }
}
