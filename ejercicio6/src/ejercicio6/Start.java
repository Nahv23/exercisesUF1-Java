package ejercicio6;

/*
 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		float radius;

		System.out.println("Introduce the radius");
		
		radius = reader.nextFloat();

		System.out.println("The lenght is: " + (2 * Math.PI * radius));

		System.out.println("The area is: " + (Math.PI * Math.pow(radius, 2)));
	}

}
