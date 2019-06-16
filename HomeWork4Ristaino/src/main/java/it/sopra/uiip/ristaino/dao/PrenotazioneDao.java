package it.sopra.uiip.ristaino.dao;

import it.sopra.uiip.ristaino.model.PrenotazioneModel;

public interface PrenotazioneDao {
	
	public int insertPrenotazione(PrenotazioneModel prenotazioneModel);
	public PrenotazioneModel selectPrenotazioneById(int idPrenotazione);

}
