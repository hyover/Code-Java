package coder;

import java.util.Scanner;
import java.util.Random;

public class CoderJour11 {

	public static void main(String [] args) {

		System.out.println("Bonjour nous sommes le 4 octobre 2021, jour 11");
		System.out.println("Entrainement boucle avec Ordinateur qui doit trouver un nombre");

		//Fields
		int min = 1;
		int max = 100;
		int nbTentatives = 0;

		int valeur;
		String reponse = "";

	

		//Start
		Scanner console = new Scanner(System.in);
		System.out.println("Choississez un nombre entre "+min+" et "+max+", puis appuyez sur entrée");
		console.nextInt();
		console.nextLine();

		Random random = new Random();

		do {
			valeur = random.nextInt(max);
			System.out.println("Je tente "+valeur+", est-ce plus, moins ou est-ce le nombre ? (+/-/=)");
			nbTentatives += 1;
			
			reponse = console.nextLine();

				switch (reponse) {
					case "+" :
						min = valeur + 1;
						break;
					case "-" :
						max = valeur - 1;
						break;
					case "=" :
						System.out.println("Super j'ai trouvé en "+nbTentatives+" tentatives");
						break;
					default :
						System.out.println("Erreur de saisie. Saisissez seulement (+ ou - ou =) ");
						reponse = console.nextLine();
						break;
					} 
			} while (!reponse.equals("="));

		console.close();

		} 	

	}
