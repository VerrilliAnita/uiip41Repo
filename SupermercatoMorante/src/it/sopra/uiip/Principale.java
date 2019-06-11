package it.sopra.uiip;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		
		ArrayList<Prodotto> listaProdottiFerrara = new ArrayList<Prodotto>();
		
		Cliente Suglia = new Cliente("a01", "Pompilio", "Suglia", 122);		
		Cliente morich = new Cliente("a03", "Morante", "Emanuele", 134);
		Cliente Ferrara = new Cliente("b01", "Danilo", "Ferrara", 101);
		
		Prodotto p1 = new Prodotto("A01", "mele", 2.3, 20);
		Prodotto p2 = new Prodotto("A02", "pane", 1.8, 10);
		Prodotto p3 = new Prodotto("A02", "biscotti", 2, 15);
		Prodotto p4 = new Prodotto("A03", "ciliege", 3.0, 15);
		Prodotto p5 = new Prodotto("A04", "latte", 1.2, 5);
		Prodotto p6 = new Prodotto("A05", "pesce", 2.70, 10);
		Prodotto p7 = new Prodotto("MMM", "tonno", 2.6, 34);
		Prodotto p8 = new Prodotto("OOO", "senape", 2.4, 18);
		Prodotto p9 = new Prodotto("RRR", "cereali", 4.5, 40);
		
		
		listaProdottiFerrara.add(p4);
		listaProdottiFerrara.add(p5);
		listaProdottiFerrara.add(p6);
		
		double contoFerrara = Supermercato.calcolaImporto(listaProdottiFerrara);
		
		Scontrino s1 = new Scontrino("S01",Ferrara,contoFerrara);
		
		s1.addProdotto(p4);
		s1.addProdotto(p5);
		s1.addProdotto(p6);
		
		//Calcolo punti scontrino Ferrara
		System.out.println("I punti per lo scontrino s1 sono: "+ Supermercato.calcolaPunti(s1));
		//Calcolo importo prodotti Ferrara
		System.out.println("L'importo totale per i prodotti Ferrara è: "+ Supermercato.calcolaImporto(listaProdottiFerrara));
		
		
		
		

	}

}
