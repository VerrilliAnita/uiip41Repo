package it.sopra.uiip.morante.viaggi.dao;

import it.sopra.uiip.morante.viaggi.model.AereoModel;

public interface AereoDao {
	
	public int insertAereo(AereoModel aereo);
	public AereoModel selectAereo(String tipo);
	public int updatePasseggieri(String tipo, int numeroPosti);

}
