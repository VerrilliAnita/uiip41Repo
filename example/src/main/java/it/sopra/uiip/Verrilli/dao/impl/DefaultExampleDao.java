package it.sopra.uiip.Verrilli.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Verrilli.ConnectionManager;
import it.sopra.uiip.Verrilli.dao.ExampleDao;
import it.sopra.uiip.Verrilli.model.ExampleModel;

public class DefaultExampleDao implements ExampleDao{

	public void insertExample(ExampleModel example) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "INSERT IGNORE INTO example values(" + example.getAttribute1() + ", '" + example.getAttribute2() + "');";
		
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

	public ExampleModel selectExampleByAttribute1(int attribute1) {
		// TODO Auto-generated method stub
		ExampleModel exampleModel = null;
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
	
	

}
