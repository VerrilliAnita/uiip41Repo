package it.sopra.uiip;
import java.util.ArrayList;

public class Supermercato {
		public static int calcolaPunti (Scontrino scontrino) {
			int tot=0;
			for (Prodotto p: scontrino.getListaProdotti()) {
				tot=tot+p.getPunti();
				
				
			}
			return tot;
			
		}
		
		
	//Codice fatto da Giuseppe
	public static double calcolaImporto(ArrayList<Prodotto> prodotti) {
		double importo = 0;
		
		for(Prodotto p : prodotti) {
			importo += p.getCosto();
		}
		
		return importo;
	}



}
