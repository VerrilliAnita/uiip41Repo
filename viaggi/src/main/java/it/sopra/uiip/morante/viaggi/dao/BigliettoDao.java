package it.sopra.uiip.morante.viaggi.dao;

import it.sopra.uiip.morante.viaggi.model.BigliettoModel;

public interface BigliettoDao {
	
	public int insertBiglietto(BigliettoModel biglietto);
	public BigliettoModel selectBiglietto(int idBiglietto);

}
