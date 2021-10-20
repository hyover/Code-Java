package coder;

import java.util.Scanner;

public class CoderJour8Suite {

	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes toujours le 29 septembre 2021, jour 8");
		System.out.println("Entrainement boucle");

		//Display table of 7
		final int table7 = 7;

		System.out.println("Table de 7");
		for (int m=0; m<=10; m++){
			System.out.println(m+" x "+table7+" = "+m*table7);
		}

		//Display power of two less than 10 000
		System.out.println("Puissance de deux inférieures à 10 000");
		for (int p=1; p<10000; p*=2) {
			System.out.println(p);
		}

		//While condition with user
		Scanner console = new Scanner(System.in);
		System.out.println("Veux tu continuer ? Répond par Oui ou Non");
		String saisie = console.nextLine();
		while ((!saisie.equalsIgnoreCase("Oui"))&&(!saisie.equalsIgnoreCase("Non"))) {
			System.out.println("Il n'y a que 2 choix possible : Oui ou Non");
			System.out.println("Veux tu continuer ?");
			saisie = console.nextLine();
		}
		
		if (saisie.equalsIgnoreCase("Oui")){
			System.out.println("Ok continuons");
			System.out.println("");
			System.out.println("Combien font 2 x 9 ?");
			int result = console.nextInt();
			int trueresult = 18;
			while (result != trueresult) {
				System.out.println("Faux");
				System.out.println("Combien font 2 x 9 ?");
				result = console.nextInt();
			} System.out.println("Pas très compliqué hein");
		} else {System.out.println("Ok aurevoir");}

		console.close();
	}   
}