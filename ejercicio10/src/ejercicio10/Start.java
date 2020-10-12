package ejercicio10;

/*
10. Programa Java que calcule el área de un triángulo en función de las longitudes
de sus lados (a, b, c), según la siguiente fórmula:
Area = RaizCuadrada(p*(p‐a)*(p‐b)*(p‐c))
donde p = (a+b+c)/2
Para calcular la raíz cuadrada se utiliza el método Math.sqrt()
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int sideA;
		int sideB;
		int sideC;
		float p;

		try {
			System.out.println("Introduce the side A length");
			sideA = reader.nextInt();
			System.out.println("Introduce the side B length");
			sideB = reader.nextInt();
			System.out.println("Introduce the side C length");
			sideC = reader.nextInt();

			p = (sideA + sideB + sideC) / 2.0f;

			System.out.println("The triangle area is: "
					+ Math.round(Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)) * 1000.0) / 1000.0);
		} finally {
			reader.close();
		}
	}

}
