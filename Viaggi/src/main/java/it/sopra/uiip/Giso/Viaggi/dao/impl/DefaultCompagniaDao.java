package it.sopra.uiip.Giso.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Giso.Viaggi.ConnectionManager;
import it.sopra.uiip.Giso.Viaggi.dao.CompagniaDao;
import it.sopra.uiip.Giso.Viaggi.model.CompagniaModel;

public class DefaultCompagniaDao implements CompagniaDao{

	public int insertCompagnia(CompagniaModel compagnia) {
		
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO compagnia values"
				+ "(" + "'"+compagnia.getNome()+"'," + "'"+compagnia.getNazione()+"'"+");";
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


	public CompagniaModel selectCompagniaByName(String nomeCompagnia) {
		
		Connection conn;
		CompagniaModel result = null;
		
		String query = "Select * FROM compagnia WHERE nome ="+"'"+nomeCompagnia+"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next()) {
				result = new CompagniaModel(rs.getString("nome"),rs.getString("nazione"));
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
