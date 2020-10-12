package ejercicio5;

/*
 *  5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
		Longitud de la circunferencia = 2*PI*Radio
		Area de la circunferencia =PI*Radio^2
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float radius;

		try {
			System.out.println("Introduce the radius");
			radius = reader.nextInt();

			System.out.println("The length is: " + (2 * Math.PI * radius));

			System.out.println("The area is: " + (Math.PI * Math.pow(radius, 2)));
		} finally {
			reader.close();
		}

	}

}
