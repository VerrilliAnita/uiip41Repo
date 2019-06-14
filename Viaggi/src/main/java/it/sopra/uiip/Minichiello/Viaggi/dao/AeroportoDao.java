package it.sopra.uiip.Minichiello.Viaggi.dao;

import it.sopra.uiip.Minichiello.Viaggi.model.AeroportoModel;

public interface AeroportoDao {
	public boolean insertAeroporto(AeroportoModel aeroporto);
	public AeroportoModel selectAeroportoById(int idAeroporto);
	public boolean updateNPisteAeroporto(int idAeroporto,int newNPiste);
}
