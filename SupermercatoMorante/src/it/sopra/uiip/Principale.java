package it.sopra.uiip;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		
		ArrayList<Prodotto> listaProdottiFerrara = new ArrayList<Prodotto>();
		ArrayList<Prodotto>listaProdottiSuglia=new ArrayList<Prodotto>();
		ArrayList<Cliente> listaClienti=new ArrayList<Cliente>();
		Cliente clientePiuFedele=null;

		ArrayList<Prodotto> listaProdottiMorich = new ArrayList<Prodotto>();
		ArrayList<Cliente> listaClientiPiuFedeli = new ArrayList<Cliente>();
		int puntiSuglia=0;
		
		Cliente Suglia = new Cliente("a01", "Pompilio", "Suglia", 134);		
		Cliente morich = new Cliente("a03", "Morante", "Emanuele", 134);
		Cliente Ferrara = new Cliente("b01", "Danilo", "Ferrara", 101);
		listaClienti.add(Suglia);
		listaClienti.add(morich);
		listaClienti.add(Ferrara);
			
		Prodotto p1 = new Prodotto("A01", "mele", 2.3, 20);
		Prodotto p2 = new Prodotto("A02", "pane", 1.8, 10);
		Prodotto p3 = new Prodotto("A02", "biscotti", 2, 15);
		Prodotto p4 = new Prodotto("A03", "ciliege", 3.0, 15);
		Prodotto p5 = new Prodotto("A04", "latte", 1.2, 5);
		Prodotto p6 = new Prodotto("A05", "pesce", 2.70, 10);
		Prodotto p7 = new Prodotto("MMM", "tonno", 2.6, 34);
		Prodotto p8 = new Prodotto("OOO", "senape", 2.4, 18);
		Prodotto p9 = new Prodotto("RRR", "cereali", 4.5, 40);
		
		//Test metodi Supermercato
		listaProdottiFerrara.add(p4);
		listaProdottiFerrara.add(p5);
		listaProdottiFerrara.add(p6);
		double contoFerrara = Supermercato.calcolaImporto(listaProdottiFerrara);
		Scontrino s1 = new Scontrino("S01",Ferrara,contoFerrara);
		s1.addProdotto(p4);
		s1.addProdotto(p5);
		s1.addProdotto(p6);
		System.out.println("\n------------Scontrino Ferrara-----------");
		System.out.println("I punti per lo scontrino s1 sono: "+ Supermercato.calcolaPunti(s1));
		System.out.println("L'importo totale per i prodotti Ferrara è: "+ Supermercato.calcolaImporto(listaProdottiFerrara)+ "Euro");
		
		listaProdottiSuglia.add(p5);
		listaProdottiSuglia.add(p2);
		listaProdottiSuglia.add(p1);
		double contoSuglia = Supermercato.calcolaImporto(listaProdottiSuglia);
		Scontrino scontrinoSuglia = new Scontrino("s1", Suglia, contoSuglia);
		scontrinoSuglia.setProdotti(listaProdottiSuglia);
		puntiSuglia = Supermercato.calcolaPunti(scontrinoSuglia);
		System.out.println("\n------------Scontrino Suglia-----------");
		System.out.println("conto scontrino Suglia = " + contoSuglia + "Euro");
		System.out.println("Punti scontrino Suglia = " + puntiSuglia+"\n");
		
		listaProdottiMorich.add(p9);
		listaProdottiMorich.add(p4);
		listaProdottiMorich.add(p5);
		listaProdottiMorich.add(p1);
		double contoMorich = Supermercato.calcolaImporto(listaProdottiMorich);
		Scontrino morichScontrino = new Scontrino("ICH", morich, contoMorich);
		System.out.println("\n------------Scontrino Morante-----------");
		morichScontrino.setProdotti(listaProdottiMorich);
		System.out.println("L'importo è " + Supermercato.calcolaImporto(morichScontrino.getProdotti())+"Euro");
		System.out.println("I punti sono " + Supermercato.calcolaPunti(morichScontrino)+"\n");
		System.out.println("I punti sono " + Supermercato.calcolaPunti(morichScontrino)+"\n");	
		
		System.out.println("TEST PIU' FEDELI");
		listaClientiPiuFedeli = Supermercato.clientePiuFedele(listaClienti); 
		for(Cliente c : listaClientiPiuFedeli)
			System.out.println(c.toString());
		
	}

}
