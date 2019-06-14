package it.sopra.uiip.Giso.Viaggi.dao;

import it.sopra.uiip.Giso.Viaggi.model.AereoModel;

public interface AereoDao {
	
	public int insertAereo(AereoModel aereo);
	public AereoModel selectAereoByTipo(String tipoAereo);
	public int updateAereo(String tipoAereo, int nPass);

}
