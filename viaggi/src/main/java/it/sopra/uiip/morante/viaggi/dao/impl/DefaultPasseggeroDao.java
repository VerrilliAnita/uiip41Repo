package it.sopra.uiip.morante.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.morante.viaggi.ConnectionManager;
import it.sopra.uiip.morante.viaggi.dao.PasseggeroDao;
import it.sopra.uiip.morante.viaggi.model.PasseggeroModel;

public class DefaultPasseggeroDao implements PasseggeroDao {

	public int insertPasseggero(PasseggeroModel passeggero) {
		
		int ritorno = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO passeggero values('" + passeggero.getCodiceFiscale() + "', '" + passeggero.getNome() + "', '" + passeggero.getCognome() +"');";

		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ritorno = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return ritorno;
	}

	public PasseggeroModel selectPasseggero(String codiceFiscale) {
		
		PasseggeroModel result = null;
		Connection conn;
		String query = "select * from passeggero where codiceFiscale='" + codiceFiscale +"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				result = new PasseggeroModel(rs.getString("codiceFiscale"), rs.getString("nome"), rs.getString("cognome"));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
