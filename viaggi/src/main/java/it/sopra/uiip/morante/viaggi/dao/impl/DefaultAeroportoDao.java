package it.sopra.uiip.morante.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.morante.viaggi.ConnectionManager;
import it.sopra.uiip.morante.viaggi.dao.AeroportoDao;
import it.sopra.uiip.morante.viaggi.model.AeroportoModel;

public class DefaultAeroportoDao implements AeroportoDao {

	public int insertAeroporto(AeroportoModel aeroporto) {
		
		int ritorno = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values(" + aeroporto.getId() + ", '" + aeroporto.getCitta() + "', '" + aeroporto.getNazione() + "', " + aeroporto.getNumeroPiste() + ");";
		
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

	public AeroportoModel selectAeroporto(int id) {

		AeroportoModel result = null;
		Connection conn;
		String query = "Select * FROM aeroporto AS a WHERE a.id=" + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				result = new AeroportoModel(rs.getInt("id"), rs.getString("citta"), rs.getString("nazione"), rs.getInt("numeroPiste"));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int updateNumeroPiste(int id, int numeroPiste) {
		
		Connection conn;
		int ritorno = 0;
		String query = "update aeroporto set numeroPiste = " + numeroPiste + " where id = " + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ritorno = st.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ritorno;
	}

}
