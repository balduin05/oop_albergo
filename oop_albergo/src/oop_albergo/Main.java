package oop_albergo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n_clienti;
		
		// INSERIMENTO NUMERO DI CLIENTI:
		
		System.out.print("Inserire quanti dati di clienti si vogliono registrare all'interno del programma: ");
		n_clienti = keyboard.nextInt();
		keyboard.nextLine();
		
		// CREAZIONE ARRAY DI DATI DEI CLIENTI:
		
		Cliente data[] = new Cliente[n_clienti];
		
		// INSERIMENTO INFORMAZIONI DEI CLIENTI:
		for(int i = 0; i < n_clienti; i++) {
			Cliente c = new Cliente();
			System.out.println("Inserisci informazioni cliente " + (i + 1) + ": ");
			System.out.println();
			
			c.inserimento();
			data[i] = c;
			
		}
		
		// VISUALIZZA INFORMAZIONI CLIENTI:
		
		for(int i = 0; i < n_clienti; i++) {
			data[i].visualizza();
			
		}
		
	}

}
