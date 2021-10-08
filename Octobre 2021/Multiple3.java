package coder;

import java.util.Scanner;

public class Multiple3 {

	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le jeudi 7 octobre, jour 13");
		System.out.println("Entrainement multiple");

		//Fields
		int saisie;
		final int multiple = 3;

		Scanner console = new Scanner(System.in);

		//Start
		System.out.println("Entrer un multiple de "+multiple);
		saisie = console.nextInt();

		while ((saisie%multiple)!=0) {
			System.out.println("Erreur "+saisie+" n'est pas un multiple de "+ multiple);
			saisie = console.nextInt();
		}
		System.out.println("Ok : "+saisie+" est un multiple de "+multiple);
		console.close();


	}
}