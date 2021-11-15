import java.util.Scanner;

public class LetraDni {

    public static char letraDni(int dni) {
        char resultado = ' ';

        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int indice = dni%23;
        resultado = letras[indice];

        return resultado;
    }
    public static void main(String[] args) {

        // Llamar a letraDni con un entero directamente
        System.out.println(eop(12345678));

        // Llamar a letraDni pidiendo el entero por teclado
        Scanner lector = new Scanner(System.in);

        System.out.println("Dime tu DNI: ");
        int unDNI = lector.nextInt();
        char letra = letraDni(unDNI);

        System.out.println(letra);

        lector.close();
        
    }
}
