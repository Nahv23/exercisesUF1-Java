package ejercicio3;

/*
 * 3. Programa Java que lea un nombre y muestre por pantalla:“Buenos dias nombre_introducido”.
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String name;

		try {
			System.out.println("Introduce a your name");
			name = reader.nextLine();

			System.out.println("Buenos dias " + name);

		} finally {
			reader.close();
		}

	}

}
