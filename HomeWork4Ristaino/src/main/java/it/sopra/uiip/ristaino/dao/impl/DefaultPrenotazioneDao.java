package it.sopra.uiip.ristaino.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.ristaino.ConnectionManager;
import it.sopra.uiip.ristaino.dao.PasseggeroDao;
import it.sopra.uiip.ristaino.dao.PrenotazioneDao;
import it.sopra.uiip.ristaino.dao.VoloDao;
import it.sopra.uiip.ristaino.model.PrenotazioneModel;

public class DefaultPrenotazioneDao implements PrenotazioneDao {

	public int insertPrenotazione(PrenotazioneModel prenotazioneModel) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO prenotazione values(" + prenotazioneModel.getIdPrenotazione()
			+ ", '" + prenotazioneModel.getPasseggero().getCodiceFiscale() +"'" 
			+ ", " + prenotazioneModel.getVolo().getIdVolo()
			+ ", '" + prenotazioneModel.getVolo().getGiornoSett() +"'"
			+ ", " +prenotazioneModel.getPrezzo() +");";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			result = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public PrenotazioneModel selectPrenotazioneById(int idPrenotazione) {
		// TODO Auto-generated method stub
		PrenotazioneModel prenotazioneModel = null;
		Connection conn;
		String query = "SELECT * FROM prenotazione WHERE idPrenotazione = " +idPrenotazione;
		
		PasseggeroDao passeggeroDao = new DefaulPasseggeroDao();
		VoloDao voloDao = new DefaultVoloDao();
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				prenotazioneModel = new PrenotazioneModel(rs.getInt("idPrenotazione"), 
						passeggeroDao.selectPasseggeroByCF(rs.getString("idPasseggero")), 
						voloDao.selectVoloByIdAndGiorno(rs.getInt("idVolo"), rs.getString("giornoSett")),
						rs.getFloat("prezzo"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return prenotazioneModel;
	}

}
