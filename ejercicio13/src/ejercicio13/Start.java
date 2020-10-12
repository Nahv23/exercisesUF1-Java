package ejercicio13;

/*
13. Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual
que en el ejemplo.
Por ejemplo para un número N = 12345 La salida debe ser:
5
45
345
2345
12345
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int number;

		try {
			System.out.println("Introduce an integer number");
			number = reader.nextInt();

			String numCadena = Integer.toString(number);
			for (int i = 1; i <= numCadena.length(); i++) {
				double aux = number % Math.pow(10, i);
				System.out.println((int) aux);
			}

		} finally {
			reader.close();
		}

	}

}
