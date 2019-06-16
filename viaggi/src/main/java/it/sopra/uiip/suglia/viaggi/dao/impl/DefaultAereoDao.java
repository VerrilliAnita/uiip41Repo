package it.sopra.uiip.suglia.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.suglia.ConnectionManager;
import it.sopra.uiip.suglia.viaggi.dao.AereoDao;
import it.sopra.uiip.suglia.viaggi.model.Aereo;

public class DefaultAereoDao implements AereoDao {

	public int insertAereo(Aereo aereo) {
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('"
				+ aereo.getTipoAereo() + "' , "
				+ aereo.getnPass() + ", "
				+ aereo.getQuantitaMerci() + ");";
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


	public Aereo selectAereoByTipo(String tipo) {
		Aereo aereo = null;
		Connection conn;
		String query = "SELECT * FROM aereo WHERE tipoAereo = " + "'"+tipo+"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				aereo = new Aereo(rs.getString("tipoAereo"), rs.getInt("nPass"), rs.getInt("quantitaMerci"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return aereo;
	}
	


	public int updatePasseggeri(String tipoAereo, int nPass) {
		Connection conn;
		String query = "UPDATE aereo "
				+ "SET nPass = " + nPass 
				+ " WHERE tipoAereo = " + "'" + tipoAereo + "';";
			
		int aggiornato=0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			aggiornato=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return aggiornato;
	}

}
