package coder;



public class CoderJour15 {
	public static void main(String[] args) {


		System.out.println("Bonjour nous sommes le lundi 11 octobre, jour 15");
		System.out.println("Entrainement tableau type réference & multidimensionnel");

		//Fields
		final int taille = 4;
		int[] t1 = new int[taille];
		int[] t2;
		int i;

		//Start
		for (i=0;i<taille;i++) {
			t1[i] = i + 1;
		}
		t2 = t1;
		t2[2] = 9;
		t1[0] = 6;

		for(i=0;i<taille;i++) {
			System.out.println("t1["+i+"] = "+t1[i]+" - t2["+i+"] = "+ t2[i]);
		}

		System.out.println("Tableau multidimensionnel");

		final int nbLigne = 2;
		final int nbColonne = 3;
		char[][] tab2d = new char[nbLigne][nbColonne];
		tab2d[0][0] = 'E';
 		tab2d[0][1] = 'N'; 
 		tab2d[0][2] = 'I';
 		tab2d[1][0] = 'D'; 
 		tab2d[1][1] = 'e';
 		tab2d[1][2] = 'v'; 
 		
 		for(int a = 0; a <tab2d.length; a++) { //tab2d.length or nbLigne
 			for(int b = 0; b <tab2d[a].length; b++) { // tab2d[a].length or nbColonne
 				System.out.print(tab2d[a][b]);
 			}
   		
			System.out.println();
		}

	}
}