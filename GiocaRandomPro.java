package com.esercitazioni.personali;

import java.util.Random;
import java.util.Scanner;

public class DadiRandom {

	public static void main(String[] args) {

		boolean again = true;
		while (again) {

			Scanner input = new Scanner (System.in);

			System.out.print("Inserisci il numero di volte che vuoi tirare il dado: ");
			int inputLancioDado = input.nextInt();

			System.out.print("Inserisci il numero delle facce del dado: ");
			int inputMaxTiro = input.nextInt();

			int i = 0;
			while(i < inputLancioDado) {
				Random random = new Random();
				int lancio = i+1;
				int numRandom = random.nextInt(inputMaxTiro)+1;
				System.out.println("Lancio "+lancio+" = "+numRandom);
				i++;
			}

			System.out.println("Gioco terminato.");
			System.out.println("1) per continuare");
			System.out.println("0) per terminare.");

			int inputScelta = input.nextInt();

			if ( inputScelta == 1 ){
				System.out.println("OTTIMO RICOMINCIAMO!!!");	
			} else if ( inputScelta == 0 ) {
				System.out.println("Gioco Terminato!");
				again = false;
			}

		}//while again

	}//main

}//class
