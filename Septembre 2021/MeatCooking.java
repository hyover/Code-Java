package coder;

import java.util.Scanner;

public class MeatCooking {

	public static void main(String[] args) {

		//Fields
		int meat;
		int weight;
		int cooking;

		final double coefficient;

		final int boeuf = 1;
		final int agneaux = 2;
		
		final int bleu = 1;
		final int aPoint = 2;
		final int bienCuit = 3;

		final int uneMinute = 60;

		final double bleuA = 15.00/100;
		final double bleuB = 10.00/500;
		final double aPointA = 25.00/400;
		final double aPointB = 17.00/500;
		final double bienCuitA = 40.00/400;
		final double bienCuitB = 25.00/500;


		//Choice meat
		Scanner console = new Scanner(System.in);
		System.out.println("Choississez votre viande en tapant 1 ou 2");
		System.out.println(boeuf+ "- boeuf");
		System.out.println(agneaux+ "- agneaux");
		meat = console.nextInt();
		console.nextLine();

		//Weight meat
		System.out.println("Quel est le poid de votre viande en gramme ?");
		weight = console.nextInt();
		console.nextLine();

		//Choice preference cooking
		System.out.println("Choississez votre cuisson pour votre viande en tapant 1, 2 ou 3");
		System.out.println(bleu+ "- Bleu");
		System.out.println(aPoint+ "- A point");
		System.out.println(bienCuit+ "- Bien cuit");
		cooking = console.nextInt();
		console.close();

		//Function for cooking conditions
		if (meat <= boeuf) {
			switch (cooking) {
				case (bleu) : 
					coefficient = bleuB;
					break;
				case (aPoint) :
					coefficient = aPointB;
					break;
				default : coefficient = bienCuitB;
			} 
		}else {
			switch (cooking) {
				case (bleu) :
					coefficient = bleuA;
					break;
				case (aPoint) : 
					coefficient = aPointA;
					break;
				default : coefficient = bienCuitA;
			}
		}

		double cuisson = weight*coefficient*uneMinute;
		double time = cuisson/60;
		
		System.out.println("Le temps de cuisson pour viande est de "+time+ " minutes");








	}
}