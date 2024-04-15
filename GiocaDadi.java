package com.esercitazioni.personali;

import java.util.Random;


public class GiocaDadi {

	public static void main(String[] args) {

		// Scrivere un programma divertente:
		// Simulazione di un gioco di dadi ( 6 facce )

		// Scrivere un programma che faccia tirare un dado a 6 facce all'utente.
		// Lo confronta con un dado tirato dal computer.
		// Visualizzi a video il risultato del confronto!
		// Assegni punti al PC o all'Utente.
		// Il programma termina quando si arriva al punteggio 3.

		Random random = new Random();

		System.out.println(" --- Inizio gioco dei Dadi --- ");
		System.out.println("");

		int giocatore = 0;
		int pc = 0;
		while (giocatore < 3 && pc < 3) {
			int numGiocatore = random.nextInt(1 , 7);
			System.out.println(" Il Giocatore tira: " + numGiocatore);

			int number = random.nextInt(1, 7);
			System.out.println(" Il PC tira: " + number);

			if (number > numGiocatore) {
				System.out.println(" Vittoria del PC: " + number);
				System.out.println("");
				pc++;
			} else {
				System.out.println(" Vittoria del Giocatore: " + numGiocatore);
				System.out.println("");
				giocatore++;
			}
		}

		if (pc > giocatore) {
			System.out.println(" Il PC vince! ");
		} else {
			System.out.println(" Il Giocatore vince! ");
		}

	}// main

}// class
