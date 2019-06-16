package it.sopra.uiip.Giso.Viaggi.dao;

import it.sopra.uiip.Giso.Viaggi.model.CompagniaModel;

public interface CompagniaDao {
	
	public int insertCompagnia(CompagniaModel compagnia);
	public CompagniaModel selectCompagniaByName(String nomeCompagnia);

}
