package it.sopra.uiip.suglia.BookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.suglia.BookShop.ConnectionManager;
import it.sopra.uiip.suglia.BookShop.dao.BookDao;
import it.sopra.uiip.suglia.BookShop.model.BookModel;


public class DefaulBookDao implements BookDao {
	
	public int insertBook(BookModel book) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "INSERT IGNORE INTO book values(" + book.getId() + ", '" 
		+ book.getTitle() + "' , '"
		+ book.getAuthor() + "' , "
		+ book.getPrice() + " ,"
		+ book.getQty()+");";
		int esito=0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			esito=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return esito;
	}

	public BookModel selectBookbyId(int id) {
		// TODO Auto-generated method stub
		
		BookModel bookModel = null;
		Connection conn;
		String query = "select * from book where id = " + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				bookModel = new BookModel(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getFloat("price"), rs.getInt("qty"));
			}
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return bookModel;
	}

	public int aggiornaQtyLibro(int id, int qty) {
		Connection conn;
		String query = "UPDATE book"
				+ " SET qty = " + qty 
				+ " WHERE id = " + id + ";";
		int esito=0;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			esito=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return esito;
	}

	public ArrayList<BookModel> selectLibri() {
		
		ArrayList lista = new ArrayList<BookModel>();
		Connection conn;
		String query = "select * from book";

		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				lista.add(new BookModel(rs.getInt("id"), 
						rs.getString("title"), rs.getString("author"), 
						rs.getFloat("price"), rs.getInt("qty")));
			}
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	
		return lista;
	}
}
