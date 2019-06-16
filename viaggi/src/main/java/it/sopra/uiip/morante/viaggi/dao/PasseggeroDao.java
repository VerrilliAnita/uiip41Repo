package it.sopra.uiip.morante.viaggi.dao;

import it.sopra.uiip.morante.viaggi.model.PasseggeroModel;

public interface PasseggeroDao {
	
	public int insertPasseggero(PasseggeroModel passeggero);
	public PasseggeroModel selectPasseggero(String codiceFiscale);

}
