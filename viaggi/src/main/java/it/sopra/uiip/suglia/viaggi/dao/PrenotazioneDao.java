package it.sopra.uiip.suglia.viaggi.dao;

import it.sopra.uiip.suglia.viaggi.model.Prenotazione;

public interface PrenotazioneDao {
	
	public int inserPrenotazione(Prenotazione prenotazione);
	public Prenotazione selectPrenotazione(String codicePrenotazione);

}
