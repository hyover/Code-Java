package coder;

public class CoderJour18 {
	public static void main(String[] args) {

		//Fields
		final int taille = 3;
		int i, j, val;
		int[][] tab2d = new int[taille][taille];

		//Start
		val = 1;
		for (j = 0; j < taille; j++) {
			for (i = 0; i < taille; i++) {
				tab2d[i][j] = val;
				val = val + 1;
				System.out.print(tab2d[j][i]+ " ");
			}
		System.out.println();
		}
		
	}
}