package it.sopra.uiip.Minichiello.Viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Minichiello.Viaggi.ConnectionManager;
import it.sopra.uiip.Minichiello.Viaggi.dao.AereoDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.VoloDao;
import it.sopra.uiip.Minichiello.Viaggi.model.AereoModel;
import it.sopra.uiip.Minichiello.Viaggi.model.AeroportoModel;
import it.sopra.uiip.Minichiello.Viaggi.model.VoloModel;

public class DefaultVoloDao implements VoloDao{

	public boolean insertVolo(VoloModel volo) {
		Connection conn;
		int risutatoQuery=0;
		String query = "INSERT IGNORE INTO volo values("+volo.getIdVolo()+",'" + volo.getGiornoSett() + "',"
				+ " " + volo.getAeroportoPart().getId() + ","+volo.getAeroportoArr().getId()+","
						+ "'"+volo.getTipoaereo().getTipoAereo()+"',"+volo.getOraPartenza()+","
								+ ""+volo.getOraArrivo()+");";
		
       
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

	public ArrayList<VoloModel> selectVoloById(int idVolo) {
		ArrayList<VoloModel> voli=new ArrayList<VoloModel>();
		VoloModel result=null;
		Connection conn;
		String query = "select * from volo as V where V.idVolo = "+idVolo+";";
		AeroportoDao aeroporto=new DefaultAeroportoDao();
		AereoDao aereo=new DefaultAereoDao();
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet ris=st.executeQuery(query);
			while(ris.next()) {
				result=(new VoloModel(ris.getInt("idVolo"), 
						ris.getString("giornoSett"), 
						aeroporto.selectAeroportoById(ris.getInt("aeroportoPart")),
						aeroporto.selectAeroportoById(ris.getInt("aeroportoArr")),
						aereo.selectAereoByType(ris.getString("tipoAereo")),
						ris.getInt("oraPartenza"),
						ris.getInt("oraArrivo")));
				voli.add(result);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return voli;
	}

}
