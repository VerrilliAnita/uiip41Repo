package it.sopra.uiip;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		Cliente c1=new Cliente("c01", "tommaso", "minichiello", 0);
		Prodotto p1=new Prodotto("01", "pane", 2.0, 10);
		Prodotto p2=new Prodotto("02", "farina", 1.0, 10);
		Prodotto p3=new Prodotto("03", "tonno", 3.0, 15);
		Prodotto p4=new Prodotto("04", "latte", 1.0, 30);
		
		Cliente c2 = new Cliente("cartaGiso", "Gianluca", "Giso", 150);
		
		Prodotto p5 = new Prodotto("id1","zucchero",0.99,1);
		Prodotto p6 = new Prodotto("id2","pasta",1.99,2);
		Prodotto p7 = new Prodotto("id3","tovaglioli",1.59,1);
		
		ArrayList<Prodotto>listaProdotti = new ArrayList<Prodotto>();
		listaProdotti.add(p1);
		listaProdotti.add(p3);
		listaProdotti.add(p4);
		listaProdotti.add(p5);
		listaProdotti.add(p2);
		Scontrino s1 = new Scontrino("sc1",c2,listaProdotti,Supermercato.calcolaImporto(listaProdotti));
		System.out.println("SCONTRINO");
		System.out.println(s1.toString());
		System.out.println("TOTALE PUNTI");
		System.out.println(Supermercato.calcolaPunti(s1));
		
		
	}

}
