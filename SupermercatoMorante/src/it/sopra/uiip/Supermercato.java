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
	


	public static ArrayList<Cliente> clientePiuFedele(ArrayList<Cliente> clienti) {
		
		ArrayList<Cliente> clientiPiuFedeli = new ArrayList<Cliente>();
		int puntiMaggiori = clienti.get(0).getPunti();
		
		for(Cliente c: clienti)
			if(c.getPunti() > puntiMaggiori)
				puntiMaggiori = c.getPunti();
		
		for(Cliente c2: clienti)
			if(c2.getPunti() == puntiMaggiori)
				clientiPiuFedeli.add(c2);
				
		return clientiPiuFedeli;
	}
	


}
