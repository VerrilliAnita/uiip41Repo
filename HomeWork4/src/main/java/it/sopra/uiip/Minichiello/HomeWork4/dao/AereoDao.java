package it.sopra.uiip.Minichiello.HomeWork4.dao;

import it.sopra.uiip.Minichiello.HomeWork4.model.AereoModel;

public interface AereoDao {
	public boolean insertAereo(AereoModel aereo);
	public AereoModel selectAereoByType(String type);
	public boolean updateNPostiByAereoModel(String type, int newNposti);
}
