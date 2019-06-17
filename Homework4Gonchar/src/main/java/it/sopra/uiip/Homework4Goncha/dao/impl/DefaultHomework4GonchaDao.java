package it.sopra.uiip.Homework4Goncha.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Homework4Goncha.ConnectionManager;
import it.sopra.uiip.Homework4Goncha.dao.Homework4GoncharDao;
import it.sopra.uiip.Verrilli.dao.ExampleDao;

public class DefaultHomework4GonchaDao implements Homework4GoncharDao {
	public void insertHomework4Goncha(Homework4GoncharDao Aereo) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "INSERT IGNORE INTO example values(" + Aereo.getTipoAereo() + ", '" + Aereo.getAttribute2() +((Object) Aereo).getQuantitaMerci()+ "');";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public Homework4GoncharDao selectExampleByAttribute1(int attribute1) {
		// TODO Auto-generated method stub
		Homework4GoncharDao Aereo = null;
		Connection conn;
		String query = "select * from example where id = " + attribute1;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				exampleModel = new ExampleModel(rs.getInt("attribute1"), rs.getString("attribute2"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return exampleModel;
	}

	public void insertHomework4GoncharDao(Homework4GoncharDao Homework4GoncharModel) {
		// TODO Auto-generated method stub
		
	}

	public Homework4GoncharDao selectHomework4GoncharDaoModelByAttribute1(int attribute1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}



