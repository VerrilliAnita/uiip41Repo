package it.sopra.uiip.morante.BookShop.dao;

import java.util.ArrayList;

import it.sopra.uiip.morante.BookShop.model.BookModel;

public interface BookDao {
	
	public int insertBookModel(BookModel book);
	public BookModel selectBookModel(int id);
	public ArrayList<BookModel> selectAllBookModel();
	public int updateQuantity(int id, int quantita);

}
