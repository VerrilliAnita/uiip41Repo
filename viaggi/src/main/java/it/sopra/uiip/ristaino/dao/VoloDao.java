package it.sopra.uiip.ristaino.dao;

import java.util.ArrayList;

import it.sopra.uiip.ristaino.model.VoloModel;

public interface VoloDao {
	
	public int insertVolo(VoloModel voloModel);
	public ArrayList<VoloModel> selectVoloById(int id);

}
