package it.sopra.uiip.Gonchar.BookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.Gonchar.BookShop.model.BookModel;
import it.sopra.uiip.Gonchar.BookShop.ConnectionManager;
import it.sopra.uiip.Gonchar.BookShop.dao.BookDao;
import it.sopra.uiip.Gonchar.BookShop.model.*;

public class DefoultBookDao implements BookDao {

	public void insertBookModel(BookModel bookShop) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "INSERT IGNORE INTO BookShop values(" + bookShop.getId() + ", '" + bookShop.getAuthore() + ",'" + bookShop.getTitle() +", '" +bookShop.getPrice()+ ", '" + bookShop.getQty()+ "');";
		
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
	
	public BookModel selectBookModelByAttribute1(int id) {
		// TODO Auto-generated method stub

		Connection con;
		
		String query = "select * from Bookmodel where id = " + id; 
		BookModel bookModel=null;
		
		try {
			con = ConnectionManager.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				bookModel = new BookModel(rs.getInt("id"), rs.getString("authore"), rs.getString("title"), rs.getDouble("price"), rs.getInt("qty"));
			}
			
			con.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return bookModel;
	}

}
