package coder;

import java.util.Scanner;
import java.util.Random;

public class CoderJourCinq {

	public static void main(String[] args) {

		// Intro
		System.out.println("Bonjour nous sommes le 23 septembre 2021, jour 5");
		System.out.println("Entrainement instruction utilisateur");

		//Information Utilisateur
		Scanner console = new Scanner(System.in);
		System.out.println("Comment t'appel-tu ?");
		String name = console.next();
		console.nextLine();
		System.out.println("Quel est ton age ?");
		int age = console.nextInt();
		console.nextLine();
		if (age<30) {
			System.out.println("Bienvenue "+name+", ah "+age+" ans c'est encore jeune");
			System.out.println("------------------------------------------");
		} else {
			System.out.println("Bienvenue "+name+",c'est vrai qu'à "+age+" ans on est un vieux crouton");
			System.out.println("------------------------------------------");
		}

		//Note aléatoire
		System.out.println("Je vais t'attribuer une note aléatoire sur 20, souviens toi en bien");
		
		System.out.println("Si tu es d'accord tape : Ok ");
		String entrer = console.next();
		console.nextLine();
		
		
		if (entrer.equalsIgnoreCase("Ok")) {
			System.out.println("Abracadabra !");
			System.out.println("------------------------------------------");
		} else {
			System.out.println("Bon tu as du mal je ne t'en veux pas ! Abracadabra !");
			System.out.println("------------------------------------------");
		}
		
		

		Random r = new Random();
		int note = 1 + r.nextInt(21 - 1 + 1); 
		System.out.println("Ta note est de "+note+" /20");
		if (note>=15) {
			System.out.println("Tu as de la chance, tu commences avec une bonne note !");
		} else {
			if (note<=10) {
				System.out.println("Tu as du chemin à faire");
				System.out.println("------------------------------------------");
			} else {
				System.out.println("Pas mal mais t'es pas encore à 20");
				System.out.println("------------------------------------------");
			}
		}

		// Lettre aléatoire
		System.out.println("Désormais nous allons te choisir une lettre alétoire");
		System.out.println("Si tu es d'accord tape encore une fois : Ok ");
		String entrerDeux = console.next();
		console.nextLine();
		
		if (entrerDeux.equalsIgnoreCase("Ok")) {
			System.out.println("Atchoum !");
			System.out.println("------------------------------------------");
		} else {
			System.out.println("Bon, finalement tu es vraiment illettré ! Atchoum !");
			System.out.println("------------------------------------------");
		}
		console.close();

		Random l = new Random();
		char car = (char) ('a' + l.nextInt('z' - 'a' + 1));
		System.out.println("Voici la lettre "+car+" !! C'est ta lettre, note la bien");é""

	}
}