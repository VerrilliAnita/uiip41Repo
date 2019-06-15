package it.sopra.uiip.Minichiello.HomeWork4.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Minichiello.HomeWork4.ConnectionManager;
import it.sopra.uiip.Minichiello.HomeWork4.dao.AereoDao;
import it.sopra.uiip.Minichiello.HomeWork4.model.AereoModel;


public class DefaultAereoDao implements AereoDao{

	public boolean insertAereo(AereoModel aereo) {
		Connection conn;
		int risutatoQuery=0;
		String query = "INSERT IGNORE INTO aereo values('"+aereo.getTipoAereo()+"'," + aereo.getnPass() + ","
				+ " " + aereo.getQuantitaMerci() + ");";
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

	public AereoModel selectAereoByType(String type) {
		AereoModel result=null;
		Connection conn;
		String query = "select * from aereo as A where A.tipoAereo = '"+type+"';";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet ris=st.executeQuery(query);
			if(ris.next())
				result=(new AereoModel(ris.getString("tipoAereo"), ris.getInt("nPass"), ris.getInt("quantitaMerci")));
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean updateNPostiByAereoModel(String type, int newNposti) {
		Connection conn;
		int risutatoQuery=0;
		String query = "update aereo set nPass="+newNposti+" where tipoAereo='"+type+"';";
		
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
}