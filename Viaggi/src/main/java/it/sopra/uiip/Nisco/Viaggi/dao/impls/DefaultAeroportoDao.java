package it.sopra.uiip.Nisco.Viaggi.dao.impls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Nisco.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Nisco.Viaggi.model.AeroportoModel;
import it.sopra.uiip.Nisco.Viaggi.ConnectionManager;

public class DefaultAeroportoDao implements AeroportoDao {

	
	
	
	
	public int insertAeroporto(AeroportoModel aeroporto) {
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values("+aeroporto.getId()+",'"+aeroporto.getCitta()+"','"+aeroporto.getNazione()+"',"+aeroporto.getNpiste()+");";
		int esito =0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			esito =st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return esito;
	}

	public AeroportoModel selectAeroportoById(int id) {
			AeroportoModel aeroporto=null;
			Connection conn;
			String query= "SELECT * FROM aeroporto as a where a.id=" +id +";";
			try {
				conn = ConnectionManager.getConnection();
				Statement st = conn.createStatement();
				
				ResultSet rs =st.executeQuery(query);
				if(rs.next()) {
					aeroporto= new AeroportoModel(rs.getInt("id"),rs.getString("citta"),rs.getString("nazione"),rs.getInt("npiste"));
				}
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch(SQLException e) {
				e.printStackTrace();
			}
	return aeroporto;
	}

	public int updateNpisteById(int id, int npiste) {
		Connection conn;
		String query="update aeroporto set npiste ="+npiste+" where id ="+id+";";
		int esito =0;
			try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			esito =st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return esito;
	}

}
