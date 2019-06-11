package it.sopra.uiip;

public class Supermercato {
	
	public static int calcolaPunti(Scontrino scontrino) {
		int result = 0;
		for (Prodotto p : scontrino.getProdotti()) 
			result = result +p.getPunti();
		return result;
	}

}
