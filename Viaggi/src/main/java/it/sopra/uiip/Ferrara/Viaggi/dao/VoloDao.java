package it.sopra.uiip.Ferrara.Viaggi.dao;

import it.sopra.uiip.Ferrara.Viaggi.model.VoloModel;

public interface VoloDao {
	public VoloModel selectVoloById(int id);
	public boolean insertVolo(VoloModel volo);

}
