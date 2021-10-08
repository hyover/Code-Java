package coder;

import java.util.Scanner;

public class CoderJourSept {

	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 28 septembre 2021 jour 7");
		System.out.println("Entrainement switch (selon) et boolean");

		//VAT calculation according to the granted rate
		double tva = 20.00 / 100; //I did not declare it constantly because it can be modified

		Scanner console = new Scanner(System.in);
		System.out.println("Veuillez inscrire le prix Hors Taxe de l'article et appuyer sur entrer");
		double prixHorsTaxe = console.nextDouble();
		console.nextLine();
		System.out.println("Avez-vous une réduction du taux de TVA ? Répondez par oui ou non");
		String tvaReduction = (console.nextLine()).toUpperCase(); //every string became Uppercase
			switch (tvaReduction) {
				case "OUI" :
					System.out.println("Quel est votre taux (%) s'il vous plait ?");
					tva = console.nextDouble()/100;
					break;

				case "NON" :
					System.out.println("Votre taux de tva reste à 20%");
					break;

				default :
					System.out.println("Je ne comprend pas veuillez recommencer s'il vous plait");
					break;

			}
		

		double prixToutesTaxesComprises = prixHorsTaxe * (1+tva);
		prixToutesTaxesComprises = (double) Math.round(prixToutesTaxesComprises*100)/100;

		System.out.println("Votre article coûte "+prixToutesTaxesComprises+" € TTC avec une TVA à "+tva*100+" %");
		System.out.println("-----------------------------------------------------------------------------------");

		//With boolean
		System.out.println("Entrainement boolean");

		System.out.println("Combien de personne voyages ?");
		int nbTraveler = console.nextInt();
		console.nextLine();
		System.out.println("Avez-vous une assurance ? Répondez par Oui ou Non");
		boolean assurance = (console.nextLine()).equalsIgnoreCase("oui");
		console.close();

		System.out.printf("Le voyage est réservé pour %d personne%s %s assurance annulation", nbTraveler, nbTraveler>1?"s":"", assurance?"avec":"sans");

		

	}
}