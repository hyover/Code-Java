package coder;

import java.util.Scanner;

public class CoderJour16 {
	public static void main(String[] args) {

		//Fields
		final int taille = 50;
		final int stop = -1;
		double[] notes = new double[taille];
		int nbNote = 0;
		double saisie;
		int i;
		double total;
		double moyenne = 0;

		Scanner console = new Scanner(System.in);

		//Start
		System.out.println("Note ? (Max 50)");
		saisie = console.nextDouble();

		while (saisie != stop && nbNote<taille) {
			notes[nbNote] = saisie;
			nbNote = nbNote + 1;
			System.out.println("Note ? (Nombre de note : "+nbNote+"/50");
			saisie = console.nextDouble();
		}
		console.close();

		if (saisie == stop || nbNote == taille) {
			System.out.print("La moyenne des notes ("+notes[0]);
			total = notes[0];
			for (i = 0; i < nbNote; i++) {
				total = total + notes[i];
				System.out.print("; "+notes[i]);
			}
			moyenne = total/nbNote;
			moyenne = (double) Math.round(moyenne*100)/100;

			System.out.println(") est de "+moyenne+"/20");
		} else System.out.println("Aucune note à était saisie");

	}
}