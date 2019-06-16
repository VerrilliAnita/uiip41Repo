package it.sopra.uiip.Giso.Viaggi.dao;

import java.util.ArrayList;

import it.sopra.uiip.Giso.Viaggi.model.VoloModel;

public interface VoloDao {
	
	public int insertVolo(VoloModel volo);
	public ArrayList<VoloModel> selectVoloById(int idVolo);

}
