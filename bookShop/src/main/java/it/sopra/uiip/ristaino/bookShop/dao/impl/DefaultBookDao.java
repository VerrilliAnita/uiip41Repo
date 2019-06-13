package it.sopra.uiip.ristaino.bookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.ristaino.bookShop.ConnectionManager;
import it.sopra.uiip.ristaino.bookShop.dao.BookDao;
import it.sopra.uiip.ristaino.bookShop.model.BookModel;

public class DefaultBookDao implements BookDao{

	public int insertBook(BookModel book) {
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO book VALUES(" +book.getId() 
				+", '" +book.getTitle()+"'"
				+", '" +book.getAuthor()+"'"
				+", " + book.getPrice()
				+", " + book.getQty()
				+")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			result = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public BookModel selectBookById(int id) {
		BookModel bookModel = null;
		Connection conn;
		
		String query = "SELECT * FROM book AS b WHERE b.id = " +id +";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				bookModel = new BookModel(rs.getInt("id"), rs.getString("title"),
						rs.getString("author"), rs.getFloat("price"), rs.getInt("qty"));
			}
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return bookModel;
	}

	public int setBookQuantity(int id, int qty) {
		int result = 0;
		Connection conn;
		
		String query = "UPDATE book SET qty = " +"'"+qty+"' WHERE id = " +id +";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			result = st.executeUpdate(query);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<BookModel> getBooks() {
		ArrayList<BookModel> books = new ArrayList<BookModel>();
		Connection conn;
		
		String query = "SELECT * FROM book;";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				BookModel bookModel = new BookModel(rs.getInt("id"), rs.getString("title"),
						rs.getString("author"), rs.getFloat("price"), rs.getInt("qty"));
				books.add(bookModel);
			}
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	

	
	
	

}
