package code_java.amateur.octobre_2021;

import java.util.Scanner;
import java.util.Random;

public class Day20BatailleSimple {

	final static char PLOUF = 'x';
	final static char BATEAU = 'b';
	final static char EAU = '~';
	
	public static void main(String[] args) {

		System.out.println();
		System.out.println("Hello we are Thursday, October 21, day 20");
		System.out.println("Micro Bataille navale avec un seul bateau d'une case");
		System.out.println();
		System.out.println("				Légende :");
		System.out.println();
		System.out.println("x = raté		b = bateau		~ = eau non exploré");
		System.out.println();

		final int HAUTEUR = 4;
		final int LARGEUR = 4;
		char[][] plateau = new char[HAUTEUR][LARGEUR];
		boolean gagne;

	   /* 
	    * Initializes board game
	    */

	   	initialiserPlateau(plateau, HAUTEUR, LARGEUR);
		do {
			afficherPlateau(plateau, HAUTEUR, LARGEUR);
			gagne = tirer(plateau, HAUTEUR, LARGEUR);
		} while (gagne == false);
		win(plateau, HAUTEUR, LARGEUR);

	}

	public static void initialiserPlateau(char plateau[][], int dim1, int dim2) {

	   /* 
	   	* Initializes the game board with water in all spaces except one which contains the boat
	   	*/

	   	int i,j;

	   	Random rdm = new Random();

	    for (j = 0; j < dim1; j++) {		
	    	for (i = 0; i < dim2; i++) {	// All squares on the board are initialized to WATER 
	    		plateau[j][i] = EAU;	    
	    	}
	    }

	    plateau[rdm.nextInt(dim1 -1)][rdm.nextInt(dim2 -1)] = BATEAU;		// Drop a boat from one space to a randomly chosen space
	
	}

	public static int saisirEntierEntreBornes(String message, int min, int max) {

	   /* 
	    * Player choice case
	    */	

		int val;
		boolean ok;

		Scanner sc = new Scanner(System.in);

		System.out.println(message);
		do {
			val = sc.nextInt();
			ok = (val >= min) && (val <= max);
			if (ok == false) {
				System.out.println("La valeur doit être comprise entre " + min + " et " + max + ". Ressaississez...");
			} 

		} while (ok == false);

		return val;
	
	}

	public static void afficherPlateau(char plateau[][], int dim1, int dim2) {

	   /* 
	    * Display board of game
	    */

	    int i, j;

	    for (j = 0; j < dim1; j++) {		
	    	for (i = 0; i < dim2; i++) {
	    		if (plateau[j][i] == BATEAU || plateau[j][i] == EAU) {
	    			System.out.print("?");
	    		} else System.out.print(plateau[j][i]);	    
	    	} System.out.println();
	    }
	
	}

	public static boolean tirer(char plateau[][], int dim1, int dim2) {

	   /* 
	    * The player plays a shot by entering shot coordinates
	    */

	    int x, y;

	    System.out.println();
	    x = saisirEntierEntreBornes("Quelle colonne ?", 1, dim2) -1;
	    System.out.println();
	    y = saisirEntierEntreBornes("Quelle ligne ?", 1, dim1) -1;
	    System.out.println();

	    if (plateau[y][x] != BATEAU) {		// shot test
	    	plateau[y][x] = PLOUF;
	    	System.out.println("Plouf !");
	    	System.out.println();
	    } else {
	    	System.out.println("Touché Coulé ! Bravo, vous avez gagné !");
	    }

	    return plateau[y][x] == BATEAU;
	}

	public static void win(char plateau[][], int dim1, int dim2) {

	   /* 
	    * Display board of end game
	    */

	    int a, b;

	    for (a = 0; a < dim1; a++) {		
	    	for (b = 0; b < dim2; b++) {
	    		if (plateau[a][b] == BATEAU) {
	    			System.out.print(BATEAU);
	    		} else System.out.print(plateau[a][b]);	
	    	} System.out.println();
	    }
	}

}