package ejercicio12;

/* TODO
12. Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que
en el ejemplo.
Por ejemplo para un número N = 12345 La salida debe ser:
1
12
123
1234
12345
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int number;

		try {
			System.out.println("Introduce a integer number");
			number = reader.nextInt();

			String numCadena = Integer.toString(number);

			for (int i = numCadena.length() - 1; i >= 0; i--) {
				double aux = number * Math.pow(10, -i);
				System.out.println((int) aux);
			}

		} finally {
			reader.close();
		}

	}

}
