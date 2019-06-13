package it.sopra.uiip.Giso.BookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Giso.BookShop.ConnectionManager;
import it.sopra.uiip.Giso.BookShop.dao.BookDao;
import it.sopra.uiip.Giso.BookShop.model.BookModel;



public class DefaultBookDao implements BookDao{

	public void insertBook(BookModel book) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "INSERT IGNORE INTO book values(" + book.getId() + ", '" + book.getTitle()+"' , '" + book.getAuthor() +"',"
		+ book.getPrice()+", " +book.getQty()+");";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public BookModel selectBookById(int id) {
		BookModel result = null;
		
		Connection conn;
		String query = "SELECT * FROM book WHERE id = "+id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				result = new BookModel(rs.getInt("id"), rs.getString("title"),rs.getString("author"),rs.getFloat("price"),rs.getInt("qty"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int setQuantity(int quantity,int id) {
		
		int res = 0;
		Connection conn;
		String query = "UPDATE book "
				+ "SET book.qty ="+quantity+" WHERE id = "+id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			if(st.executeUpdate(query) == 1)
				res = 1;
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return res;
		

		
	}

	public ArrayList<BookModel> allBooks() {
		ArrayList<BookModel> result = new ArrayList<BookModel>();
		Connection conn;
		String query = "SELECT * FROM book";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				result.add(new BookModel(rs.getInt("id"), rs.getString("title"),rs.getString("author"),rs.getFloat("price"),rs.getInt("qty")));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
