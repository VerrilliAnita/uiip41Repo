package it.sopra.uiip.ristaino.dao;

import it.sopra.uiip.ristaino.model.CompagniaModel;

public interface CompagniaDao {
	
	public int insertCompagnia(CompagniaModel compagniaModel);
	public CompagniaModel selectCompagniaById(String nome);


}
