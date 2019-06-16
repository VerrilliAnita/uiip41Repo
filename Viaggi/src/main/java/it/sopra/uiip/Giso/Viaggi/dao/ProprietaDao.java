package it.sopra.uiip.Giso.Viaggi.dao;

import java.util.ArrayList;


import it.sopra.uiip.Giso.Viaggi.model.ProprietaModel;

public interface ProprietaDao {
	
	public int insertProprieta(ProprietaModel proprieta);
	public ArrayList<String> selectAereiByCompagnia(String compagnia);

}
