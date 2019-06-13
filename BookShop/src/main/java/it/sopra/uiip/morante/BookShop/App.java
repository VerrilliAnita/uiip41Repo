package it.sopra.uiip.morante.BookShop;

import java.util.ArrayList;

import it.sopra.uiip.morante.BookShop.dao.impl.DeafaultBookDao;
import it.sopra.uiip.morante.BookShop.model.BookModel;

public class App {

	public static void main( String[] args ){

		DeafaultBookDao dbd = new DeafaultBookDao();

		//test insert book
		System.out.println("\nTest Insert");
		int ris = dbd.insertBookModel(new BookModel(15, "La voce del violino", "Camilleri", 12, 2));
		if(ris == 1)
			System.out.println("Inserimento andato a buon fine");
		else
			System.out.println("Inserimento fallito");
		
		//test select all
		System.out.println("\nTest Select all");
		ArrayList<BookModel> libri = dbd.selectAllBookModel();
		for(BookModel bm : libri)
			System.out.println(bm.toString());

		//test update
		System.out.println("\nUpdate");
		int risultato = dbd.updateQuantity(2, 4);
		if(risultato == 1)
			System.out.println("Aggiornamento andato a buon fine");
		else
			System.out.println("Aggiornamento fallito");

		//test select per id
		System.out.println("\nSelect per id");
		BookModel result = dbd.selectBookModel(2);
		if(result != null)
			System.out.println(result.toString());
		else
			System.out.println("Libro con questo id non esiste");

	}
}
