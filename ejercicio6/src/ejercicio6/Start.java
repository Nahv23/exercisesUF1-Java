package ejercicio6;

/*
 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */

import java.util.Scanner;

public class Start {

	  public static void main(String[] args) {
		  Scanner reader = new Scanner(System.in);
		  
		  float speed;

		  System.out.println("Introduce the speed in km/h");
		  speed = reader.nextInt();

		  System.out.println("The speed in m/s is: " + Math.round((speed*5/18) * 100.0f)/ 100.0f);

		  }

}
