package it.sopra.uiip.Ferrara.Viaggi.dao;

import it.sopra.uiip.Ferrara.Viaggi.model.AeroportoModel;

public interface AeroportoDao {
	public AeroportoModel selectAeroportoById(int id);
	public boolean insertAeroporto(AeroportoModel aeroporto);
	public boolean UpdatenPisteAeroportoById(int nPiste, int id);

}
