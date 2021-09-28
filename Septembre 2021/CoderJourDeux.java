package coder;

public class CoderJourDeux {

	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 20 septembre 2021, jour 2");
		System.out.println("Entrainement boucle");

		int [] myArray = new int[]{7,5,6,9};

		for (int i=0; i<=myArray.length; i++) {

			System.out.println(i);
		}

		System.out.println("now just show array :");

		for (int myArrayShow: myArray) { // for show values array
			
			System.out.println(myArrayShow);
		}

		System.out.println("I go planted trees");
		int numberOfTrees = 0;

		while (numberOfTrees < 5) {
			numberOfTrees += 2;
		}
		System.out.println("I have planted "+numberOfTrees+ " trees !!");

		System.out.println("we have 8 parking place for 2 house");

		String [][] placeOfParking = new String[][] {

			{"house one first place for rdc", "house one second place for rdc", "house one first place for etage", "house one second place for etage"},
			{"house one first place for rdc", "house one second place for rdc", "house one first place for etage", "house one second place for etage"}
		};

		System.out.println("My place it's "+placeOfParking[0][2]);

		System.out.println("I go push up goal");

		int pushUpGoal = 20; // with do while, the condition it's execute at least once

		do {
			System.out.println("Push up !");
			pushUpGoal -= 1;
		} while (pushUpGoal > 0);

		System.out.println("Ignore jump 10 and 12");

		for (int jump = 1; jump<20; jump++) {
 
			System.out.println(jump);
			if(jump == 10 || jump == 12) {
				continue;
			}
		}



	}
}