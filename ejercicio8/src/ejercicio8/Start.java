package ejercicio8;

/*
7. 8. Programa que tome como dato de entrada un n�mero que corresponde a la longitud del radio de un semic�rculo y calcule su �rea.
�rea= Pi * r*r / 2
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		float radius;

		try {
			System.out.println("Introduce the radius of the semicircle");
			radius = reader.nextFloat();

			System.out.println("The area is: " + (Math.PI * Math.pow(radius, 2) / 2));
		} finally {
			reader.close();
		}
	}

}
