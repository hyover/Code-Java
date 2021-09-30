package coder;

import java.util.ArrayList;

public class CoderJourUn {

	public static void main(String[] args) {

		System.out.println("Bonjour, nous sommes le 18 septembre 2021, jour 1");
		System.out.println("Entrainement tableau");

		String[] mProject = new String[5];

		mProject[0] = "- Appeler "";
		mProject[1] = "- Appeler "";
		mProject[2] = "- Coder tous les jours";
		mProject[3] = "- Livre audio tous les jours";
		mProject[4] = "- Anglais every days";

		mProject[0] = "- Contacter "";

		System.out.println("Nous avons "+mProject.length+ " projets à effectuer rapidement :");
		System.out.println(mProject[0]);
		System.out.println(mProject[1]);
		System.out.println(mProject[2]);
		System.out.println(mProject[3]);
		System.out.println(mProject[4]);

		System.out.println("Passons à la suite :");

		String[][] room = new String[2][6]; // 2 étage et 6 pièce par étage

		room[0][0] = "Cuisine RDC";
		room[0][1] = "Salon RDC";
		room[0][2] = "Bureau RDC";
		room[0][3] = "SDB RDC";
		room[0][4] = "Chambre 1 RDC";
		room[0][5] = "Chambre 2 RDC";

		room[1][0] = "Cuisine Etage";
		room[1][1] = "Salon Etage";
		room[1][2] = "Bureau Etage";
		room[1][3] = "SDB Etage";
		room[1][4] = "Chambre 1 Etage";
		room[1][5] = "Chambre 2 Etage";

		

		System.out.println("Nous avons "+room.length+ " étage dans la maison entière");
		System.out.println("La "+room[0][0]+ " est grande");


		// Tableau multidimensionnel en une seule instruction
		String[][] room2 = new String[][] {

			{"Cuisine RDC", "Salon RDC"},
			{"Cuisine Etage", "Salon Etage"}

	};

		System.out.println("La "+room2[1][0]+" est petite");
	
}
}
