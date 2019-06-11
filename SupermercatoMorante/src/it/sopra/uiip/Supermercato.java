package it.sopra.uiip;
import java.util.ArrayList;

public class Supermercato {
	
	public static int calcolaPunti(Scontrino scontrino) {
		int punti=0;
		for(Prodotto p: scontrino.getProdotti()) {
			punti=punti+p.getPunti();
		}
		return punti;

	}

	public static double calcolaImporto(ArrayList<Prodotto> prodotti) {
		double conto = 0;
		for(Prodotto p : prodotti)
			conto = conto+p.getCosto();
		return conto;
	}

}
