package it.sopra.uiip.suglia.viaggi.dao;

import it.sopra.uiip.suglia.viaggi.model.Passeggero;

public interface PasseggeroDao {
	
	public int insertPasseggero(Passeggero passeggero);
	public Passeggero selectPasseggeroById(String cf);

}
