package it.sopra.uiip.ristaino.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.ristaino.ConnectionManager;
import it.sopra.uiip.ristaino.dao.AeroportoDao;
import it.sopra.uiip.ristaino.model.AeroportoModel;

public class DefaultAeroportoDao implements AeroportoDao{

	
	
	public int insertAeroporto(AeroportoModel aeroportoModel) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values(" + aeroportoModel.getId() +""
			+ ", '" + aeroportoModel.getCitta() +"'" 
			+ ", '" + aeroportoModel.getNazione() +"'"
			+ ", " + aeroportoModel.getNpiste() +");";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			result = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public AeroportoModel selectAeroportoById(int id) {
		// TODO Auto-generated method stub
		AeroportoModel aeroportoModel = null;
		Connection conn;
		String query = "SELECT * FROM aeroporto WHERE id = " +id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				aeroportoModel = new AeroportoModel(rs.getInt("id"),
						rs.getString("citta"),
						rs.getString("nazione"), 
						rs.getInt("npiste"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return aeroportoModel;
	}

	public int updateNpiste(AeroportoModel aeroportoModel, int nPiste) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "UPDATE aeroporto "
				+ "SET npiste = " +nPiste 
				+ " WHERE id =  '" + aeroportoModel.getId() +"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			result = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	

}
