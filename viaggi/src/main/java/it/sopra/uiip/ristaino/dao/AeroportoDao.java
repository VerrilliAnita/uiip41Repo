package it.sopra.uiip.ristaino.dao;

import it.sopra.uiip.ristaino.model.AeroportoModel;

public interface AeroportoDao {
	
	public int insertAeroporto(AeroportoModel aeroportoModel);
	public AeroportoModel selectAeroportoById(int id);
	public int updateNpiste(AeroportoModel aeroportoModel, int nPiste);

}
