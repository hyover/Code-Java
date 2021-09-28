package coder;

public class CoderJourTrois {
	
	public static void main (String[] args) {

		System.out.println("Bonjour nous le sommes le 21 septembre 2021, jour 3");
		System.out.println("Entrainement boucle / tableau suite");

		int i = 0;

		for (int i=10; i<21; i+=2) {
			System.out.println(i);
		}

		System.out.println("next");

		int b = 0;

		while (b<10) {
			b++;
			System.out.println("I count "+ b);
		}

		int c = 5;

		do {
			System.out.println("Coucou");
			c -= 1;
		} while (c>0);

		//Méthode 1 chercher un element dans un tableau et stoper quand le boolean est vrai
		int[] myArray = new int[] {1,2,6,6,4,84,28,412,57,1};
		int valeurATrouver = 57;
		boolean contain = false;

		for (int search=0; search<myArray.length; search++) {

			if (myArray[search]==valeurATrouver) {
				contain = true;
			}
		}
		if(contain) {
			System.out.println("La valeur "+valeurATrouver+" est présente");

		}else {
			System.out.println("La valeur "+valeurATrouver+" n'est pas présente");

		}

		//Méthode 2 Interrompte la séquence, (ex chercher un element dans un tableau et arrêter la boucle une fois trouvé) avec break
		String[] basket = new String[]{"apple", "orange", "banana"};

		for (int d =0; d<basket.length;d++) {
			if (basket[d] == "orange") {
		System.out.println ("I have an " +basket[d]+ "!");
		break;
		}
	}

	}
}