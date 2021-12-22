/*
 * Realiza un programa que extraiga de una cadena la cadena comprendida entre dos posiciones
 */
public class Substring {
	public static String subcadena(String cadena1, int inicio, int fin) {
		return cadena1.substring(inicio, fin + 1);
		
	}
	public static void main(String[] args) {
		int inicio = 0;
		int fin = 0;
		String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		//Suponemos que el índice es correcto, es decir, está entre 0 y la longitud de cadena -1
	
		inicio = Utilidades.leerEntero("De la posición:");
		fin = Utilidades.leerEntero("A la posición:");
		
		System.out.println("La subcadena resultante es: " + subcadena(cadena1, inicio, fin + 1));
	}


}
