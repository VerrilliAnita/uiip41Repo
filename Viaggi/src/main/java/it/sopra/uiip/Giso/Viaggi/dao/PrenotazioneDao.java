package it.sopra.uiip.Giso.Viaggi.dao;

import it.sopra.uiip.Giso.Viaggi.model.PrenotazioneModel;

public interface PrenotazioneDao {
	
	public int insertPrenotazione(PrenotazioneModel prenotazione);
	public PrenotazioneModel selectPrenotazioneById(int id);

}
