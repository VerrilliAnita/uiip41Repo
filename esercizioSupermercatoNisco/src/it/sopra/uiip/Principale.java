package it.sopra.uiip;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente =new Cliente ("FD657DG", "Oksana","Gonchar", 300);
		Prodotto prodotto =new Prodotto ("D5674", "pane", 3 , 13);
		Prodotto prodotto1 = new Prodotto ("v5647", "latte", 2.3, 34);
		System.out.println(cliente);
		System.out.println(prodotto);
		System.out.println(prodotto1);
		
		

	}

}
