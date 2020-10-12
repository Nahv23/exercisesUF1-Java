package ejercicio7;

/*
7. Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		  
		  float leg1;
		  float leg2;

		  try{
		    System.out.println("Introduce the first leg: ");
		    leg1 = reader.nextInt();
		    System.out.println("Introduce the second leg: ");
		    leg2 = reader.nextFloat();
		    System.out.println("The hypotenuse is: " + Math.round(Math.sqrt(Math.pow(leg1,2)+Math.pow(leg2,2)) * 1000.0f )/1000.0f );
		  }finally{
		    reader.close();
		  }
	}

}