package coder;

import java.util.Scanner;

public class CoderJour8 {

	public static void main(String[] args) {

		System.out.println("Bonjour nous sommes le 29 septembre 2021, jour 8");
		System.out.println("Création d'un bulletin de salaire simplifié");

		//Fields
		String name, firstName;
		int statut, nbOfChildren;
		double nbHours, hourlyRate, nbHours50, nbHours60, csgImp, csgnImp, assMal, assVie, assCho, retCmp, cotAgf, prime, totalCot;
		double grossSalary = 0;
		double netSalary;

		final int serviceAgent = 1;
		final int clerk = 2;
		final int executive = 3;

		final double increasedRate50 = 50.00/100;
		final double increasedRate60 = 60.00/100;

		final double threSholdIncrease50 = 169;
		final double threSholdIncrease60 = 180;

		final double csgImpRate = 3.49/100;
		final double csgnImpRate = 6.15/100;
		final double assMalRate = 0.95/100;
		final double assVieRate = 8.44/100;
		final double assChoRate = 3.05/100;
		final double retCmpRate = 3.81/100;
		final double cotAgfRate = 1.02/100;

			//Entering the information necessary to establish the pay slip
			Scanner console = new Scanner(System.in);
			System.out.println("Nom de la personne ?");
			name = console.nextLine();
			System.out.println("Prénom de la personne ?");
			firstName = console.nextLine();
			System.out.println("Statut ?");
			System.out.println(serviceAgent+ " - Agent de Service");
			System.out.println(clerk+ " - Employé de bureau");
			System.out.println(executive+ " - Cadre");
			statut = console.nextInt();
			System.out.println("Nombre d'heures travaillés ?");
			nbHours = console.nextDouble();
			System.out.println("Taux horraire ?");
			hourlyRate = console.nextDouble();
			System.out.println("Nombre d'enfants ?");
			nbOfChildren = console.nextInt();
			console.close();

			//Display of the pay slip header
			System.out.println("");
			System.out.println("");
			System.out.println("Bulletin de salaire de "+firstName+ " "+name);
			if (statut <= executive) {
				System.out.println("Statut : Cadre");
			} else {
				if (statut <= clerk) {
					System.out.println("Statut : Employé de bureau");
				} else System.out.println("Statut : Agent de Service");
			}

			//Calculation of gross salary
			nbHours60 = nbHours - threSholdIncrease60;
			if (nbHours60 > 0) {
				grossSalary = nbHours60 * (increasedRate60 + 1) * hourlyRate;
				nbHours = nbHours - nbHours60;
			}

			nbHours50 = nbHours - threSholdIncrease50;
			if (nbHours50 > 0) {
				grossSalary = grossSalary + nbHours50 * (increasedRate50 + 1) * hourlyRate;
				nbHours = nbHours - nbHours50;
			}


			if (nbHours50 <= 0) { nbHours50 = 0; }
			if (nbHours60 <= 0) { nbHours60 = 0; }

			grossSalary = grossSalary + nbHours * hourlyRate;


			System.out.println("");
			System.out.println("Salaire brut : "+grossSalary+ "€ ("+nbHours+" h sans majoration, "+nbHours50+ " h avec une majoration de "+increasedRate50*100+ "%, "
								+nbHours60+ " h avec une majoration de "+increasedRate60*100+ "%");

			//Calculation of employee contribution
			System.out.println("");
			System.out.println(" - Contribution pour le remboursement de la dette sociale et contribution sociale généralisée imposable");
			csgImp = grossSalary * csgImpRate;
			csgImp = (double) Math.round(csgImp*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+csgImpRate * 100+ "% = "+csgImp+ "€");

			System.out.println(" - Contribution sociale généralisée non imposable");
			csgnImp = grossSalary * csgnImpRate;
			csgnImp = (double) Math.round(csgnImp*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+csgnImpRate * 100+ "% = "+csgnImp+ "€");

			System.out.println(" - Assurance Maladie");
			assMal = grossSalary * assMalRate;
			assMal = (double) Math.round(assMal*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+assMalRate * 100+ "% = "+assMal+ "€");

			System.out.println(" - Assurance vieillesse");
			assVie = grossSalary * assVieRate;
			assVie = (double) Math.round(assVie*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+assVieRate * 100+ "% = "+assVie+ "€");

			System.out.println(" - Assurance chômage");
			assCho = grossSalary * assChoRate;
			assCho = (double) Math.round(assCho*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+assChoRate * 100+ "% = "+assCho+ "€");

			System.out.println(" - Retraitre complémentaire (IRCEM)");
			retCmp= grossSalary * retCmpRate;
			retCmp = (double) Math.round(retCmp*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+retCmpRate * 100+ "% = "+retCmp+ "€");

			System.out.println(" - Cotisation AGFF");
			cotAgf = grossSalary * cotAgfRate;
			cotAgf = (double) Math.round(cotAgf*100)/100;
			System.out.println("------------>   "+grossSalary+ "€ x "+cotAgfRate * 100+ "% = "+cotAgf+ "€");

			System.out.println("");
			totalCot = csgImp + csgnImp + assMal + assVie + assCho + retCmp + cotAgf;
			totalCot = (double) Math.round(totalCot*100)/100;
			System.out.println("Total des cotisations salariales : "+totalCot+ "€");

			netSalary = grossSalary - totalCot;
			System.out.println("Salaire net sans prime : "+netSalary+ "€");


			//Premium calculation
			switch (nbOfChildren) {
				case (0) : prime = 0; break;
				case (1) : prime = 20; break;
				case (2) : prime = 50; break;
				default : prime = 70 + 20 * (nbOfChildren - 2); break;
			}

			System.out.println(" - Prime familiale : "+prime+"€");
			netSalary = netSalary + prime;
			System.out.println("");
			System.out.println("Salaire net à payer : "+netSalary+"€");









































	}
}