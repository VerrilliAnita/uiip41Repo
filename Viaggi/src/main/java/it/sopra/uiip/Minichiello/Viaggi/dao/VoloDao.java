package it.sopra.uiip.Minichiello.Viaggi.dao;

import java.util.ArrayList;

import it.sopra.uiip.Minichiello.Viaggi.model.VoloModel;

public interface VoloDao {
	public boolean insertVolo(VoloModel volo);
	public ArrayList<VoloModel> selectVoloById(int idVolo);
}
