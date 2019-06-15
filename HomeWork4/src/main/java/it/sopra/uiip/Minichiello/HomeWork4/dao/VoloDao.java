package it.sopra.uiip.Minichiello.HomeWork4.dao;

import java.util.ArrayList;

import it.sopra.uiip.Minichiello.HomeWork4.model.VoloModel;


public interface VoloDao {
	public boolean insertVolo(VoloModel volo);
	public ArrayList<VoloModel> selectVoloById(int idVolo);
}
