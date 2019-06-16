package it.sopra.uiip.Nisco.Viaggi.dao;


import java.util.ArrayList;

import it.sopra.uiip.Nisco.Viaggi.model.PersonaModel;


public interface PersonaDao {
	public int insertPersona(PersonaModel persona);
	public PersonaModel selectPersonaByCodiceFiscale(String codiceFiscale);
}
