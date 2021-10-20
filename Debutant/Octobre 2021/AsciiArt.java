package coder;

import java.util.Scanner;

public class AsciiArt {

	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 7 ocotbre, jour 13");
		System.out.println("Entrainement ASCII ART");
		System.out.println("Un carré plein");

		//Fields
		int width, heigth, i, j;
		char car;

		Scanner console = new Scanner(System.in);

		//Start
		System.out.println("Largeur ?");
		width = console.nextInt();
		System.out.println("Hauteur ?");
		heigth = console.nextInt();
		System.out.println("Avec quel caractère ?");
		String str = console.next();
		car = str.charAt(0);
		console.close();

		for (j=0; j<heigth; j++)
		{

			for (i=0; i<width; i++)
			{
				System.out.print(car);
			}

			System.out.println(car);
		}
		

	}
}