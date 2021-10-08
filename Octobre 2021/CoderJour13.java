package coder;

import java.util.Scanner;
import java.util.Random;

public class CoderJour13 {

	public static void main(String [] args) {

		System.out.println("Bonjour nous sommes le jeudi 7 octobre, jour 13");
		System.out.println("Entrainement boucle et condition");

		final int southPark = 1;
		final int rickEtMorty = 2;
		final int forestGump = 3;
		final int brooklyn99 = 4;
		final int laServanteEcarlate = 5;
		final int end = 6;

		int movie, num;

		Scanner console = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Choissisez un film ou une serie et vous obtiendrez une réplique (1-6)");
		System.out.println(southPark+" - Southpark");
		System.out.println(rickEtMorty+ " - Rick & Morty");
		System.out.println(forestGump+" - Forest Gump");
		System.out.println(brooklyn99+" - Brooklyn 99");
		System.out.println(laServanteEcarlate+" - La Servante Ecarlate");
		System.out.println(end+ " - Quitter cette magnifique application");
		
		do {
			movie = console.nextInt();
			num = random.nextInt(2);

			switch (movie) {
				case southPark : if(num==1) {
									System.out.println("Oh mon dieu ils ont tués Kenny !");
								} else System.out.println("Je vous emmerde et je rentre à ma maison");
				break;

				case rickEtMorty : System.out.println("Avoir une famille ne signifie pas que tu ne dois plus exister en tant qu'individu");
								System.out.println("Tu sais quelle est la meilleure chose que tu puisses faire envers les personnes qui dépendent de toi ?");	
								System.out.println("Etre honnête avec elles, même si cela signifie que tu dois les lâcher");  break;
				case forestGump : System.out.println("Y'a des fois comme ça, y'a pas assez de pierres.."); break;
				case brooklyn99 : System.out.println("Cool cool cool coool"); break;
				case laServanteEcarlate : System.out.println("Que le seigneur ouvre"); break;
				case end : System.out.println("Merci au revoir !"); break;
				default : System.out.println("Saisie incorrect"); break;

			}

		} while (movie != end);

		console.close();
		System.out.println(num);
	}
}