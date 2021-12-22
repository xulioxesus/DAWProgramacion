import java.util.Scanner;

class ChorriChat{
    public static void main(String[] args) {
        final int SIN_SALUDO = 0;
        final int SALUDO = 1;
        final int BUCLE = 2;
        final int FIN = 3;

        Scanner lectorTeclado = new Scanner(System.in);

        int estado = SIN_SALUDO;

        while (estado != FIN){
            System.out.print("ChorriChat> ");
            String linea = lectorTeclado.nextLine();
            System.out.println("Eres una persona maleducada");
        }
    }
}