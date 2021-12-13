package strings;

/*
 * Un texto está bien parentizado si por cada paréntesis abierto hay
 *  otro detrás que lo cierra. 
 *  Por ejemplo, la cadena
 *  Esto (es (un ejemplo) (de) una (cadena bien) parentizada)
 *  está bien parentizada.
 *  Pero la cadena
 *      una )cadena (mal (parentizada)
 *  no lo está
 *  Diseña un programa que nos diga si una cadena está bien parentizada o no
 */
public class Parentesis {

	public static boolean esParentizada(String frase) {
		int par = 0;

		for (char letra : frase.toCharArray()) {
			if (letra == '(') {
				par++;
			} else if (letra == ')') {
				par--;
			}
			//Si hay más de cierre que de apertura, acabamos
			if (par == -1) {
				return false;
			}
		}
		//Al final, por cada uno de apertura debe hacer uno de cierre. Es decir el
		//único valor correcto es que sea 0

		return (par == 0);
	}
	public static void main(String[] args) {

		String frase = Utilidades.leerCadena("Introduce una frase:");

		if (esParentizada(frase)) {
			System.out.println("La cadena está bien parentizada");
		} else {
			System.out.println("La cadena NO está bien parentizada");
		}
	}

}
