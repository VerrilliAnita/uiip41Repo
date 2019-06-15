package it.sopra.uiip.Minichiello.HomeWork4.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Minichiello.HomeWork4.ConnectionManager;
import it.sopra.uiip.Minichiello.HomeWork4.dao.CompagniaDao;
import it.sopra.uiip.Minichiello.HomeWork4.model.CompagniaModel;

public class DefaultCompagniaDao implements CompagniaDao{

	public boolean insertCompagnia(CompagniaModel compagnia) {
		Connection conn;
		int risutatoQuery=0;
		String query = "INSERT IGNORE INTO compagnia values("+compagnia.getId()+",'" +compagnia.getNome() + "');";
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

	public CompagniaModel searchCompagniaById(int id) {
		CompagniaModel result=null;
		Connection conn;
		String query = "select * from compagnia as C where C.idCompagnia = "+id+";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet ris=st.executeQuery(query);
			if(ris.next())
				result=(new CompagniaModel(ris.getInt("idCompagnia"), ris.getString("nome")));
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
