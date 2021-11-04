/**
 * ArgumentosMain
 */
public class ArgumentosSuma{

	//Declaración de variables
	static	int suma = 0;

    public static void main(String[] args) {
	
        System.out.println("===========================");
        System.out.println("Argumentos: " + args.length);
        System.out.println("===========================");

        for (int i = 0; i < args.length; i++) {
	    suma += Integer.parseInt(args[i]);
        }
        System.out.println(suma);
    }
}
