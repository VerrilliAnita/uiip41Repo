package it.sopra.uiip.Minichiello.Viaggi.dao;

import it.sopra.uiip.Minichiello.Viaggi.model.*;

public interface AereoDao {
	public boolean insertAereo(AereoModel aereo);
	public AereoModel selectAereoByType(String type);
	public boolean updateNPostiByAereoModel(String type, int newNposti);
}
