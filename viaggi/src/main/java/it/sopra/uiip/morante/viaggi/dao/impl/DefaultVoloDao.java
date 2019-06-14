package it.sopra.uiip.morante.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.morante.viaggi.ConnectionManager;
import it.sopra.uiip.morante.viaggi.dao.VoloDao;
import it.sopra.uiip.morante.viaggi.model.VoloModel;

public class DefaultVoloDao implements VoloDao {

	public int insertVolo(VoloModel volo) {
		
		int ritorno = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO volo values(" + volo.getId() + ", '" + volo.getGiorno() + "', " + volo.getAereoportoPart() + ", " + volo.getAereoportoArr() + ", '"+ volo.getAereo() +"', " + volo.getOraPart() + ", " + volo.getOraArr() +");";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ritorno = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return ritorno;
	}

	public ArrayList<VoloModel> seletcVolo(int id) {

		ArrayList<VoloModel> voli = new ArrayList<VoloModel>();
		Connection conn;
		String query = "Select * FROM volo AS v WHERE v.id=" + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				VoloModel volo = new VoloModel(rs.getInt("id"), rs.getString("giorno"), rs.getInt("aeroportoPart"), rs.getInt("aeroportoArr"), rs.getString("aereo"), rs.getInt("oraPart"), rs.getInt("oraArr"));
				voli.add(volo);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return voli;
	}

}
