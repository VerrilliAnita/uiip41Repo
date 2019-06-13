package it.sopra.uiip.Minichiello.bookShop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import it.sopra.uiip.Minichiello.bookShop.ConnectionManager;
import it.sopra.uiip.Minichiello.bookShop.dao.BookDao;
import it.sopra.uiip.Minichiello.bookShop.model.BookModel;

public class DefaultBookDao implements BookDao{

	public ArrayList<BookModel> selectAllBook() {
		ArrayList<BookModel> result=new ArrayList<BookModel>();
		Connection conn;
		String query = "select * from book";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet s=st.executeQuery(query);
			while(s.next())
				result.add(new BookModel(s.getInt("id"), s.getString("title"), s.getString("author"),
						s.getFloat("price"), s.getInt("qty")));
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
				
	}

	public BookModel selectBookById(int id) {
		BookModel result=null;
		Connection conn;
		String query = "select * from book as L where L.id="+id+";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet s=st.executeQuery(query);
			if(s.next())
				result=(new BookModel(s.getInt("id"), s.getString("title"), s.getString("author"),
						s.getFloat("price"), s.getInt("qty")));
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean UpdateQtyBookById(int qt, int id) {
		Connection conn;
		int s=0;
		String query = "update book set qty="+qt+" where id="+id+";";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			s=st.executeUpdate(query);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(s==1)
			return true;
		else
			return false;
	}

	public boolean insertBook(BookModel book) {
		Connection conn;
		int s=0;
		String query = "INSERT IGNORE INTO book values("+book.getId()+",'" + book.getTitle() + "', '" + book.getAuthor() + "',"
				+ book.getPrice()+","+book.getQty()+ ");";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			s=st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(s==1)
			return true;
		else
			return false;
	}

}
