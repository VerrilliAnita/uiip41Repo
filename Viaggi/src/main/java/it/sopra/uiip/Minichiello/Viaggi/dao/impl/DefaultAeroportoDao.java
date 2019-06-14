package it.sopra.uiip.Minichiello.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Minichiello.Viaggi.ConnectionManager;
import it.sopra.uiip.Minichiello.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Minichiello.Viaggi.model.AeroportoModel;

public class DefaultAeroportoDao implements AeroportoDao{

	public boolean insertAeroporto(AeroportoModel aeroporto) {
		Connection conn;
		int risutatoQuery=0;
		String query = "INSERT IGNORE INTO aeroporto values("+aeroporto.getId()+",'" + aeroporto.getCitta() + "', '" + aeroporto.getNazione() + "',"
				+ aeroporto.getNpiste()+ ");";
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

	public AeroportoModel selectAeroportoById(int idAeroporto) {
		AeroportoModel result=null;
		Connection conn;
		String query = "select * from aeroporto as A where A.id="+idAeroporto+";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet ris=st.executeQuery(query);
			if(ris.next())
				result=(new AeroportoModel(ris.getInt("id"), ris.getString("citta"), ris.getString("nazione"),
						ris.getInt("npiste")));
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean updateNPisteAeroporto(int idAeroporto, int newNPiste) {
		Connection conn;
		int risutatoQuery=0;
		String query = "update aeroporto set npiste="+newNPiste+" where id="+idAeroporto+";";
		
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
