package it.sopra.uiip.Ferrara.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Ferrara.Viaggi.ConnectionManager;
import it.sopra.uiip.Ferrara.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Ferrara.Viaggi.model.AeroportoModel;

public class DefaultAeroportoDao implements AeroportoDao {

	public int insertAeroporto(AeroportoModel aeroporto) {
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values(" + aeroporto.getId() + ",'"  + aeroporto.getCitta()+"', '" 
		+aeroporto.getNazione()+"',"+aeroporto.getNpiste()+");";

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

	public AeroportoModel selectAereoportoById(int id) {
		AeroportoModel result = null;
		Connection conn;
		String query = "SELECT * FROM aeroporto WHERE id ="+id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if(rs.next()) {
				result = new AeroportoModel(rs.getInt("id"), rs.getString("citta"),rs.getString("nazione"),rs.getInt("nPiste"));
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


	public int updateAeroporto(int id, int npiste) {
		int res = 0;
		Connection conn;
		String query = "UPDATE aeroporto "
				+ "SET nPiste ="+npiste+" WHERE id = "+id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			res=st.executeUpdate(query); 	
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

}
