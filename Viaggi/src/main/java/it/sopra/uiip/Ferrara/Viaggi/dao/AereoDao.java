package it.sopra.uiip.Ferrara.Viaggi.dao;

import it.sopra.uiip.Ferrara.Viaggi.model.AereoModel;

public interface AereoDao {
	public AereoModel selectAereoByTipo(String tipoAereo);
	public boolean insertAereo(AereoModel aereo);
	public boolean UpdatenPassByTipo(int nPass, String tipoAereo);


}
