package procedure;

import java.util.Scanner;

public class DeclarationProcedure {
	public static void main(String[] args) {
	/* public static void = nécessaire pour déclarer procédure
	   main = nom_nom_de_la_procédure
	   (String[] args) = liste_des_paramètres

	   C'est la fonction principale
	*/

	Scanner console = new Scanner(System.in);
	System.out.println("Quelle phrase devez-vous recopier ?");
	String phrase = console.nextLine();
	System.out.println("Combien de fois devez-vous le recopier ?");
	int nbFois = console.nextInt();
	console.nextLine();
	afficheNfois(phrase,nbFois);
	console.close();

	}

	public static void afficheNfois(String t, int n) {

		System.out.println(t);
		if (n - 1 > 0) {
			afficheNfois(t, n-1);

		}	

		/*for (int i = 0; i < n; i++) {
			
			System.out.println(t);
			System.out.println();
		} */
	


	}
}