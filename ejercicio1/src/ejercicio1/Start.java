package ejercicio1;

/* 
 * 1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla. 
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int num1;
		int num2;
		
		try {

		System.out.println("Introduce the first number");
		num1 = reader.nextInt();
		System.out.println("Introduce the second number");
		num2 = reader.nextInt();

		System.out.println("The first number is: " + num1);
		System.out.println("The second number is: " + num2);
		} finally {
			reader.close();
		}
	}

}
