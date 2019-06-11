package it.sopra.uiip;

import java.util.ArrayList;

public class Supermercato {
	public static double calcolaImporto(ArrayList<Prodotto> prodotti) {
		double temp=0;
		for(Prodotto p: prodotti) {
			temp+=p.getCosto();
		}
		return temp;
	}
	
	public static int calcolaPunti(Scontrino scontrino) {
		int result = 0;
		for (Prodotto p : scontrino.getProdotti()) 
			result = result +p.getPunti();
		return result;
	}
	
	public static ArrayList<Cliente> clientePiuFedele(ArrayList<Cliente> clienti) {
		if(clienti.size()>0) {
			ArrayList<Cliente> c=new ArrayList<>();
			c.add(clienti.get(0));
			for(int i=1;i<clienti.size();i++) {
				if(clienti.get(i).getPunti()>c.get(0).getPunti()) {
					c=new ArrayList<>();
					c.add(clienti.get(i));
				}else if(clienti.get(i).getPunti()==c.get(0).getPunti()) {
					c.add(clienti.get(i));
				}
			}
				
			return c;
		}
		return null;
	}
}
