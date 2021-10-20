package coder;

import java.util.Scanner;

public class CoderJourSix {

	public static void main(String[] args) {

		//Intro
		System.out.println("Bonjour nous sommes le 27 septembre 2021, jour 6");
		System.out.println("Entrainement divsion euclidienne  + vitesse moyenne + conditionnelles");

		//Division euclidienne
		System.out.println("Division euclidienne");
		int valeur1 = 92 % 8;
		int valeur2 = 2 * valeur1;
		String chaine1 = "Test";
		final double cst = 49.78;

		System.out.println(chaine1+" , valeur2 = "+valeur2);
		System.out.println(valeur1+" # "+cst);

		//Calcul vitesse moyenne
		System.out.println("Calcul vitesse moyenne");
		final int uneHeure = 60;

		Scanner console = new Scanner(System.in);
		System.out.println("Saissisez la distance parcourus (km) : ");
		float distanceParcourus = console.nextFloat();
		console.nextLine();
		System.out.println("Saissisez le temps de parcours (min) ");
		float tempsParcourus = console.nextFloat();
		

		//Calcul vitesse
		float vitesse = distanceParcourus * (uneHeure / tempsParcourus);
		
		//Arrondir à la 2 décimale
		vitesse = (float) Math.round(vitesse*100)/100; 
		System.out.println("Vous vous êtes déplacé à "+vitesse+" km/h");

		//Les conditionnels

		//Calcul tva selon le taux
		double prixHorsTaxe;
		String tvaReduite ="";
		double tva = 20.00/100;
	
		
		System.out.println("Prix HT de l'article ?");
		prixHorsTaxe = console.nextDouble();
		console.nextLine();
		System.out.println("Ce produit bénéficie-t-il d'un taux de TVA réduit ? - Répondre : Oui / Non -");
		tvaReduite = console.next();

		if ((!tvaReduite.equalsIgnoreCase ("Oui"))&&(!tvaReduite.equalsIgnoreCase ("Non"))) {
			System.out.println("Je n'ai pas compris, veuillez recommencer");
			
		} else {
		 if(tvaReduite.equalsIgnoreCase ("Oui")) {
			System.out.println("Quel est le taux (%) ?");
			tva = console.nextDouble()/100;
		} 
		}
		console.close();

		double prixTtc = prixHorsTaxe*(1+tva);
		prixTtc = (double) Math.round(prixTtc*100)/100;

		System.out.println("Prix TTC de l'article : "+prixTtc+ " €");
		

	}
}