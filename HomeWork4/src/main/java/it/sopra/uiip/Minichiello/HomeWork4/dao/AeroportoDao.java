package it.sopra.uiip.Minichiello.HomeWork4.dao;

import it.sopra.uiip.Minichiello.HomeWork4.model.AeroportoModel;

public interface AeroportoDao {
	public boolean insertAeroporto(AeroportoModel aeroporto);
	public AeroportoModel selectAeroportoById(int idAeroporto);
	public boolean updateNPisteAeroporto(int idAeroporto,int newNPiste);
}
