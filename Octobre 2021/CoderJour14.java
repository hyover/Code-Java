package coder;

import java.util.Scanner;

public class CoderJour14 {

	public static void main(String [] args) {

		System.out.println("Bonnjour nous sommes le vendredi 9 octobre 2021, jour 14");
		System.out.println("Entrainement tableaux");

		String[] brothers = new String[] {"Adrien","Valentin","Baptiste"};

		System.out.println(brothers[0]);

		brothers[0] = "Dada";

		System.out.println(brothers[0]);

		int[] firstTab = new int[10];
		for (int i =0; i< firstTab.length; i++) {
			firstTab[i] = i+1;
		}

		System.out.println(firstTab[0]);

		for (int val : firstTab) { //show full tab
			System.out.println(val);
		}

		
		System.out.println("Créer ta liste de tache à effectuer");

		//Fields
		final int max = 10;
		final String quitter = "q";
		String[] aFaire = new String[max];
		String saisie;
		int nbChoseAFaire = 0;


		Scanner console = new Scanner(System.in);


		//Start

		do {
			System.out.println("Indiquez la tache à faire et appuyer sur entrée ou saisissez q pour quitter");
			saisie = console.nextLine();

			if(!saisie.equals(quitter)) {
				aFaire[nbChoseAFaire] = saisie;
				nbChoseAFaire ++;
			}
		} while (!saisie.equals(quitter) && (nbChoseAFaire < max));

		if (nbChoseAFaire==max) {
			System.out.println("Vous avez indiqué 10 chose à faire c'est déjà pas mal");
		} else System.out.println("Liste de tache : ");

		for(int i=0;i<nbChoseAFaire;i++)
		
		System.out.println(" - "+aFaire[i]);
		console.close();
	}
}