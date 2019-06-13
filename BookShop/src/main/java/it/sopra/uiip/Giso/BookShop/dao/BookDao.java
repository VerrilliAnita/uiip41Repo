package it.sopra.uiip.Giso.BookShop.dao;

import java.util.ArrayList;

import it.sopra.uiip.Giso.BookShop.model.BookModel;

public interface BookDao {
	
	public void insertBook(BookModel book );
	public BookModel selectBookById(int id);
	public int setQuantity(int quantity,int id);
	public ArrayList<BookModel> allBooks();

}
