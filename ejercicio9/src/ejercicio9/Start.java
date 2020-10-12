package ejercicio9;

/* 
9. Crear un programa para calcular el volumen de la esfera es v = (4/3)*PI* (radio^3) (al cubo) hay que pedirle al usuario su radio. 
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		float radius;
		double result;

		try {
			System.out.println("Introduce the radius of the sphere");
			radius = reader.nextFloat();

			result = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
			System.out.println("Its volume is: " + Math.round(result * 1000.0f) / 1000.0f);

		} finally {
			reader.close();
		}

	}

}
