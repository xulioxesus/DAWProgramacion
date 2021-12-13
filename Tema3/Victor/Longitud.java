package strings;
/*
 * Realiza un programa que lea una cadena de texto y nos diga cuántas palabras 
 * tienen una longitud de k caracteres.
 */
public class Longitud {

	public static int cuantasDeLongitud(String[] palabras, int longitud) {
		int cuantas = 0;
		for (String palabra :  palabras) {
			if (palabra.length() == longitud) {
				cuantas++;
			}
		}
//		cuantas = 0;
//		for (int i = 0; i < palabras.length; i++ ) {
//			if (palabras[i].length() == longitud) {
//				cuantas++;
//			}
//		}
				
		return cuantas;
	}
	public static void main(String[] args) {
		String cadena = Utilidades.leerCadena("Introduce un texto");
		String palabras[] = Utilidades.dividirEnPalabras(cadena);
		int longitud = Utilidades.leerEntero("Contar palabras de longitud? ");
		
		System.out.printf("La cadena contiene %d palabras de longitud %d", cuantasDeLongitud(palabras, longitud), longitud);
	}

}