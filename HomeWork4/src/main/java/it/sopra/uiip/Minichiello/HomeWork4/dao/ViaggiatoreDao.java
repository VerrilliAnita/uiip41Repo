package it.sopra.uiip.Minichiello.HomeWork4.dao;

import it.sopra.uiip.Minichiello.HomeWork4.model.ViaggiatoreModel;

public interface ViaggiatoreDao {
	public boolean insertViaggiatore(ViaggiatoreModel viaggiatore);
	public ViaggiatoreModel searchViaggiatoreById(String cf);
}
