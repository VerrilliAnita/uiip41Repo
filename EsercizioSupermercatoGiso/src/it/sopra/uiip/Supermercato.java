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
	
	public static Cliente clientePiuFedele(ArrayList<Cliente> clienti) {
		if(clienti.size()>0) {
			Cliente c=clienti.get(0);
			for(Cliente cl:clienti) 
				if(cl.getPunti()>c.getPunti()) 
					c=cl;
				
			return c;
		}
		return null;
	}
	
}
