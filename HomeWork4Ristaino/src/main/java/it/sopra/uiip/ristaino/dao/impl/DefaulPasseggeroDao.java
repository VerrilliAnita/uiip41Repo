package it.sopra.uiip.ristaino.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.ristaino.ConnectionManager;
import it.sopra.uiip.ristaino.dao.PasseggeroDao;
import it.sopra.uiip.ristaino.model.PasseggeroModel;

public class DefaulPasseggeroDao implements PasseggeroDao {

	public int insertPasseggero(PasseggeroModel passeggeroModel) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO passeggero values('" + passeggeroModel.getCodiceFiscale() +"'"
			+ ", '" + passeggeroModel.getNome() +"'"
			+ ", '" + passeggeroModel.getCognome() +"');";
		
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

	public PasseggeroModel selectPasseggeroByCF(String codiceFiscale) {
		// TODO Auto-generated method stub
		PasseggeroModel passeggeroModel = null;
		Connection conn;
		String query = "SELECT * FROM passeggero WHERE codiceFiscale = '" +codiceFiscale +"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				passeggeroModel = new PasseggeroModel(rs.getString("codiceFiscale"), 
						rs.getString("nome"),
						rs.getString("cognome"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return passeggeroModel;
	}
	
	

}
