package it.sopra.uiip.morante.viaggi.dao;

import it.sopra.uiip.morante.viaggi.model.CompagniaModel;

public interface CompagniaDao {
	
	public int insertCompagnia(CompagniaModel compagnia);
	public CompagniaModel selectCompagnia(int idCompagnia);

}
