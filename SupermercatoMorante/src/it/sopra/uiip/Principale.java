package it.sopra.uiip;

public class Principale {

	public static void main(String[] args) {
		
		Cliente Suglia = new Cliente("a01", "Pompilio", "Suglia", 122);
		Cliente Ferrara = new Cliente("b01", "Danilo", "Ferrara", 101);
		
		Prodotto p1 = new Prodotto("A01", "mele", 2.3, 20);
		Prodotto p2 = new Prodotto("A02", "pane", 1.8, 10);
		Prodotto p3 = new Prodotto("A02", "biscotti", 2, 15);
		Prodotto p4 = new Prodotto("A03", "ciliege", 3.0, 15);
		Prodotto p5 = new Prodotto("A04", "latte", 1.2, 5);
		Prodotto p6 = new Prodotto("A05", "pesce", 2.70, 10);

	}

}
