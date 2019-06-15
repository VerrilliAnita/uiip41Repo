package it.sopra.uiip.Minichiello.HomeWork4.dao;

import it.sopra.uiip.Minichiello.HomeWork4.model.PrenotazioneModel;

public interface PrenotazioneDao {
	public boolean insertPrenotazione(PrenotazioneModel prenotazione);
	public PrenotazioneModel searchPrenotazioneById(int id);
}
