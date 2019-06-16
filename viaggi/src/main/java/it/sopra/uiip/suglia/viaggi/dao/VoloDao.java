package it.sopra.uiip.suglia.viaggi.dao;
import it.sopra.uiip.suglia.viaggi.model.Volo;

public interface VoloDao {

	public int insertVolo(Volo volo);
	public Volo selectVoloById(int id);

}
