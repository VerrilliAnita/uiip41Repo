package it.sopra.uiip;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {

		// Creazione  e Stampa di Cliente e Prodotto Nisco
		Cliente antonio =new Cliente("an9666","Antonio","Nisco",100);
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
		
		// Test Antonio
		ArrayList<Prodotto> prodo=new ArrayList<Prodotto>();
		prodo.add(p3Nisco);
		prodo.add(p2Nisco);
		prodo.add(p1Nisco);
		double impSconNisco =Supermercato.calcolaImporto(prodo);
		Scontrino scontrNisco=new Scontrino("1111",antonio,prodo,impSconNisco);
		int puntiSconNisco =Supermercato.calcolaPunti(scontrNisco);
		
		System.out.println(scontrNisco);
		System.out.println("I punti dello scontrino di Nisco sono :"puntiSconNisco);
		// fine test Antonio
		
	}

}
