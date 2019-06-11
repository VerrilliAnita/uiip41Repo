package it.sopra.uiip;

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
	}

}
