package it.sopra.uiip.Ferrara.Viaggi.dao;

import it.sopra.uiip.Ferrara.Viaggi.model.PrenotazioneModel;

public interface PrenotazioneDao {
	
	public int insertPrenotazione(PrenotazioneModel prenotazione);
	public PrenotazioneModel selectPrenotazioneById(int id);

}
