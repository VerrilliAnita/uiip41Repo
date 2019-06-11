package it.sopra.uiip;

public class Supermercato {
		public static int calcolaPunti (Scontrino scontrino) {
			int tot=0;
			for (Prodotto p: scontrino.getListaProdotti()) {
				tot=tot+p.getPunti();
				
				
			}
			return tot;
			
		}
		
		

}
