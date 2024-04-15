package it.esercizicapitolo.tre;

import java.util.Scanner;

public class Es3_11 {

	private static boolean isInteger(String input) {
		String verifica = "^-?\\d+$";

		return input.matches(verifica);
	}

	public static void main(String[] args) {

		// CALCOLO DEL MASSIMO
		// Il programma deve acquisire due numeri interi
		// deve determinare quale dei due numeri è maggiore
		// e stampare il valore di tale numero.

		Scanner inputStr = new Scanner(System.in);

		System.out.println(" CALCOLO DEL MASSIMO ");
		System.out.println("");
		System.out.println(" Inserire il primo numero intero: ");
		String num1 = inputStr.nextLine();
		System.out.println("");
		System.out.println(" Inserire il secondo numero intero: ");
		String num2 = inputStr.nextLine();

		boolean isNumInt1 = isInteger(num1);
		boolean isNumInt2 = isInteger(num2);

		if(isNumInt1 && isNumInt2) {
			int numInt1 = Integer.valueOf(num1);
			int numInt2 = Integer.valueOf(num2);
			int max = Math.max(numInt1, numInt2);

			System.out.println("");
			System.out.println(" --------------------- ");
			System.out.println(" Il massimo è " + max);
			System.out.println(" --------------------- ");
		} else {
			System.out.println("");
			System.out.println(" Non hai inserito un numero intero! ");
		}

	}// main

}// class
