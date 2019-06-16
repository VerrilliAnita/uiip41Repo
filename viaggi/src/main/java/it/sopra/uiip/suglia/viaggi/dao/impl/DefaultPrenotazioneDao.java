package it.sopra.uiip.suglia.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.suglia.ConnectionManager;
import it.sopra.uiip.suglia.viaggi.dao.PrenotazioneDao;
import it.sopra.uiip.suglia.viaggi.model.Prenotazione;
import it.sopra.uiip.suglia.viaggi.model.Volo;

public class DefaultPrenotazioneDao implements PrenotazioneDao {

	public int inserPrenotazione(Prenotazione prenotazione) {
		Connection conn;
		String query = "INSERT IGNORE INTO prenotazione values('"
				+ prenotazione.getCodicePrenotazione() + "' ,'"
				+ prenotazione.getCodiceFiscale() + "', "
				+ prenotazione.getIdVolo() + ");";
		int inserito=0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			inserito=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return inserito;

	}

	public Prenotazione selectPrenotazione(String codicePrenotazione) {
		Prenotazione prenotazione = null;
		Connection conn;
		String query = "SELECT * FROM prenotazione WHERE codicePrenotazione = " +"'"+codicePrenotazione+"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				prenotazione = new Prenotazione(rs.getString("codicePrenotazione"), 
										rs.getString("codiceFiscale"),
										rs.getInt("idVolo"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return prenotazione;
		
	}

}
