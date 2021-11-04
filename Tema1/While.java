public class While {
	public static void main(String argv[]) {

		int i;

		// Estructura PARA
		for (i = 0; i < 10; i++) {
			System.out.println("Hola:" + i);
		}

		// Estructura MIENTRAS
		i = 0;

		while(i < 10){
			System.out.println("Hola:" + i);
			i++;
		}

		//Estructura HASTA

		i = 0;

		do {
			System.out.println("Hola:" + i);
			i++;
		} while (i < 10);
	}
}