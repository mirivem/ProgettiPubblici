package com.esercitazioni.personali;

import java.util.Scanner;

public class CreareArrayEmodificarlo {

	public static void main(String[] args) {

		try {

			System.out.println(" !!! GIOCA ARRAY CON STRING !!! ");
			System.out.println("");
			System.out.print("Definire la grandezza dell'Array: ");
			Scanner input = new Scanner(System.in);
			int grandezzaArray = input.nextInt();
			System.out.println("");

			// CREAZIONE E DEFINIZIONE DELL'ARRAY
			
			String [] frasi = new String [grandezzaArray];

			// FOR PER VALORIZZARE ARRAY
			
			for( int i = 0 ; i < grandezzaArray ; i++ ) {
				System.out.print("Scrivi una frase: ");
				Scanner  inputFrase= new Scanner(System.in);
				String frase = inputFrase.nextLine();
				frasi[i] = frase;		
			}

			System.out.println("");

			// FOR PER STAMPARE A VIDEO GLI ELEMENTI
			
			for(int i = 0 ; i < grandezzaArray ; i++) {
				System.out.println("Elemento "+ (i+1) +": "+frasi[i]);
			}

			System.out.println("");
			System.out.println(" Vuoi cambiare qualche elemento? ");
			System.out.println(" Si/No ");
			Scanner opzioneCambio = new Scanner(System.in);
			String cambioFatto = opzioneCambio.nextLine();

			if (cambioFatto.equalsIgnoreCase("Si")) {
				Scanner inputCambioElementi = new Scanner(System.in);
				System.out.println("");
				System.out.println(" Quanti elementi vuoi cambiare? ");
				int numValoriCambiati = inputCambioElementi.nextInt();

				if (numValoriCambiati <= grandezzaArray) {
					for(int i = 0 ; i < numValoriCambiati ; i++) {
						System.out.println("");
						System.out.println(" Quale elemento vuoi cambiare? ");
						Scanner inputCambio = new Scanner(System.in); 
						int elementoDaModificare = inputCambio.nextInt()-1;
						System.out.println("");
						System.out.println(" Nuovo nome: ");
						Scanner  inputFraseNuova = new Scanner(System.in);
						String fraseNuova = inputFraseNuova.nextLine();
						frasi[elementoDaModificare] = fraseNuova;
						System.out.println("");
						System.out.println("Elemento cambiato "+ (i + 1) +": " + frasi[elementoDaModificare]);
					}

					System.out.println("");

					// TEST PER VEDERE CHE HA COMBINATO CAMBIANDO L'ARRAY
					
					for(int i = 0 ; i < grandezzaArray ; i++) {
						System.out.println("Elemento "+ (i+1) +": " + frasi[i]);
					}

					System.out.println("");
					System.out.println("E' andato tutto a buon fine! Alla prossima... ");

				} else {
					System.out.println("");					
					System.out.println(" Hai superato la dimensione massima dell'Array! ");
				}

			} else if (cambioFatto.equalsIgnoreCase("No")){
				System.out.println("");
				System.out.println(" Ciao alla prossima !!! ");
			} else {
				System.out.println("");
				System.out.println(" Valore inserito non valido! ");
			}


		} catch (Exception e) {
			System.out.println("");
			System.out.println(" Non corretto! ");
			System.out.println(" Errore: " + e);

		}


	}// main

}// class
