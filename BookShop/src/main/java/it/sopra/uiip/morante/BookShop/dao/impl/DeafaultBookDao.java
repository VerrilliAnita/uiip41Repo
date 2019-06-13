package it.sopra.uiip.morante.BookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.morante.BookShop.ConnectionManager;
import it.sopra.uiip.morante.BookShop.dao.BookDao;
import it.sopra.uiip.morante.BookShop.model.BookModel;

public class DeafaultBookDao implements BookDao{

	public int insertBookModel(BookModel book) {

		int r = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO book values(" + book.getId() + ", '" + book.getTitle() + "', '" + book.getAuthor() + "', " + book.getPrice() + ", " + book.getQty() + ");";

		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			r = st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return r;

	}

	public BookModel selectBookModel(int id) {

		BookModel result = null;
		Connection conn;
		String query = "select * from book where id = " + id;

		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				result = new BookModel(rs.getInt("Id"), rs.getString("title"), rs.getString("author"),  rs.getDouble("price"), rs.getInt("qty"));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}



		return result;
	}

	public ArrayList<BookModel> selectAllBookModel() {

		ArrayList<BookModel> libri = new ArrayList<BookModel>();
		Connection conn;
		String query = "select * from book";

		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				BookModel result = new BookModel(rs.getInt("Id"), rs.getString("title"), rs.getString("author"),  rs.getDouble("price"), rs.getInt("qty"));
				libri.add(result);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return libri;
	}

	public int updateQuantity(int id, int quantita) {
		
		Connection conn;
		int r = 0;
		String query = "update book set qty = " + quantita + " where id = " + id;
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			r = st.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return r;
	}




}
