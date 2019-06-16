package it.sopra.uiip.Giso.Viaggi.dao;

import it.sopra.uiip.Giso.Viaggi.model.AeroportoModel;

public interface AeroportoDao {
	
	public int insertAeroporto(AeroportoModel aeroporto);
	public AeroportoModel selectAereoportoById(int id);
	public int updateAeroporto(int id, int npiste);

}
