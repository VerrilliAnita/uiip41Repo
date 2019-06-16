package it.sopra.uiip.ristaino.dao;

import it.sopra.uiip.ristaino.model.AereoModel;

public interface AereoDao {
	
	public int insertAereo(AereoModel aereoModel);
	public AereoModel selectAereoById(String tipoAereo, String nomeCompagnia);
	public int updateNpass(String tipoAereo, int nPass);

}
