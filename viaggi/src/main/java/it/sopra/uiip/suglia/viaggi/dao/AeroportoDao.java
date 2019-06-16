package it.sopra.uiip.suglia.viaggi.dao;

import it.sopra.uiip.suglia.viaggi.model.Aeroporto;

public interface AeroportoDao {
	
	public int insertAeroporto(Aeroporto aeroporto);
	public Aeroporto selectAeroportoById(int id);
	public int updateNumeroPiste(int id, int npiste);

}
