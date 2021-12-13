package strings;

/*
 * Hay un tipo de pasatiempos que propone descifrar un texto del que se han suprimido las vocales. 
 * Por ejemplo, el texto ".n .j.mpl. d. p.s.t..mp.s" se descrifra sustituyendo cada punto por una vocal. 
 * La solución es "un ejemplo de pasatiempos".
 * Diseña un programa que ayude al creador de pasatiempos. 
 * Recibirá una cadena y mostrará otra en la que cada vocal ha sido reemplazada por un punto.
 */
public class Pasatiempos {
	public static String crearPasatiempo(String frase) {
		//Se puede hacer de muchas formas
		String pasatiempo = "";
		for (int i = 0; i < frase.length(); i++) {
			if ("aeiouAEIOUáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙäëïöüÄËÏÖÜ".contains("" + frase.charAt(i))) {
				pasatiempo = pasatiempo + ".";
			} else {
				pasatiempo = pasatiempo + frase.charAt(i);
			}

		}
		return pasatiempo;
	}

	public static void main(String[] args) {

		String cadena = Utilidades.leerCadena("Introduce cadena");

		String solucion = crearPasatiempo(cadena);
		System.out.println(solucion);
	}

}
