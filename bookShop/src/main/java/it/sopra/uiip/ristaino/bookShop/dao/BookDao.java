package it.sopra.uiip.ristaino.bookShop.dao;

import java.util.ArrayList;

import it.sopra.uiip.ristaino.bookShop.model.BookModel;

public interface BookDao {

	public int insertBook(BookModel book);
	public BookModel selectBookById(int id);
	public int setBookQuantity(int id, int qty);
	public ArrayList<BookModel> getBooks();
	
}
