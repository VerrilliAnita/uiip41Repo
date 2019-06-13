package it.sopra.uiip.Nisco.BookShop.dao;

import java.util.ArrayList;

import it.sopra.uiip.Nisco.BookShop.model.BookModel;

public interface BookDao {
	public void insertBook(BookModel book);
	public BookModel selectBookById(int id);
	public int updateQtyBookById(int qty,int id);
	public ArrayList<BookModel> selectAll();
}
