package it.sopra.uiip.Nisco.Viaggi.dao;


import it.sopra.uiip.Nisco.Viaggi.model.PrenotazioneModel;

public interface PrenotazioneDao {	
	public int insertPrenotazione(PrenotazioneModel prenotazione);
	public PrenotazioneModel selectPrenotazioneById(int id );

}
