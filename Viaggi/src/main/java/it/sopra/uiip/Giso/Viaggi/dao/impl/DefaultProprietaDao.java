package it.sopra.uiip.Giso.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Giso.Viaggi.ConnectionManager;
import it.sopra.uiip.Giso.Viaggi.dao.ProprietaDao;
import it.sopra.uiip.Giso.Viaggi.model.ProprietaModel;

public class DefaultProprietaDao implements ProprietaDao{

	public int insertProprieta(ProprietaModel proprieta) {

		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO proprieta values"
				+ "(" + "'"+proprieta.getCompagnia()+"'," + "'"+proprieta.getAereo()+"'"+")";
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

	public ArrayList<String> selectAereiByCompagnia(String compagnia) {
		
		Connection conn;
		ArrayList<String> result = new ArrayList<String>();
		
		String query = "Select * FROM proprieta WHERE compagnia ="+"'"+compagnia+"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				result.add(rs.getString("aereo"));
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
