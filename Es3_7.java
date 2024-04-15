package it.esercizicapitolo.tre;

import java.util.Scanner;

public class Es3_7 {

	public static void main(String[] args) {

		// EQUAZIONE DI PRIMO GRADO
		
		Scanner inputDouble = new Scanner(System.in);
		
		System.out.println(" --- --- --- --- --- --- --- --- --- --- --- --- ");
		System.out.println("     RISOLUZIONE DI EQUAZIONE DI PRIMO GRADO     ");
		System.out.println("         < Data l'equazione ax + b = 0 >         ");
		System.out.println(" --- --- --- --- --- --- --- --- --- --- --- --- ");
		System.out.println("");
		System.out.println(" Inserire il valore a: ");
		double a = inputDouble.nextDouble();
		System.out.println("");
		System.out.println(" Inserire il valore b: ");
		double b = inputDouble.nextDouble();
		
		// OPERAZIONE
		
		double x = - b / a;
		
		System.out.println("");
		System.out.println(" --- --- --- --- --- --- --- --- --- --- --- --- ");
		System.out.println(" x = " + x);
		System.out.println(" --- --- --- --- --- --- --- --- --- --- --- --- ");
		

	}

}
