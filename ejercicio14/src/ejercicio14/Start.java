package ejercicio14;

/*
14. Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes,
año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha de
nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
Número de la suerte: 28 
*/

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String birthday;
		int dd = 0;
		int mm = 0;
		int yyyy = 0;
		int preLuckyNum = 0;
		int luckyNum = 0;

		try {
			System.out.println("Introduce your birthday with the follow format dd/mm/yyyy");
			birthday = reader.nextLine();

			if (birthday.matches("\\d{2}/\\d{2}/\\d{4}")) {
				dd = Integer.parseInt(String.valueOf(birthday.substring(0, 2)));
				mm = Integer.parseInt(String.valueOf(birthday.substring(3, 5)));
				yyyy = Integer.parseInt(String.valueOf(birthday.substring(6, 10)));

				preLuckyNum = dd + mm + yyyy;

				while (preLuckyNum > 0) {
					int n = preLuckyNum % 10;
					luckyNum = luckyNum + n;
					preLuckyNum = preLuckyNum / 10;
				}
				System.out.println("Your Lucky Number is " + luckyNum);

			} else {
				System.out.println("You have introduced a wrong format");
			}

		} finally {
			reader.close();
		}

	}

}
