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
	
	public static Cliente clientePiuFedele(ArrayList<Cliente> listaClienti) {
		int puntiPiuAlti = listaClienti.get(0).getPunti();
		ArrayList<Cliente> clientiPiuFedeli = new ArrayList<Cliente>();
		Cliente clientePiuFedele = listaClienti.get(0);
		for(Cliente c: listaClienti) {
			if(c.getPunti()>clientePiuFedele.getPunti())
				puntiPiuAlti = c.getPunti();
		}
		
		for (Cliente c: listaClienti) {
			if(c.getPunti() == puntiPiuAlti)
				clientiPiuFedeli.add(c);
		}
		return clientePiuFedele;
		}	
		
	}
