package it.sopra.uiip;

public class Principale {

	public static void main(String[] args) {
		
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
		
	}

}
