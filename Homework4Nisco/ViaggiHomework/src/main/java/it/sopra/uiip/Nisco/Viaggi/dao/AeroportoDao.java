package it.sopra.uiip.Nisco.Viaggi.dao;
import it.sopra.uiip.Nisco.Viaggi.model.AeroportoModel;

public interface AeroportoDao {
			public int insertAeroporto(AeroportoModel aeroporto);
			public AeroportoModel selectAeroportoById(int id);
			public int updateNpisteById(int id,int npiste);
			
}
