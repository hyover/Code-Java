package coder;

import java.util.Scanner;

public class CoderJour12 {
	
	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 5 octobre, jour 12");

		//Fields
		int nbTentatives = 0;
		String saisie;
		final int maxTentatives = 4;
		int nbTentativesRestante = 0;

		Scanner console = new Scanner(System.in);

		//Start
		System.out.println("Quelle est la capitale de la France, vous avez 5 tentatives");
		saisie = console.nextLine();
		nbTentativesRestante = maxTentatives-nbTentatives;
		while ((!saisie.equalsIgnoreCase("Paris"))&&(!(nbTentatives==maxTentatives))&&(!(nbTentativesRestante==0))) {
			
			nbTentativesRestante = maxTentatives-nbTentatives;
			System.out.println("Mauvaise réponse !");
			System.out.println("Plus que "+nbTentativesRestante+" tentative(s)");
			System.out.println("Quelle est la capitale de la France");
			saisie = console.nextLine();
			nbTentatives += 1;
			
		}
		if (saisie.equalsIgnoreCase("Paris")) {
			System.out.println("Bravo !");
		}else { System.out.println("Revoyez votre géographie !");}

		console.close();



	}
}