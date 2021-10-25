import java.util.Scanner;

//Realiza un programa que lea dos números enteros y 
// dependiendo de la operación que indique el usuario (+, -, * , /) muestre el resultado
public class E16 {
	public static void main(String argv[]) {
		int n;
		int m;
		char op;
		String cadena; 
		 
		System.out.println("Introduce un número entero:");

		// Leer un carácter como int desde el teclado
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		n = inputValue.nextInt();

		System.out.println("Introduce otro número entero:");
		m = inputValue.nextInt();
		
		System.out.println("Introduce la operación a realizar (+, -, *, /):");
		//Leemos toda una cadena
		cadena = inputValue.next();
		// y nos quedamos con el carácter 0 (el primero)
		op = cadena.charAt(0);
		 
		switch (op) {
		case '+':
			System.out.printf("El resultado de sumar %d y %d es: %d %n", n, m, n+m);
			break;
		case '-':
			System.out.printf("El resultado de restar %d y %d es: %d %n", n, m, n-m);
			break;
		case '*':
			System.out.printf("El resultado de multiplicar %d y %d es: %d %n", n, m, n*m);
			break;
		case '/':
			System.out.printf("El resultado de dividir %d y %d es: %d %n", n, m, n/m);
			break;
		default:
			System.out.println("Operación incorrecta");
		}
		
		//También se puede hacer así
		String operacion = "";
		System.out.println("Introduce la operación a realizar (+, -, *, /):");
		operacion = inputValue.next();
		switch (operacion) {
		case "+":
			System.out.printf("El resultado de sumar %d y %d es: %d %n", n, m, n+m);
			break;
		case "-":
			System.out.printf("El resultado de restar %d y %d es: %d %n", n, m, n-m);
			break;
		case "*":
			System.out.printf("El resultado de multiplicar %d y %d es: %d %n", n, m, n*m);
			break;
		case "/":
			System.out.printf("El resultado de dividir %d y %d es: %d %n", n, m, n/m);
			break;
		default:
			System.out.println("Operación incorrecta");
		}
		
		inputValue.close();
	}
}