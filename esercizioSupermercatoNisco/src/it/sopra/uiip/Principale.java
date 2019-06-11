package it.sopra.uiip;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {

		// Creazione  e Stampa di Cliente e Prodotto Nisco
		Cliente antonio =new Cliente("an9666","Antonio","Nisco",1200);
		Prodotto p1Nisco=new Prodotto("zero1","pane",1.5,2);
		Prodotto p2Nisco=new Prodotto("zero2","pasta",3,4);
		Prodotto p3Nisco=new Prodotto("zero3","acqua",5,10);
		
		System.out.println(antonio);
		System.out.println(p1Nisco);
		System.out.println(p2Nisco);
		System.out.println(p3Nisco);
		// fine Nisco

		
		//Inizio Codice Giuseppe
		Cliente clienteGiuseppe = new Cliente("AGT34KI", "Giuseppe", "Ristaino", 1200);
		
		Prodotto prodottoGiuseppe1 = new Prodotto("CP2", "Cassetta di pane risicato", 5.99, 5);
		Prodotto prodottoGiuseppe2 = new Prodotto("AS12", "Lombata di maiale", 23.99, 12);
		Prodotto prodottoGiuseppe3 = new Prodotto("LO1", "Uovo sodo", 1.99, 1);
		
		System.out.println(clienteGiuseppe);
		
		System.out.println(prodottoGiuseppe1);
		System.out.println(prodottoGiuseppe2);
		System.out.println(prodottoGiuseppe3);
		//Fine codice Giuseppe
	
		//Inizio codice Oksana
		Cliente cliente =new Cliente ("FD657DG", "Oksana","Gonchar", 300);
		Prodotto prodotto =new Prodotto ("D5674", "pane", 3 , 13);
		Prodotto prodotto1 = new Prodotto ("v5647", "latte", 2.3, 34);
		System.out.println(cliente);
		System.out.println(prodotto);
		System.out.println(prodotto1);
		//Fine codice Oksana
		
		//Inizio codice Giuseppe 
		ArrayList<Prodotto> listaProdottiGiuseppe = new ArrayList<Prodotto>();
		listaProdottiGiuseppe.add(prodottoGiuseppe1);
		listaProdottiGiuseppe.add(prodottoGiuseppe2);
		listaProdottiGiuseppe.add(prodottoGiuseppe3);
		
		double importoGiuseppe = Supermercato.calcolaImporto(listaProdottiGiuseppe);
		
		Scontrino scontrinoGiuseppe = new Scontrino("001", clienteGiuseppe, listaProdottiGiuseppe, importoGiuseppe);
		
		System.out.println("Scontrino Giuseppe:");
		System.out.println(scontrinoGiuseppe);
		
		int puntiScontrinoGiuseppe = Supermercato.calcolaPunti(scontrinoGiuseppe);
		
		System.out.println("Punti scontrino Giuseppe: " +puntiScontrinoGiuseppe);
		//Fine codice Giuseppe
		
		ArrayList<Cliente> listaClienti = new ArrayList<Cliente>();
		listaClienti.add(cliente);
		listaClienti.add(clienteGiuseppe);
		listaClienti.add(antonio);
		System.out.println("Il cliente pi� fedele: ");
		System.out.println(Supermercato.clientiPiuFedeli(listaClienti));

	}

}
