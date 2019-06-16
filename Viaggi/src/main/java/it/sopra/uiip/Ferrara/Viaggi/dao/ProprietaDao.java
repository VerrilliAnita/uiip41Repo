package it.sopra.uiip.Ferrara.Viaggi.dao;

import java.util.ArrayList;
import it.sopra.uiip.Ferrara.Viaggi.model.ProprietaModel;

public interface ProprietaDao {
	
	public int insertProprieta(ProprietaModel proprieta);
	public ArrayList<String> selectAereiByCompagnia(String compagnia);

}
