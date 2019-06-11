package it.sopra.uiip;

import java.util.ArrayList;

public class Supermercato {
	
	public static double calcolaImporto(ArrayList<Prodotto> prodotti) {
		double conto = 0;
		for(Prodotto p : prodotti)
			conto = conto+p.getCosto();
		return conto;
	}

}
