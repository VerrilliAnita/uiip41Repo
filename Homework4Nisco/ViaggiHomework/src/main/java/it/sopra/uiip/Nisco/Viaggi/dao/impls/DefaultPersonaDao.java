package it.sopra.uiip.Nisco.Viaggi.dao.impls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Nisco.Viaggi.ConnectionManager;
import it.sopra.uiip.Nisco.Viaggi.dao.AereoDao;
import it.sopra.uiip.Nisco.Viaggi.dao.PersonaDao;
import it.sopra.uiip.Nisco.Viaggi.model.CompagniaAereaModel;
import it.sopra.uiip.Nisco.Viaggi.model.PersonaModel;

public class DefaultPersonaDao implements PersonaDao {

	public int insertPersona(PersonaModel persona) {
		Connection conn;
		String query = "INSERT IGNORE INTO persona values('"+persona.getCodiceFiscale()+"','"+persona.getNome()+"','"+persona.getCognome()+"',"+persona.getDatadinascita()+");";
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

	public PersonaModel selectPersonaByCodiceFiscale(String codiceFiscale) {
		PersonaModel persona=null;
		
		Connection conn;
		String query= "SELECT * FROM persona as a where a.codicefiscale='" +codiceFiscale +"';";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs =st.executeQuery(query);
			if(rs.next()) {
				persona= new PersonaModel(rs.getString("codiceFiscale"),
													rs.getString("nome"),
													rs.getString("cognome"),
													rs.getString("datadinascita"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return persona;
	}

}
