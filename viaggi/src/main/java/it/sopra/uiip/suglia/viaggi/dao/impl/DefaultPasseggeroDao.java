package it.sopra.uiip.suglia.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.suglia.ConnectionManager;
import it.sopra.uiip.suglia.viaggi.dao.PasseggeroDao;
import it.sopra.uiip.suglia.viaggi.model.Passeggero;
import it.sopra.uiip.suglia.viaggi.model.Volo;

public class DefaultPasseggeroDao implements PasseggeroDao {

	public int insertPasseggero(Passeggero passeggero) {
		Connection conn;
		String query = "INSERT IGNORE INTO passeggero values('"
				+ passeggero.getCodiceFiscale() + "', '"
				+ passeggero.getNome() + "', '"
				+ passeggero.getCognome() + "');";
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

	public Passeggero selectPasseggeroById(String cf) {
		Passeggero passeggero = null;
		Connection conn;
		String query = "SELECT * FROM passeggero WHERE codiceFiscale = " + "'" + cf + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				passeggero = new Passeggero(rs.getString("codiceFiscale"), 
								rs.getString("nome"), 
								rs.getString("cognome"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return passeggero;
	}

}
