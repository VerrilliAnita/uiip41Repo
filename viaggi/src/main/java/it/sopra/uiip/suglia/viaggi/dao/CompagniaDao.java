package it.sopra.uiip.suglia.viaggi.dao;

import it.sopra.uiip.suglia.viaggi.model.Compagnia;

public interface CompagniaDao {
	
	public int insertCompagnia(Compagnia compagnia);
	public Compagnia selectCompagniaById(int id);

}
