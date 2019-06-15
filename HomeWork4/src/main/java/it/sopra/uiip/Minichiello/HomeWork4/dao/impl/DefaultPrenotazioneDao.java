package it.sopra.uiip.Minichiello.HomeWork4.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Minichiello.HomeWork4.ConnectionManager;
import it.sopra.uiip.Minichiello.HomeWork4.dao.PrenotazioneDao;
import it.sopra.uiip.Minichiello.HomeWork4.dao.ViaggiatoreDao;
import it.sopra.uiip.Minichiello.HomeWork4.dao.VoloDao;
import it.sopra.uiip.Minichiello.HomeWork4.model.PrenotazioneModel;
import it.sopra.uiip.Minichiello.HomeWork4.model.ViaggiatoreModel;

public class DefaultPrenotazioneDao implements PrenotazioneDao{

	public boolean insertPrenotazione(PrenotazioneModel prenotazione) {
		Connection conn;
		int risutatoQuery=0;
		String query = "INSERT IGNORE INTO prenotazione values("+prenotazione.getId()+"," +prenotazione.getVolo().getIdVolo() 
				+",'"+ prenotazione.getViaggiatore().getCd()+"');";
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

	public PrenotazioneModel searchPrenotazioneById(int id) {
		PrenotazioneModel result=null;
		Connection conn;
		VoloDao volo=new DefaultVoloDao();
		ViaggiatoreDao viaggiatore=new DefaultViaggiatoreDao();
		String query = "select * from prenotazione as P where P.idPrenotazione ="+id+";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet ris=st.executeQuery(query);
			if(ris.next())
				result=(new PrenotazioneModel(ris.getInt("idPrenotazione"),
						volo.selectVoloById(ris.getInt("volo")).get(0),
						viaggiatore.searchViaggiatoreById(ris.getString("viaggiatore"))));
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
