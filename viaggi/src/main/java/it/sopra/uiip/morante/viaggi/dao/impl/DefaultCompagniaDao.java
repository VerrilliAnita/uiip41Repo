package it.sopra.uiip.morante.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.morante.viaggi.ConnectionManager;
import it.sopra.uiip.morante.viaggi.dao.CompagniaDao;
import it.sopra.uiip.morante.viaggi.model.CompagniaModel;

public class DefaultCompagniaDao implements CompagniaDao {

	public int insertCompagnia(CompagniaModel compagnia) {

		int ritorno = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO compagnia values(" + compagnia.getId() + ", '" + compagnia.getNome() + "', '" + compagnia.getNazione() + "');";

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

	public CompagniaModel selectCompagnia(int idCompagnia) {
		
		CompagniaModel result = null;
		Connection conn;
		String query = "select * from compagnia where id = " + idCompagnia;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				result = new CompagniaModel(rs.getInt("id"), rs.getString("nome"), rs.getString("nazione"));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
