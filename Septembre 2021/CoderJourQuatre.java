package coder;

public class CoderJourQuatre {
	
	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 22 septembre 2021, jour 4");
		System.out.println("Entrainement operations");

		int chiffreAffaire = 10000;
		double tVA = 20.00/100;

		double beneficeAffaire = chiffreAffaire * tVA;

		System.out.println(beneficeAffaire);

		System.out.println("Fake Story");

		String[] familly = new String[]{"Logan","Jeremy","Alicia","Meghane"};

		for (int i=0; i<familly.length; i++) {
			System.out.println(i+familly[3]);

		}
	}
}