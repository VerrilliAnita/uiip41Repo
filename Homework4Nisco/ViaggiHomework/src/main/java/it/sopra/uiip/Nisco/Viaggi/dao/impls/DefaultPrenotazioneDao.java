package it.sopra.uiip.Nisco.Viaggi.dao.impls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Nisco.Viaggi.ConnectionManager;
import it.sopra.uiip.Nisco.Viaggi.dao.AereoDao;
import it.sopra.uiip.Nisco.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Nisco.Viaggi.dao.CompagniaAereaDao;
import it.sopra.uiip.Nisco.Viaggi.dao.PersonaDao;
import it.sopra.uiip.Nisco.Viaggi.dao.PrenotazioneDao;
import it.sopra.uiip.Nisco.Viaggi.dao.VoloDao;
import it.sopra.uiip.Nisco.Viaggi.model.PrenotazioneModel;
import it.sopra.uiip.Nisco.Viaggi.model.VoloModel;

public class DefaultPrenotazioneDao implements PrenotazioneDao {

	public int insertPrenotazione(PrenotazioneModel prenotazione) {
		Connection conn;
		String query = "INSERT IGNORE INTO prenotazione values("+prenotazione.getIdPrenotazione()+",'"+prenotazione.getPasseggero().getCodiceFiscale()+"',"+prenotazione.getVolo().getIdVolo()+");";
		int esito =0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			esito =st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return esito;
	}

	public PrenotazioneModel selectPrenotazioneById(int id) {
		Connection conn;
		PrenotazioneModel prenotazione=null;
		PersonaDao gestorepersona=new DefaultPersonaDao();
		VoloDao gestorevolo= new DefaultVoloDao();
		String query= "select * from prenotazione where idPrenotazione= "+id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs =st.executeQuery(query);
			if(rs.next()) {
				prenotazione = new PrenotazioneModel(
									rs.getInt("idPrenotazione"),
									gestorepersona.selectPersonaByCodiceFiscale(rs.getString("passeggero")),
									gestorevolo.selectVoloByIdVolo(rs.getInt("volo")).get(0));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return prenotazione;
	}

}
