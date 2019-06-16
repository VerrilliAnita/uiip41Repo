package it.sopra.uiip.suglia.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.suglia.ConnectionManager;
import it.sopra.uiip.suglia.viaggi.dao.AeroportoDao;
import it.sopra.uiip.suglia.viaggi.model.Aereo;
import it.sopra.uiip.suglia.viaggi.model.Aeroporto;

public class DefaultAeroportoDao implements AeroportoDao {

	public int insertAeroporto(Aeroporto aeroporto) {
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values("
				+ aeroporto.getId() + " , '"
				+ aeroporto.getCitta() + "','"
				+ aeroporto.getNazione() + "', "
				+ aeroporto.getNpiste() + ");";
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

	public Aeroporto selectAeroportoById(int id) {
		Aeroporto aeroporto = null;
		Connection conn;
		String query = "SELECT * FROM aeroporto WHERE id = " + id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				aeroporto = new Aeroporto(rs.getInt("id"), rs.getString("citta"), rs.getString("nazione"), rs.getInt("npiste"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return aeroporto;
	}


	public int updateNumeroPiste(int id, int npiste) {
		Connection conn;
		String query = "UPDATE aeroporto "
				+ "SET npiste = " + npiste 
				+ " WHERE id = " + "'" + id + "';";
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
