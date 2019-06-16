package it.sopra.uiip.Giso.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Giso.Viaggi.ConnectionManager;
import it.sopra.uiip.Giso.Viaggi.dao.PrenotazioneDao;
import it.sopra.uiip.Giso.Viaggi.model.PrenotazioneModel;
import it.sopra.uiip.Giso.Viaggi.model.VoloModel;

public class DefaultPrenotazioneDao implements PrenotazioneDao{

	public int insertPrenotazione(PrenotazioneModel prenotazione) {
		
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO prenotazione values(" + prenotazione.getId()+ ",'"  +
						prenotazione.getCodiceFiscale()+"','" +prenotazione.getNome()+"','"
						+prenotazione.getCognome()+"',"+prenotazione.getVolo()+");";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			result = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public PrenotazioneModel selectPrenotazioneById(int id) {

		PrenotazioneModel result = null;
		Connection conn;
		String query = "SELECT * FROM prenotazione WHERE id ="+id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next()) {
				result = new PrenotazioneModel(rs.getInt("id"), rs.getString("codiceFiscale"), rs.getString("nome"),rs.getString("cognome"),rs.getInt("volo"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return result;
		
	}

}
