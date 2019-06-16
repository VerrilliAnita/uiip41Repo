package it.sopra.uiip.Nisco.Viaggi.dao;


import it.sopra.uiip.Nisco.Viaggi.model.CompagniaAereaModel;

public interface CompagniaAereaDao {
	public int insertCompagniaAerea(CompagniaAereaModel compagnia);
	public CompagniaAereaModel selectCompagniaAereaByid(int id );
}
