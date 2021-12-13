package strings;

import java.util.Scanner;
/*
 * Realiza un programa que cuente cuántos espacios en blanco tiene una cadena. 
 * Podéis usar las métodos trim(), replaceAll(), split().
 *  Se considera que una las palabras deben estar separadas por uno o más espacios, 
 *  y que también puede haber espacios al principio y al final.
 */
public class Palabras1 {
	static Scanner inputValue = new Scanner(System.in);
	public static String leerCadena(String mensaje){
		System.out.println(mensaje);
	    return inputValue.nextLine();  
	}
	public static int contarPalabras(String cadena){
		//Le quitamos los espacios al principio y al final
		 cadena = cadena.trim();
		 //Reemplazamos uno o más blancos por un sólo blanco
	     cadena = cadena.replaceAll(" +", " ");
	     //Dividimos la cadena por los espacios en blanco
	     String arraycadena[]=cadena.split(" ");
	     //Y devolvemos la longitud de este array
	     return arraycadena.length;
	}
	public static void main(String[] args){    
	     String cadena = leerCadena("Introduce una cadena");
	     System.out.println("La cadena tiene " + contarPalabras(cadena) + " palabras");    
	}
	
	

	
}