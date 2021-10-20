package coder;

import java.util.Scanner;

public class CoderJour15SuiteSuite {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		final int end = -1;
		final int taille = 10;
		int saisie, i;
		int[] tab = new int[taille];


		for(i = 0; i < taille; i++) {
			tab[i] = 0;
		}
		

		System.out.println("Entrer une valeur comprise en 0 et 9 ou -1 pour terminer");
		saisie = console.nextInt();

		while (saisie != end) {
			if (saisie < 0 || saisie >= taille) {
				System.out.println("Erreur de saisie");
			} else {
				tab[saisie] = tab[saisie] + 1;
			}

			System.out.println("Entrer une valeur comprise en 0 et 9 ou -1 pour terminer");
			saisie = console.nextInt();
		}

		for(i = 0; i < taille; i++) {
			System.out.println("Nombre de "+i+" : "+tab[i]);
		}

		console.close();
	}

}