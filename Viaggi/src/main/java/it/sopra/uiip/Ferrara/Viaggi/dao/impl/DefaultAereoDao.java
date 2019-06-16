package it.sopra.uiip.Ferrara.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Ferrara.Viaggi.ConnectionManager;
import it.sopra.uiip.Ferrara.Viaggi.dao.AereoDao;
import it.sopra.uiip.Ferrara.Viaggi.model.AereoModel;

public class DefaultAereoDao implements AereoDao {

	public int insertAereo(AereoModel aereo) {
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values(" + "'"+aereo.getTipoAereo()+"'" + "," + aereo.getnPass()+", " +aereo.getQuantitaMerci()+");";

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

	public AereoModel selectAereoByTipo(String tipoAereo) {
		AereoModel result = null;
		Connection conn;
		String query = "SELECT * FROM aereo WHERE tipoAereo = "+ "'"+tipoAereo+"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if(rs.next()) {
				result = new AereoModel (rs.getString("tipoAereo"), rs.getInt("nPass"),rs.getInt("quantitaMerci"));
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

	public int updateAereo(String tipoAereo, int nPass) {
		int res = 0;
		Connection conn;
		String query = "UPDATE aereo "
				+ "SET nPass ="+nPass+" WHERE tipoAereo = "+"'"+tipoAereo+"'";
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
