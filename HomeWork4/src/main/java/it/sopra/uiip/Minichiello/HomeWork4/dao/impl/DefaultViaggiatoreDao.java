package it.sopra.uiip.Minichiello.HomeWork4.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Minichiello.HomeWork4.ConnectionManager;
import it.sopra.uiip.Minichiello.HomeWork4.dao.ViaggiatoreDao;
import it.sopra.uiip.Minichiello.HomeWork4.model.CompagniaModel;
import it.sopra.uiip.Minichiello.HomeWork4.model.ViaggiatoreModel;

public class DefaultViaggiatoreDao implements ViaggiatoreDao{

	public boolean insertViaggiatore(ViaggiatoreModel viaggiatore) {
		Connection conn;
		int risutatoQuery=0;
		String query = "INSERT IGNORE INTO viaggiatore values('"+viaggiatore.getCd()+"','" +viaggiatore.getNome() +"','"
				+ viaggiatore.getCognome()+"');";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			risutatoQuery=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(risutatoQuery==1)
			return true;
		else
			return false;
	}

	public ViaggiatoreModel searchViaggiatoreById(String cf) {
		ViaggiatoreModel result=null;
		Connection conn;
		String query = "select * from viaggiatore as V where V.cf ='"+cf+"';";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet ris=st.executeQuery(query);
			if(ris.next())
				result=(new ViaggiatoreModel(ris.getString("cf"), ris.getString("nome"),ris.getString("cognome")));
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
