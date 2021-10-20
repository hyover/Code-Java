package coder;

import java.util.Scanner;

public class CoderJour17 {
	public static void main(String[] args) {

		//Fields
		final int nbCandidat = 4;
		final int stop = 9954;
		int nbVotes = 0;
		int saisie,i;
		String[] candidats = new String[nbCandidat];
		int[] votes = new int[nbCandidat];

		Scanner console = new Scanner(System.in);

		//Initialisation
		for (i = 0; i < nbCandidat; i++) {
			votes[i] = 0;
		}

		candidats[0] = "Polo";
		candidats[1] = "Marco";
		candidats[2] = "Rico";
		candidats[3] = "Tchikito";

		//Votes
		do {
			for (i = 0; i < nbCandidat; i++) {
			System.out.println((i+1)+" - "+candidats[i]);
			} saisie = console.nextInt();

			if (saisie > 0 && saisie <= nbCandidat) {
				votes[saisie-1] += 1;
				System.out.println("A voté !");
				nbVotes += 1;
			} else {
				if (saisie != stop) System.out.println("Vote nul");
			}

		} while (saisie != stop);
		
		System.out.println("Résultats avec un total de "+nbVotes+" votes :");
		for (i = 0; i < nbCandidat; i++) {
			System.out.println(candidats[i]+" : "+votes[i]*100/nbVotes+"% avec un total de "+votes[i]+" votes");
		}
	


		console.close();
	}
}