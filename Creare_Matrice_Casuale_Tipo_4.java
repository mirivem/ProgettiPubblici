package esercitazioniPerTestareCodice;

public class Creare_Matrice_Casuale_Tipo_4 {

	public static void main(String[] args) {

		System.out.println(" MATRICE RANDOM 10X10 ");
		System.out.println("");
		
		int min = 1;

		int righeRandom = (int) (Math.random()*10) + min;
		int colonneRandom = (int) (Math.random()*10) + min;
		int[][] matriceRandom = new int [righeRandom][colonneRandom];

		// CREA LA MATRICE

		for(int i = 0; i < righeRandom; i++) {		
			for(int j = 0; j < colonneRandom; j++) {			
				int random = (int) (Math.random() * 50) + min;
				matriceRandom[i][j] = random;

			}
		}

		// STAMPA LA MATRICE

		for(int i = 0; i < righeRandom; i++) {
			for(int j = 0; j < colonneRandom; j++) {
				System.out.print( " [ " + matriceRandom[i][j] + " ] ");
			}
			System.out.println();
		} // Chiusura ciclo FOR

		System.out.println("");
		System.out.println(" Numero di righe creato: " + righeRandom);
		System.out.println(" Numero di colonne creato: " + colonneRandom);

	}

}
