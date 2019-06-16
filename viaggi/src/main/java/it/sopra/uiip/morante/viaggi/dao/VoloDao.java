package it.sopra.uiip.morante.viaggi.dao;

import java.util.ArrayList;

import it.sopra.uiip.morante.viaggi.model.VoloModel;

public interface VoloDao {
	
	public int insertVolo(VoloModel volo);
	public ArrayList<VoloModel> seletcVolo(int id);

}
