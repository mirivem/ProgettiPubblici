package com.corsojavarebis.esercizi;

import java.util.Scanner;

public class GiocaWhile {

	public static void main(String[] args) {

		// Scrivere un programma che:
		// Prenda in input un numero;
		// Scriva a video tutti i numeri da 0 fino al numero preso in input;
		// Se il numero inserito è 0, deve apparire il messaggio: programma terminato.

		Scanner inputNum = new Scanner(System.in);

		System.out.println(" Inserire un numero: ");
		double numScelto = inputNum.nextDouble();
		System.out.println("");

		System.out.println(" Il numero scelto è : " + numScelto);
		System.out.println("");

		if (numScelto==0) {
			System.out.println("");
			System.out.println(" Programma terminato! ");			
		} else {
			int inizio = 0;
			while (inizio<=numScelto) {
				System.out.println(" Conteggio : " + inizio);
				inizio++;
			}
		}

	}//main

}//class
