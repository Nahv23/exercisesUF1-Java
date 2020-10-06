package ejercicio2;

/*
2. Escribe un programa Java que lee un n�mero entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese n�mero.
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int number;
		try {
			System.out.println("Introduce a number");
			number = reader.nextInt();

			System.out.println("The double of the number is: " + number * 2);
			System.out.println("The triple of the number is: " + number * 3);
		} finally {
			reader.close();
		}
	}

}
