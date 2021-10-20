package coder;

public class CoderJour15Suite {
	public static void main(String[] args) {


		System.out.println("Bonjour nous sommes le lundi 11 octobre, jour 15");
		System.out.println("Exercice Décollage immédiat");

		final int taille = 11;
		int[] number = new int[taille];

		for(int i = 0; i < taille; i++){
			number[i] = taille -1 -i;
		}

		for(int i = 0; i < 11; i++){
			System.out.println(number[i]);
		} System.out.println("Boom ! ");
	

	}
}