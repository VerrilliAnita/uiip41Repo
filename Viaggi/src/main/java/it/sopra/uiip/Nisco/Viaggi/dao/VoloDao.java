package it.sopra.uiip.Nisco.Viaggi.dao;


import java.util.ArrayList;

import it.sopra.uiip.Nisco.Viaggi.model.VoloModel;

public interface VoloDao {
	
		public int insertVolo(VoloModel volo);
		public ArrayList<VoloModel> selectVoloByIdVolo(int idVolo );
		

}
