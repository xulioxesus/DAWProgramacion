package strings;

/*
 * Escribe un programa que lea una cadena y un número entero k y muestre el mensaje 
 * "Todas las cadenas son cortas" si todas las palabras tienen una longitud estrictamente menor que k 
 * y "Hay alguna palabra larga" en caso contrario.
 */
public class Longitud3 {
	public static boolean todasSonCortas(String[] palabras, int longitud) {
		for (String palabra : palabras) {
			if (palabra.length() >= longitud) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String cadena = Utilidades.leerCadena("Introduce un texto");
		String palabras[] = Utilidades.dividirEnPalabras(cadena);
		int longitud = Utilidades.leerEntero("¿todas las palabras de longitud menor que k? ");
		
		if (todasSonCortas(palabras, longitud)) {
			System.out.println("Todas las cadenas son cortas");
		}else {
			System.out.println("Hay alguna palabra larga");
		}
		
	}

}