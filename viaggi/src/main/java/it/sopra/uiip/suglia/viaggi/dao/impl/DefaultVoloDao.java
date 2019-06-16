package it.sopra.uiip.suglia.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.suglia.ConnectionManager;
import it.sopra.uiip.suglia.viaggi.dao.VoloDao;
import it.sopra.uiip.suglia.viaggi.model.Volo;

public class DefaultVoloDao implements VoloDao {

	public int insertVolo(Volo volo) {
		Connection conn;
		String query = "INSERT IGNORE INTO volo values("
				+ volo.getIdVolo() + " , '"
				+ volo.getGiornoSettimana() + "', "
				+ volo.getAeroportoPart() + ", "
				+ volo.getAeroportoArr() + ", "
				+ volo.getCompagnia() + ", "
				+ volo.getOraPartenza() + ", "
				+ volo.getOraArrivo() + ");";
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
	
	public Volo selectVoloById(int id) {
		Volo volo = null;
		Connection conn;
		String query = "SELECT * FROM volo WHERE idVolo = " + id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				volo = new Volo(rs.getInt("idVolo"), 
								rs.getString("giornoSettimana"), 
								rs.getInt("aeroportoPart"), 
								rs.getInt("aeroportoArr"),
								rs.getInt("compagnia"),
								rs.getInt("oraPartenza"),
								rs.getInt("oraArrivo"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return volo;
	}

}
