package it.sopra.uiip.morante.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.morante.viaggi.ConnectionManager;
import it.sopra.uiip.morante.viaggi.dao.BigliettoDao;
import it.sopra.uiip.morante.viaggi.model.BigliettoModel;

public class DefaultBigliettoDao implements BigliettoDao {

	public int insertBiglietto(BigliettoModel biglietto) {
		
		int ritorno = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO biglietto values(" + biglietto.getId() + ", '" + biglietto.getPasseggero() + "', " + biglietto.getIdvolo() + ", '" + biglietto.getGiorno() + "', " + biglietto.getPrezzo() + ");";

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

	public BigliettoModel selectBiglietto(int idBiglietto) {
		
		BigliettoModel result = null;
		Connection conn;
		String query = "select * from biglietto where id = " + idBiglietto;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				result = new BigliettoModel(rs.getInt("id"), rs.getString("passeggero"), rs.getInt("idvolo"), rs.getString("giorno"), rs.getDouble("prezzo"));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
