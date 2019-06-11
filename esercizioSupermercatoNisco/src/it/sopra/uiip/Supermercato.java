package it.sopra.uiip;

import java.util.ArrayList;

public class Supermercato {
	
	//Codice fatto da Giuseppe
	public static double calcolaImporto(ArrayList<Prodotto> prodotti) {
		double importo = 0;
		
		for(Prodotto p : prodotti) {
			importo += p.getCosto();
		}
		
		return importo;
	}

}
