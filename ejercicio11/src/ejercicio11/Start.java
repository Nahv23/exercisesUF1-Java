package ejercicio11;

/*
11. Programa Java que lea un número entero de 3 cifras y muestre por separado
las cifras del número.(la variable debe ser de tipo entero).
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

			for (int i = 0; i < numCadena.length(); i++) {
				System.out.println(numCadena.charAt(i));
			}
		} finally {
			reader.close();
		}

	}

}
