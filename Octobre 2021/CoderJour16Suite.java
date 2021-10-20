package coder;

import java.util.Scanner;

public class CoderJour16Suite {
	public static void main(String[] args) {

		System.out.println("Algorithmique qui calcul la moyenne d'une classe de 30 étudiants sur une évaluation noté sur 20");

		//Fields
		final int taille = 30;
		final int stop = -1;
		double[] notes = new double[taille];
		int nbNotes = 0;
		double moyenne = 0;
		double saisie;
		double total;
		int i;

		Scannyer console = new Scanner(System.in);

		//Saisie des notes
		System.out.println("Note ? ");
		saisie = console.nextDouble();

		while (saisie != stop && nbNotes < 31) {
			notes[nbNotes] = saisie;
			nbNotes = nbNotes + 1;
			System.out.println("Note ? ("+nbNotes+"/30");
			saisie = console.nextDouble();
		}

		if (saisie == stop || nbNotes == 30) {
			System.out.print("La moyenne des notes "+notes[0]);
			total = notes[0];
			for (i = 0; i < nbNotes; i++) {
				total = total + notes[i];
				System.out.print("; "+notes[i]);
			}
			moyenne = total/nbNotes;
			moyenne = (double) Math.round(moyenne*100)/100;

			System.out.println(") est de "+moyenne+"/20 pour la classe");

		} else System.out.println("Aucune note à était saisie");

	}
}