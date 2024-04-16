package com.esercitazioni.test;

import java.util.Random;


public class TestGiocoDadi {

	public static void main(String[] args) {

		// Scrivere un programma divertente:
		// Simulazione di un gioco di dadi ( 6 facce )

		// Scrivere un programma che faccia tirare un dado a 6 facce all'utente.
		// Lo confronta con un dado tirato dal computer.
		// Visualizzi a video il risultato del confronto!
		// Assegni punti al PC o all'Utente.
		// Il programma termina quando si arriva al punteggio 3.
		//  Altro metodo >> int number = random.nextInt(6)+1;

		Random random = new Random();
		
		boolean vittorie = true;
		int giocatoreWin = 0 ;
		int pcWin = 0;

		System.out.println(" --- INIZIO GIOCO DEI DADI --- ");
		System.out.println("");

		while (vittorie) {

			int numGiocatore = random.nextInt(1, 7);
			System.out.println(" Il Giocatore tira: " + numGiocatore);

			int number = random.nextInt(1, 7);
			System.out.println(" Il PC tira: " + number);


			if (numGiocatore > number){
				System.out.println(" > Il Giocatore vince con " + numGiocatore);
				System.out.println("");
				giocatoreWin++;
			}

			if (number == numGiocatore) {
				pcWin = giocatoreWin;
				System.out.println(" > Pareggio! ");
				System.out.println("");
			}

			if (number > numGiocatore){
				System.out.println(" > Il PC vince con " + number);
				System.out.println("");
				pcWin++;
			}

			if (pcWin == 3 || giocatoreWin == 3) {
				vittorie = false;
			}
		}

		if (pcWin > giocatoreWin) {
			System.out.println(" -------------------- ");
			System.out.println(" --- Il PC vince! --- ");
			System.out.println(" -------------------- ");
			System.out.println("");
			System.out.println(" Totale vittorie: " + pcWin);
		} else {
			System.out.println(" --------------------------- ");
			System.out.println(" --- Il Giocatore vince! --- ");
			System.out.println(" --------------------------- ");
			System.out.println("");
			System.out.println(" Totale vittorie: " + giocatoreWin);
		}

	}// main

}// class
