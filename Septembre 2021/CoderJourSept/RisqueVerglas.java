package coder;

import java.util.Scanner;

public class RisqueVerglas {
	
	public static void main(String[] args) {

		final String messageDanger = "Risque de verglas";

		Scanner console = new Scanner(System.in);
		System.out.println("Entrer température");
		double temperature = console.nextDouble();
		if (temperature <= 2.00) {
			System.out.println(messageDanger);
		} else {
			System.out.println("Il n'y a pas de risque de verglas");
		}

	}
}