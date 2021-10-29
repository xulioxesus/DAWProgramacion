import java.util.Scanner;

public class Entrada {
    public static int getInteger(){
        int resultado = 0;
        String mensaje = "Escriba un entero: ";
        Scanner lector = new Scanner(System.in);
        boolean hayEntero = false;

        System.out.println(mensaje);
        while (!hayEntero){
            if(lector.hasNextInt()){
                resultado = lector.nextInt();
                hayEntero = true;
                lector.nextLine();
            }else{
                lector.nextLine();
                System.out.println(mensaje);
            }
        }

        if (lector.hasNextLine()){
            lector.nextLine();
        }

        lector.close();

        return resultado;
    }
}
