package it.sopra.uiip.Minichiello.HomeWork4.dao;

import it.sopra.uiip.Minichiello.HomeWork4.model.CompagniaModel;

public interface CompagniaDao {
	public boolean insertCompagnia(CompagniaModel compagnia);
	public CompagniaModel searchCompagniaById(int id);
}
