import java.util.Scanner;
/*
Diseña un algoritmo que lea un año como dato de entrada y que muestre si es un año bisiesto o no. 
Todos los múltiplos de 4, excepto los que son múltiples de 100 y no de 400 son años bisiestos.
(Ej. Años bisiestos: 1600, 2000, 2400. No años bisiestos: 1700, 1800, 1900 ..)
 */
public class E21 {
	public static void main(String[] args) {
		int anyo;
		/*
		 * Este tipo de variables se llaman banderas o flags, y sirven para marcar situaciones
		 * En este caso, queremos probar que un año es bisiesto, por lo que en principio suponemos
		 * que no lo es
		 */
		boolean esBisiesto = false;
		Scanner miScanner;
		/*
		 * 1.- RECOGER DATOS 
		 */
		
		//Suponemos que el usuario introduce datos correctos
		System.out.println("Introduce un año:");
		
		// Leer un carácter como int desde el teclado
		
		miScanner = new Scanner(System.in);
		anyo = miScanner.nextInt();
		

		/*
		 * 2.- PROCESAR DATOS 
		 * Resumiendo: Si el año es múltiplo de 400 (que entonces también lo es de 100 y 4), es bisiesto
		 * 				O el año es múltiplo de 4 pero no de 100
		 */
		
		if ((anyo % 400 == 0 ) || ((anyo % 4 == 0 ) && (anyo % 100 != 0 ))) {
			//Cambiamos la bandera
			esBisiesto = true;
		}
		

		/*
		 * 3.- IMPRIMIR RESULTADOS
		 */
		
		if (esBisiesto) {
			 System.out.println("Es bisiesto");
		}else {
			 System.out.println("No es bisiesto");
		}
		
			
		
		miScanner.close();

	}
}
