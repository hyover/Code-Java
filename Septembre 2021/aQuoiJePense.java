package coder;

import java.util.Scanner;
import java.util.Random;

public class AQuoiJePense {
	
	public static void main(String[] args) {

		Random random = new Random();
		final int nbAleatoire = random.nextInt(100+1);

		Scanner console = new Scanner(System.in);
		System.out.println("A quel nombre je pense ? (entre 1 et 100)");
		int saisie = console.nextInt();
		while (saisie != nbAleatoire) {
			if (saisie < nbAleatoire) {
			System.out.println("C'est plus grand !");
			System.out.println("A quel nombre je pense ? (entre 1 et 100)");
			saisie = console.nextInt();
		} else {
			System.out.println("C'est plus petit");
			System.out.println("A quel nombre je pense ? (entre 1 et 100)");
			saisie = console.nextInt();
		}	
		
		} 

		System.out.println("Bravo !");
			

	}
}