package coder;

import java.util.Scanner;

public class AsciiArt2 {

	public static void main(String[] args) {

		System.out.print("Bonjour nous sommmes le 7 octobre, jour 13");
		System.out.println("Choix de la forme géométrique souhaité");

		final int rectanglePlein = 1;
		final int rectangleCreux = 2;
		final int triangleRectangle = 3;
		final int croixSaintAndre = 4;
		final int losange = 5;
		final int damier = 6;

		int taille;
		int figure;
		char car;

		Scanner console = new Scanner(System.in);

		System.out.println("Quelle taille pour votre figure géométrique ? (En nombre de caractère & largeur = hauteur)");
		taille = console.nextInt();
		System.out.println("Avec quel caractère ?");
		String srt = console.next();
		car = srt.charAt(0);
		System.out.println("Quelle forme désirez-vous ?");
		System.out.println(rectanglePlein+" - Rectangle plein");
		System.out.println(rectangleCreux+" - Rectangle creux");
		System.out.println(triangleRectangle+" - Triangle rectangle");
		System.out.println(croixSaintAndre+" - Croix de Saint-André");
		System.out.println(losange+" - Losange");
		System.out.println(damier+" - Damier");
		figure = console.nextInt();
		console.close();

		for(int a=0; a<taille; a++) {
			for(int b=0; b<taille; b++) {
				
				switch (figure) {

					case 1 : 
						System.out.print(car);
					break;

					case 2 :
						if (a==0 || b==0 || a==taille-1 || b==taille-1) {
							System.out.print(car);
						} else System.out.print(" ");
					break;
		
					case 3 :
						if (a==taille-1 || b==0 || b==a) {
							System.out.print(car);
						} else System.out.print(" ");

					break;

					case 4 :
						if (b==a || b+a==taille-1) {
								System.out.print(car);
						} else System.out.print(" ");
					break;
					
					case 5 :
						if (b+a+1==(taille+1)/2 || b+a+1==taille+(taille/2) || b-a==taille/2 || a-b==taille/2) {
							System.out.print(car);
						} else System.out.print(" ");
					break;

					case 6 :
						if ((b+a)%2==0) {
							System.out.print(car);
						} else System.out.print(" ");
					break;œ

					default : System.out.println("Saisie incorrect");
					break;

				}
			} System.out.println();	

		} 
	}
}