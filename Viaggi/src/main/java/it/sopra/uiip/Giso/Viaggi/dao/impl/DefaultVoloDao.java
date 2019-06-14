package it.sopra.uiip.Giso.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Giso.Viaggi.ConnectionManager;
import it.sopra.uiip.Giso.Viaggi.dao.VoloDao;
import it.sopra.uiip.Giso.Viaggi.model.VoloModel;

public class DefaultVoloDao implements VoloDao {

	public int insertVolo(VoloModel volo) {
		
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO volo values(" + volo.getIdVolo() + ",'"  + volo.getGiornoSett()+"',"  
		+volo.getAeroportoPart()+","+volo.getAeroportoArr()+",'"+volo.getTipoAereo()+"',"+volo.getOraPartenza()+","+volo.getOraArrivo() +");";
		
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

	public ArrayList<VoloModel> selectVoloById(int idVolo) {
		ArrayList<VoloModel> result = new ArrayList<VoloModel>();
		Connection conn;
		String query = "SELECT * FROM volo WHERE idVolo ="+idVolo;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				result.add(new VoloModel(rs.getInt("idVolo"), rs.getString("giornoSett"),rs.getInt("aeroportoPart"),rs.getInt("aeroportoArr"), rs.getString("tipoAereo"),rs.getInt("oraPartenza"),rs.getInt("oraArrivo")));
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

}
