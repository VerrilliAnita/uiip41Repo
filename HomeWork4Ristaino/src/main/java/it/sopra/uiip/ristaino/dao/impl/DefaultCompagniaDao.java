package it.sopra.uiip.ristaino.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.ristaino.ConnectionManager;
import it.sopra.uiip.ristaino.dao.CompagniaDao;
import it.sopra.uiip.ristaino.model.CompagniaModel;

public class DefaultCompagniaDao implements CompagniaDao {

	public int insertCompagnia(CompagniaModel compagniaModel) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO compagnia values('" + compagniaModel.getNome() +"'"
			+ ", '" + compagniaModel.getNazioneSede() +"');";
		
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

	public CompagniaModel selectCompagniaById(String nome) {
		// TODO Auto-generated method stub
		CompagniaModel compagniaModel = null;
		Connection conn;
		String query = "SELECT * FROM compagnia WHERE nome = '" +nome +"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				compagniaModel = new CompagniaModel(rs.getString("nome"), 
						rs.getString("nazioneSede"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return compagniaModel;
	}

}
