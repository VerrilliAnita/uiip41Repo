package it.sopra.uiip.morante.viaggi.dao;

import it.sopra.uiip.morante.viaggi.model.AeroportoModel;

public interface AeroportoDao {
	
	public int insertAeroporto(AeroportoModel aeroporto);
	public AeroportoModel selectAeroporto(int id);
	public int updateNumeroPiste(int id, int numeroPiste);

}
