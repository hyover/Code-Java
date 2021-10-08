package coder;

import java.util.Scanner;

public class CoderJour9 {
	
	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 30 septembre 2021n jour 9");
		System.out.println("Entrainement boucle");

		//Converter your Bitcoin

		//Fields
		double conversionRate;
		double eurValue;
		double result;
		String again;

			//The program starts here
			Scanner console = new Scanner (System.in);
			System.out.println("Combien d'euros vaut actuellement le Bitcoin ?");
			conversionRate = console.nextDouble();
			do {
				System.out.println("Quelle somme en euros voulez-vous convertir en Bitcoin ?");
				eurValue = console.nextDouble();
				console.nextLine();
				result = eurValue/conversionRate;
				result = (double) Math.round(result*100)/100;
				System.out.println("Cela représente une somme de "+result+" bitcoin(s)");
				System.out.println("Avez-vous encore une conversion à effectuer ? Oui / Non");
				again = console.nextLine();
			} while (again.equalsIgnoreCase("oui"));
			console.close();
	}
}