package it.sopra.uiip.ristaino.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.ristaino.ConnectionManager;
import it.sopra.uiip.ristaino.dao.AereoDao;
import it.sopra.uiip.ristaino.model.AereoModel;

public class DefaultAereoDao implements AereoDao{


	public int insertAereo(AereoModel aereoModel) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereoModel.getTipoAereo() +"'"
			+ ", " + aereoModel.getnPass() 
			+ ", " + aereoModel.getQuantitaMerci() + ");";
		
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

	public AereoModel selectAereoByTipoAereo(String tipoAereo) {
		// TODO Auto-generated method stub
		AereoModel aereoModel = null;
		Connection conn;
		String query = "SELECT * FROM aereo WHERE tipoAereo = '" +tipoAereo +"'" ;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				aereoModel = new AereoModel(rs.getString("tipoAereo"), 
						rs.getInt("nPass"), 
						rs.getInt("quantitaMerci"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return aereoModel;
	}

	public int updateNpass(String tipoAereo, int nPass) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "UPDATE aereo "
				+ "SET nPass = " +nPass 
				+ " WHERE tipoAereo =  '" + tipoAereo +"'";
		
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
