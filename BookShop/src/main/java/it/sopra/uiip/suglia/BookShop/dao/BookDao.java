package it.sopra.uiip.suglia.BookShop.dao;

import java.util.ArrayList;

import it.sopra.uiip.suglia.BookShop.model.BookModel;

public interface BookDao {

	public int insertBook(BookModel book);
	public BookModel selectBookbyId(int id);
	public int aggiornaQtyLibro(int id, int qty);
	public ArrayList<BookModel> selectLibri();

}
