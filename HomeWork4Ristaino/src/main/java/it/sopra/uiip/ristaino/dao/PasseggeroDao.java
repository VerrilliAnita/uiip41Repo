package it.sopra.uiip.ristaino.dao;

import it.sopra.uiip.ristaino.model.PasseggeroModel;

public interface PasseggeroDao {
	
	public int insertPasseggero(PasseggeroModel passeggeroModel);
	public PasseggeroModel selectPasseggeroByCF(String codiceFiscale);

}
