import java.util.Scanner;

/*
 * Diseña un algoritmo que calcule el salario neto de un trabajador en función del número de horas de trabajo y
 * los impuestos según las siguientes reglas:
 *  
    Las primeras 35 horas se pagan al precio normal por hora

    Las horas que exceden esas 35 horas se pagan 1,5 veces el precio normal.

    Las tasas impositivas son:

    Los primeros 500 € son libres de impuestos.

    los próximos 400 € tienen un impuesto del 25%

    Y el resto una tasa de impuestos del 45%.

Los datos de entrada son:

    € precio por hora
    número de horas.

Datos resultantes:

    Pago bruto
    Salario neto
    Impuestos

 */

public class E19 {
	public static void main(String argv[]) {
		int horas;
		double precio;
		double bruto;
		double impuestos;
		Scanner miScanner;
		/* Habitualmente, los programas se dividen en 3 partes:
		 * 1.- Recoger datos
		 * 2.- Procesarlos
		 * 3.- Imprimir resultados
		 * Estas 3 partes deben estar diferenciadas, es decir, en la parte de proceso no
		 * imprimimos nada, sólo hacemos cálculos
		 */
		
		/*
		 * 1.- RECOGER DATOS 
		 */
		// Leer un carácter como int desde el teclado
		miScanner = new Scanner(System.in);
		
		//Suponemos que el usuario introduce datos correctos
		System.out.println("Introduce las horas:");
		horas = miScanner.nextInt();
		
		System.out.println("Introduce el precio por hora:");
		precio = miScanner.nextFloat();
	
		/*
		 * 2.- PROCESAR DATOS 
		 */
		
		/*
		 *  Primero calculamos el pago bruto.
		 *  Las primeras 35 horas se pagan al precio normal por hora
		 *  Las horas que exceden esas 35 horas se pagan 1,5 veces el precio normal.
		 */
		if (horas <= 35) {
			bruto = horas * precio;
		}else {
			//Las primeras 35 se pagan normal
			bruto = 35 * precio;
			//Las siguientes se pagan a 1,5 veces el precio normal
			bruto = bruto + ((horas - 35) * precio * 1.5);
		}
		/*
		 * Ahora calculamos los impuestos:
		 *   Los primeros 500 € son libres de impuestos.
		 *   los próximos 400 € tienen un impuesto del 25%
		 *   Y el resto una tasa de impuestos del 45%.
		 */
		if (bruto <= 500) {
			impuestos = 0;
		}else if (bruto <= 900){
			//Cobra entre 500 y 900, de los primeros 500 no paga nada
			impuestos = (bruto - 500) * 0.25f;
		}else {
			//Si cobra más de 900
			impuestos = (400 * 0.25f) + (bruto - 900) * 0.45f;
		}
		
		miScanner.close();
		/*
		 * 3.- IMPRIMIR RESULTADOS
		 */
		
		System.out.println("Pago bruto: " + bruto);
		System.out.println("Salario neto: " + (bruto - impuestos));
		System.out.println("Impuestos: " + impuestos);
		
	}
}