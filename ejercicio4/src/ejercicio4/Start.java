package ejercicio4;

/*
 * 4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
 */
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float degrees;

		try {
			System.out.println("Introduce the Celsius degrees to transform them to Fahrenheit");
			degrees = reader.nextInt();

			System.out.println(degrees + "°C are " + ((degrees * 9 / 5) + 32) + "°F");
		} finally {
			reader.close();
		}

	}

}
