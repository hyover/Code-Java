package fonction;

import java.util.Scanner;

public class DeclarationFonction {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Entrez une valeur");
		double val = console.nextDouble();
		console.nextLine();
		System.out.println("Entrez l'exposant");
		int exp = console.nextInt();
		double p = puissance(val, exp);
		double pRound = (double) Math.round(p*100)/100;
		System.out.printf("%f puissance %d = %f%n", val, exp, p);
		console.close();
	}

	public static double puissance(double a, int n) {

		double p = 1;
		for(int i=0; i<n; i++)
		p *= a;
		double pRound = (double) Math.round(p*100)/100;
		return pRound;
	}
}