package it.sopra.uiip.suglia.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.suglia.ConnectionManager;
import it.sopra.uiip.suglia.viaggi.dao.CompagniaDao;
import it.sopra.uiip.suglia.viaggi.model.Compagnia;
import it.sopra.uiip.suglia.viaggi.model.Volo;

public class DefaultCompagniaDao implements CompagniaDao{

	public int insertCompagnia(Compagnia compagnia) {
		Connection conn;
		String query = "INSERT IGNORE INTO compagnia values("
				+ compagnia.getIdComp() + " , '"
				+ compagnia.getNomeCompagnia() + "', '"
				+ compagnia.getTipoAereo() + "');";
		int inserito=0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			inserito=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return inserito;
	}

	public Compagnia selectCompagniaById(int id) {
		Compagnia compagnia = null;
		Connection conn;
		String query = "SELECT * FROM compagnia WHERE idComp = " + id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				compagnia = new Compagnia(rs.getInt("idComp"), 
								rs.getString("nomeCompagnia"), 
								rs.getString("tipoAereo"));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return compagnia;
	}

}
