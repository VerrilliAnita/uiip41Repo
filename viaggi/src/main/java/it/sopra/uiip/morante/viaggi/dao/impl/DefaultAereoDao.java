package it.sopra.uiip.morante.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.morante.viaggi.ConnectionManager;
import it.sopra.uiip.morante.viaggi.dao.AereoDao;
import it.sopra.uiip.morante.viaggi.model.AereoModel;

public class DefaultAereoDao implements AereoDao {

	public int insertAereo(AereoModel aereo) {
		
		int ritorno = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getTipo() + "', " + aereo.getNumeroPosti() + ", " + aereo.getQuantita() + ", " + aereo.getCompagnia() +");";

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

	public AereoModel selectAereo(String tipo) {
		
		AereoModel result = null;
		Connection conn;
		String query = "select * from aereo where tipo = '" + tipo +"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				result = new AereoModel(rs.getString("tipo"), rs.getInt("numeroPosti"), rs.getInt("quantitaMerci"), rs.getInt("compagnia"));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int updatePasseggieri(String tipo, int numeroPosti) {
		
		
		Connection conn;
		int ritorno = 0;
		String query = "update aereo set numeroPosti = " + numeroPosti + " where tipo = '" + tipo + "'";
		
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
