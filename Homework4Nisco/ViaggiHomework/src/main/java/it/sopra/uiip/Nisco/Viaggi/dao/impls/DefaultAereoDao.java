package it.sopra.uiip.Nisco.Viaggi.dao.impls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Nisco.Viaggi.ConnectionManager;
import it.sopra.uiip.Nisco.Viaggi.dao.AereoDao;
import it.sopra.uiip.Nisco.Viaggi.model.AereoModel;
import it.sopra.uiip.Nisco.Viaggi.model.AeroportoModel;

public class DefaultAereoDao implements AereoDao {

	public int insertAereo(AereoModel aereo) {
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('"+aereo.getTipoAereo()+"',"+aereo.getNpass()+","+aereo.getQuantitamerci()+");";
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

	public AereoModel selectAereoByTipoAereo(String tipoAereo) {
		AereoModel aereo=null;
		Connection conn;
		String query= "SELECT * FROM aereo as a where a.tipoAereo ='"+tipoAereo+"';";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs =st.executeQuery(query);
			if(rs.next()) {
				aereo= new AereoModel(rs.getString("tipoAereo"),rs.getInt("nPass"),rs.getInt("Quantitamerci"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return aereo;
	}

	public int updateNpassByTipoAereo(String tipoAereo, int nPass) {
		Connection conn;
		String query="update aereo set npass = "+nPass+" where tipoAereo = '"+tipoAereo+"';";
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
