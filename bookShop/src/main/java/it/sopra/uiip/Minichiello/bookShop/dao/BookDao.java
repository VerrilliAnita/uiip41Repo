package it.sopra.uiip.Minichiello.bookShop.dao;

import java.util.ArrayList;

import it.sopra.uiip.Minichiello.bookShop.model.BookModel;

public interface BookDao {
	public ArrayList<BookModel> selectAllBook();
	public BookModel selectBookById(int id);
	public boolean UpdateQtyBookById(int qt, int id);
	public boolean insertBook(BookModel book);
}