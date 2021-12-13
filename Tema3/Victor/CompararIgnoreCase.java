package strings;


/*
 * Realiza un programa que diga si una cadena es mayor, menor o igual que otra cadena sin importar si 
 * son mayúsculas o minúsculas (ignore case, en inglés). 
 * Ambas cadenas se deben leer desde el teclado con Scanner.
 */
public class CompararIgnoreCase {
	
	public static int compararIgnorandoCase(String cadena1, String cadena2) {
		return cadena1.compareToIgnoreCase(cadena2);
	}
	public static void main(String[] args) {
		
		String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		String cadena2 = Utilidades.leerCadena("Introduce cadena2");
		int resultado = compararIgnorandoCase(cadena1, cadena2);
		
		if (0 == resultado){
			System.out.println("Las cadenas son iguales");
		}
		else if (resultado > 0){
			System.out.println("'" + cadena1 + "' es mayor que '" + cadena2 + "'");
		}
		else {
			System.out.println("'" + cadena2 + "' es mayor que '" + cadena1 + "'");
		}
	}

}
