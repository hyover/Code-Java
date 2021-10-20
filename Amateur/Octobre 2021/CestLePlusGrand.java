package code_java.amateur.octobre_2021;

import java.util.Scanner;

public class CestLePlusGrand {

	public static void main(String[] args) {

		/*
		 * Test the max functions and compare
	         */	

		double dVal1, dVal2, dMaximum;
		int iRep;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer une première valeur");
		dVal1 = sc.nextDouble();
		System.out.println("Entrer une deuxième valeur");
		dVal2 = sc.nextDouble();
		sc.close();
		dMaximum = max(dVal1, dVal2);
		System.out.println("Le maximum de " + dVal1 + " et de " + dVal2 + " est " + dMaximum);
		iRep = compare(dVal1, dVal2);

		if (iRep == 0) {
			System.out.println("Les deux valeurs sont égales");
		} else {
			if (iRep > 0) {
				System.out.println("La première valeur est la plus grande");
		} else System.out.println("La deuxième valeur est la plus grande");

		}


	}

	public static double max(double a, double b) {

		/*
		 * Returns the greater of the two values passed in parameter
	         */	
		
		double plusGrand;

		if (a > b) {
			plusGrand = a;
		} else plusGrand = b;

		return plusGrand;

	}

	public static int compare(double a, double b) {

	       /*
		* Returns a value to indicate the order of the two values passed in parameter
		* 0 indicates that the two values are equal.
		* 1 indicates that the first value is the greatest.
		* -1 indicates that the second value is the greater.
		*/

		int ret;

		if (a == b) {
			ret = 0;
		} else {
			if (a > b) {
				ret = 1;
			} else ret = -1;
		}

		return ret;

	}
}
