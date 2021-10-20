package coder;

import java.util.Scanner;

public class RisqueVerglasSi {

	public static void main(String[] args) {

		final double blackIceLimit = 2;
		final double coldLimit = 15;
		final double goodLimit = 30;

		Scanner console = new Scanner(System.in);
		System.out.println("Qu'elle température fait-il dehors ?");
		double temperature = console.nextDouble();
		console.nextLine();
		console.close();
		if (temperature < blackIceLimit) {
			System.out.println("Risque de verglas");
		} else {
			if (temperature < coldLimit) {
				System.out.println("C'est pas chaud");
			} else {
				if (temperature < goodLimit) {
					System.out.println("Bonne température");
				} else System.out.println("Trop chaud");
			}
		}
	}
}