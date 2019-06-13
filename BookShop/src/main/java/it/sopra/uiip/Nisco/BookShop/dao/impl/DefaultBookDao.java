package it.sopra.uiip.Nisco.BookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Nisco.BookShop.dao.BookDao;
import it.sopra.uiip.Nisco.BookShop.model.BookModel;
import it.sopra.uiip.Nisco.BookShop.ConnectionManager;

public class DefaultBookDao implements BookDao {

	public void insertBook(BookModel book) {
		Connection conn;
		String query = "INSERT IGNORE INTO book values(" + book.getId() + ", '" + book.getTitle()+ "', '" +book.getAuthor() + "', " + book.getPrice()+ ", " + book.getQty()+");";
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

	
	public BookModel selectBookById(int id) {
		BookModel book = null;
		Connection conn;
		String query = "select * from book where id = " + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			if(rs.next()) {
				book = new BookModel(rs.getInt("id"),rs.getString("title"),rs.getString("author"),rs.getFloat("price"),rs.getInt("qty"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	public int updateQtyBookById(int qty, int id) {
		Connection conn;
		int es=0;
		String query = "update book as b set b.qty ="+qty +" where b.id = " + id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			es =st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return es;
	}

	public ArrayList<BookModel> selectAll() {
		ArrayList<BookModel> select=new ArrayList<BookModel>();
		Connection conn;
		String query = "select * from book";
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				BookModel book= new BookModel(rs.getInt("id"),rs.getString("title"),rs.getString("author"),rs.getFloat("price"),rs.getInt("qty"));
				select.add(book);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

}
