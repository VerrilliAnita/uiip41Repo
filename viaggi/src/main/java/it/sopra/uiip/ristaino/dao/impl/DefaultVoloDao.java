package it.sopra.uiip.ristaino.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.ristaino.ConnectionManager;
import it.sopra.uiip.ristaino.dao.AereoDao;
import it.sopra.uiip.ristaino.dao.AeroportoDao;
import it.sopra.uiip.ristaino.dao.VoloDao;
import it.sopra.uiip.ristaino.model.AeroportoModel;
import it.sopra.uiip.ristaino.model.VoloModel;

public class DefaultVoloDao implements VoloDao {

	public int insertVolo(VoloModel voloModel) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO volo values(" + voloModel.getIdVolo() +""
			+ ", '" + voloModel.getGiornoSett() +"'" 
			+ ", " + voloModel.getAeroportoPart().getId()
			+ ", " + voloModel.getAeroportoArr().getId()
			+ ", '" + voloModel.getTipoAereo().getTipoAereo() +"'"
			+ ", " + voloModel.getOraPartenza()
			+ ", " + voloModel.getOraArrivo() +");";
		
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

	public ArrayList<VoloModel> selectVoloById(int id) {
		// TODO Auto-generated method stub
		ArrayList<VoloModel> listaVoloModel = new ArrayList<VoloModel>();
		Connection conn;
		String query = "SELECT * FROM volo WHERE idVolo = " +id;
		AeroportoDao aeroportoDao = new DefaultAeroportoDao();
		AereoDao aereoDao = new DefaultAereoDao();
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				listaVoloModel.add(new VoloModel(rs.getInt("idVolo"),
						rs.getString("giornoSett"),
						aeroportoDao.selectAeroportoById(rs.getInt("aeroportoPart")),
						aeroportoDao.selectAeroportoById(rs.getInt("aeroportoArr")),
						aereoDao.selectAereoByTipoAereo(rs.getString("tipoAereo")),
						rs.getInt("oraPartenza"),
						rs.getInt("oraArrivo")));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listaVoloModel;
	}

}
