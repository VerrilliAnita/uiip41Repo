package it.sopra.uiip.Nisco.Viaggi.dao.impls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Nisco.Viaggi.ConnectionManager;
import it.sopra.uiip.Nisco.Viaggi.dao.AereoDao;
import it.sopra.uiip.Nisco.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Nisco.Viaggi.dao.VoloDao;
import it.sopra.uiip.Nisco.Viaggi.model.AereoModel;
import it.sopra.uiip.Nisco.Viaggi.model.VoloModel;

public class DefaultVoloDao implements VoloDao {

	public int insertVolo(VoloModel volo) {
		Connection conn;
		String query = "INSERT IGNORE INTO volo values("+volo.getIdVolo()+",'"+volo.getGiornoSett()+"',"+volo.getAeroportoPart().getId()+","+volo.getAeroportoArr().getId()+",'"+volo.getTipoAereo().getTipoAereo()+"',"+volo.getOraPartenza()+","+volo.getOraArrivo()+");";
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

	public ArrayList<VoloModel> selectVoloByIdVolo(int idVolo) {
		ArrayList<VoloModel> volo=new ArrayList<VoloModel>();
		Connection conn;
		AeroportoDao gestoreAeroporto=new DefaultAeroportoDao();
    	AereoDao gestoreAereo=new DefaultAereoDao();
		String query= "select * from volo where idVolo= "+idVolo;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs =st.executeQuery(query);
			while(rs.next()) {
				volo.add(new VoloModel(rs.getInt("idVolo"),
									rs.getString("giornoSett"),
									gestoreAeroporto.selectAeroportoById(rs.getInt("aeroportoPart")),
									gestoreAeroporto.selectAeroportoById(rs.getInt("aeroportoArr")),
									gestoreAereo.selectAereoByTipoAereo(rs.getString("tipoAereo")),
									rs.getInt("oraPartenza"),
									rs.getInt("oraArrivo")));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return volo;
	}

}
