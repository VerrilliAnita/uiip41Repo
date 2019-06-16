package it.sopra.uiip.Nisco.Viaggi.dao.impls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Nisco.Viaggi.ConnectionManager;
import it.sopra.uiip.Nisco.Viaggi.dao.AereoDao;
import it.sopra.uiip.Nisco.Viaggi.dao.CompagniaAereaDao;

import it.sopra.uiip.Nisco.Viaggi.model.CompagniaAereaModel;

public class DefaultCompagniaAereaDao implements CompagniaAereaDao {

	public int insertCompagniaAerea(CompagniaAereaModel compagnia) {
		Connection conn;
		String query = "INSERT IGNORE INTO compagniaAerea values("+compagnia.getId()+",'"+compagnia.getNome()+"','"+compagnia.getAereo().getTipoAereo()+"');";
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

	public CompagniaAereaModel selectCompagniaAereaByid(int id) {
		CompagniaAereaModel compagnia=null;
		AereoDao gestoreAereo=new DefaultAereoDao();
		Connection conn;
		String query= "SELECT * FROM compagniaAerea as a where a.id=" +id +";";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs =st.executeQuery(query);
			if(rs.next()) {
				compagnia= new CompagniaAereaModel(rs.getInt("id"),
													rs.getString("nome"),
													gestoreAereo.selectAereoByTipoAereo(rs.getString("tipoaereo")));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
return compagnia;
	}

}
