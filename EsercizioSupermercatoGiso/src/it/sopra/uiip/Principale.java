package it.sopra.uiip;

public class Principale {

	public static void main(String[] args) {
		Cliente c1=new Cliente("c01", "tommaso", "minichiello", 0);
		Prodotto p1=new Prodotto("01", "pane", 2.0, 10);
		Prodotto p2=new Prodotto("02", "farina", 1.0, 10);
		Prodotto p3=new Prodotto("03", "tonno", 3.0, 15);
		Prodotto p4=new Prodotto("04", "latte", 1.0, 30);
		
		Cliente c1 = new Cliente("cartaGiso", "Gianluca", "Giso", 150);
		
		Prodotto p1 = new Prodotto("id1","zucchero",0.99,1);
		Prodotto p2 = new Prodotto("id2","pasta",1.99,2);
		Prodotto p3 = new Prodotto("id3","tovaglioli",1.59,1);
		
		
	}

}
