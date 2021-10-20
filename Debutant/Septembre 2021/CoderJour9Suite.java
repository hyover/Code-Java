package coder;

import java.util.Scanner;

public class CoderJour9Suite {
	
	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes toujours le 30 septembre 2021, jour 9");
		System.out.println("Entrainement boucle");

		int nbVal, cpt;
		double saisie;
		double moyenne = 0;

		Scanner console = new Scanner(System.in);
		System.out.println("Entrer le nombre de notes :");
		nbVal = console.nextInt();
		if (nbVal <= 0) {
			System.out.println("Le nombre de valeurs doit être strictement positif");
		} else {
			for (cpt=1; cpt<=nbVal; cpt++) {
				System.out.println("Notes : ");
				saisie = console.nextDouble();
				moyenne = moyenne + (saisie/nbVal);
			}
		} System.out.println("La moyenne est "+ moyenne);

		//Other GradeAverage
		int nbNotes = 0;
		double total = 0;
		final int stop = -1;
		final int palier = 10;
		int nbS = 0;

		System.out.println("Note ("+stop+" pour terminer) ?");
		double saisieDeux = console.nextDouble();
		while (saisieDeux != stop) {
			total = total + saisieDeux;
			nbNotes += 1;
			if (saisieDeux > palier) {
				nbS += 1;
			}
			System.out.println("Note ("+stop+" pour terminer) ?");
			saisieDeux = console.nextDouble();
			console.nextLine();
		} if (nbNotes != 0) {
			System.out.println("La moyenne des notes est de "+total/nbNotes+" ("+(100*nbS)/nbNotes+ "% => "+palier+") ");
			System.out.println("Nombres de notes au dessus de 10 : "+nbS);
			System.out.println("Nombres total de notes : "+nbNotes);
			System.out.println("Sommes des notes total : "+total);
		} else System.out.println("Aucune note n'a été saisie");
		
		//OtherGradeAverage


		console.close();

	}
}