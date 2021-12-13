package strings;

/*
 * Realiza un programa que lea una cadena de texto y nos diga
 *  si alguna palabra tiene una longitud de k caracteres.
 */
public class Longitud2 {
	public static boolean tieneAlgunaDeLongitud(String[] palabras, int longitud) {
//		boolean encontrada = false;
//		for (String palabra : palabras) {
//			if (palabra.length() == longitud) {
//				encontrada = true;
//				break;
//			}
//		}
//		return encontrada;
		for (String palabra : palabras) {
			if (palabra.length() == longitud) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		String cadena = Utilidades.leerCadena("Introduce un texto");
		String palabras[] = Utilidades.dividirEnPalabras(cadena);
		int longitud = Utilidades.leerEntero("Existe alguna palabra de longitud? ");
		
		if (tieneAlgunaDeLongitud(palabras, longitud)) {
			System.out.printf("La cadena contiene al menos 1 palabra de longitud %d", longitud);
		}else {
			System.out.printf("La cadena NO contiene ninguna palabra de longitud %d", longitud);
		}
	}

}