package it.sopra.uiip;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		Cliente c1=new Cliente("c01", "tommaso", "minichiello", 0);
		Cliente c2 = new Cliente("cartaGiso", "Gianluca", "Giso", 150);
		
		ArrayList<Cliente> clienti=new ArrayList<>();
		clienti.add(c1);
		clienti.add(c2);
		
		Prodotto p1=new Prodotto("01", "pane", 2.0, 10);
		Prodotto p2=new Prodotto("02", "farina", 1.0, 10);
		Prodotto p3=new Prodotto("03", "tonno", 3.0, 15);
		Prodotto p4=new Prodotto("04", "latte", 1.0, 30);
		Prodotto p5 = new Prodotto("id1","zucchero",0.99,1);
		Prodotto p6 = new Prodotto("id2","pasta",1.99,2);
		Prodotto p7 = new Prodotto("id3","tovaglioli",1.59,1);

		ArrayList<Prodotto>listaProdottiScontrino2 = new ArrayList<Prodotto>();
		ArrayList<Prodotto> listaProdottiScontrino1=new ArrayList<>();
		
		listaProdottiScontrino2.add(p1);
		listaProdottiScontrino2.add(p3);
		listaProdottiScontrino2.add(p4);
		listaProdottiScontrino2.add(p5);
		listaProdottiScontrino2.add(p2);
		
		listaProdottiScontrino1.add(p1);
		listaProdottiScontrino1.add(p3);
		listaProdottiScontrino1.add(p5);
		listaProdottiScontrino1.add(p7);

		
		Scontrino sc2 = new Scontrino("sc2",c2,listaProdottiScontrino2,Supermercato.calcolaImporto(listaProdottiScontrino2));
		System.out.println("SCONTRINO");
		System.out.println(sc2.toString());
		System.out.println("TOTALE PUNTI");
		System.out.println(Supermercato.calcolaPunti(sc2));
		
		Scontrino sc1=new Scontrino("sc1", c1, listaProdottiScontrino1, Supermercato.calcolaImporto(listaProdottiScontrino1));
		System.out.println("SCONTRINO");
		System.out.println(sc1.toString());
		System.out.println("TOTALE PUNTI");
		System.out.println(Supermercato.calcolaPunti(sc1));
		
		System.out.println("CLIENTE PIU FEDELE");
		System.out.println(Supermercato.clientePiuFedele(clienti));
	}

}
