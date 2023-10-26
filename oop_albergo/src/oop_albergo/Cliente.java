package oop_albergo;

import java.util.Scanner;

public class Cliente {

	// ATTRIBUTI:

	private String cognome;
	private String nome;
	private String residenza;
	private int telefono;


	// COSTRUTTORE SENZA PARAMETRI:

	Cliente(){
		cognome = "";
		nome = "";
		residenza = "";
		telefono = 0;

	}


	// COSTRUTTORE CON PARAMETRI:

	Cliente(String cognome, String nome, String residenza, int telefono){
		this.cognome = cognome;
		this.nome = nome;
		this.residenza = residenza;
		this.telefono = telefono;

	}


	// SET/GET

	public void setCognome(String cognome) {
		if(cognome.length() > 0) {
			this.cognome = cognome;

		}else {
			this.cognome = "";

		}

	}

	public String getCognome() {
		return cognome;

	}

	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;

		}else {
			this.nome = "";

		}

	}

	public String getNome() {
		return nome;

	}

	public void setResidenza(String residenza) {
		if(residenza.length() > 0) {
			this.residenza = residenza;
			
		}else {
			this.residenza = "";
			
		}
		
	}

	public String getResidenza() {
		return residenza;

	}

	public void setTelefono(int telefono) {
		if(telefono >= 10) {
			this.telefono = telefono;
			
		}else {
			this.telefono = 0;
			
		}

	}

	public int getTelefono() {
		return telefono;

	}


	// INSERIMENTO:

	public void inserimento() {

		Scanner keyboard = new Scanner(System.in);

		String cognome;
		String nome;
		String residenza;
		int telefono;

		// INSERIMENTO COGNOME:
		
		do {
			System.out.print("Cognome: ");
			cognome = keyboard.nextLine();
			
		}while(cognome.length() < 0);
		setCognome(cognome);

		// INSERIMENTO NOME:
		do {
			System.out.print("Nome: ");
			nome = keyboard.nextLine();
			
		}while(nome.length() < 0);
		setNome(nome);
		
		// INSERIMENTO RESIDENZA:
		do {
			System.out.print("Residenza: ");
			residenza = keyboard.nextLine();
			
		}while(residenza.length() < 0);
		setResidenza(residenza);
		
		// INSERIMENTO TELEFONO:
		do {
			System.out.print("Recapito telefonico: ");
			telefono = keyboard.nextInt();
			
		}while(telefono < 0);
		
		keyboard.nextLine();
		setTelefono(telefono);
		
	}

	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println("Cognome: " + cognome);
		System.out.println("Nome: " + nome);
		System.out.println("Residenza: " + residenza);
		System.out.println("Recapito telefonico: " + telefono);
		
	}
	
	// TO-STRING:
	
	public String toString() {
		String frase = "Cognome: " + getCognome() + " Nome: " + getNome() + " Residenza: " + getResidenza() + " Recapito telefonico: " + getTelefono();
		return frase;
		
	}
	
}
