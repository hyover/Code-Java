package coder;

import java.util.Scanner;
import java.util.Random;


public class CoderJour10 {
	
	public static void main(String[] args) {

		int nbComputer = 0;
		int nbTentative = 0;
		String reply;
		int max = 100;
		int mini = 1;

		Random random = new Random();
		Scanner console = new Scanner(System.in);

		System.out.println("Choississez un nombre compris entre 1 et 100, puis appuyez sur entrée");
		console.nextInt();
		console.nextLine();

		do { 
			nbComputer = random.nextInt(mini+max);
			System.out.println("Je tente "+nbComputer+", est-ce plus ou moins ou le bon nombre ? (+/-/=)");
			reply = console.nextLine();
			nbTentative += 1;
			
			while {
				reply = console.nextLine();
				switch (reply) {

				case  ("+") : 
					mini = mini + nbComputer;
					break;

				case ("-") :
					max = max - nbComputer;
					break;

				case ("=") :
					System.out.println("Super j'ai trouvé en"+nbTentative+" tentatives");
					break;

				default : 
					System.out.println("Je ne comprend pas");
					reply = console.nextLine();
					break;
					
			}
			
			}

		 } while (!reply.equals("="));

		console.close();
		System.out.println("Super j'ai trouvé en "+nbTentative+" tentatives");
	
}
}
	