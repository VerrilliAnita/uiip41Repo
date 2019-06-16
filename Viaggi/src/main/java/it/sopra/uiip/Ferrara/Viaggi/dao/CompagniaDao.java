package it.sopra.uiip.Ferrara.Viaggi.dao;

import it.sopra.uiip.Ferrara.Viaggi.model.CompagniaModel;

public interface CompagniaDao {
	
	public int insertCompagnia(CompagniaModel compagnia);
	public CompagniaModel selectCompagniaByName(String nomeCompagnia);

}
