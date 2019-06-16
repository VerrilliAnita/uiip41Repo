package it.sopra.uiip.Ferrara.Viaggi.dao;

import java.util.ArrayList;
import it.sopra.uiip.Ferrara.Viaggi.model.VoloModel;

public interface VoloDao {
	
	public int insertVolo(VoloModel volo);
	public ArrayList<VoloModel> selectVoloById(int idVolo);

}
