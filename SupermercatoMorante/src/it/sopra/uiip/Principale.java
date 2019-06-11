package it.sopra.uiip;

public class Principale {

	public static void main(String[] args) {
		
		Cliente Suglia = new Cliente("a01", "Pompilio", "Suglia", 122);
		
		
		Cliente morich = new Cliente("a03", "Morante", "Emanuele", 134);
		
		Prodotto p1 = new Prodotto("A01", "mele", 2.3, 20);
		Prodotto p2 = new Prodotto("A02", "pane", 1.8, 10);
		Prodotto p3 = new Prodotto("A02", "biscotti", 2, 15);

		
		Prodotto p7 = new Prodotto("MMM", "tonno", 2.6, 34);
		Prodotto p8 = new Prodotto("OOO", "senape", 2.4, 18);
		Prodotto p9 = new Prodotto("RRR", "cereali", 4.5, 40);

	

	}

}
