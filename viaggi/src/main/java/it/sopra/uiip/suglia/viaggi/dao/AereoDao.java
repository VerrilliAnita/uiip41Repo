package it.sopra.uiip.suglia.viaggi.dao;
import it.sopra.uiip.suglia.viaggi.model.Aereo;

public interface AereoDao {

	// funzioni aereo
	public int insertAereo(Aereo aereo);
	public Aereo selectAereoByTipo(String tipo);
	public int updatePasseggeri(String tipoAereo, int nPass);

}
