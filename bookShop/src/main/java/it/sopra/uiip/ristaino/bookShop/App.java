package it.sopra.uiip.ristaino.bookShop;

import java.util.ArrayList;

import it.sopra.uiip.ristaino.bookShop.dao.BookDao;
import it.sopra.uiip.ristaino.bookShop.dao.impl.DefaultBookDao;
import it.sopra.uiip.ristaino.bookShop.model.BookModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	BookDao defaultBookDao = new DefaultBookDao();
        
    	//Inserimento
    	int resultInsert = defaultBookDao.insertBook(new BookModel(6, "La piccola guerra", "Arthur Morgan", 15.88f, 3));
    	if(resultInsert == 0) System.out.println("Non è stato possibile inserire il libro nel database...");
    	else System.out.println("Libro inserito correttamente nel database");
    	
    	
    	//Trova un libro
    	BookModel bookModel = defaultBookDao.selectBookById(6);
    	if(bookModel != null)
    		System.out.println(bookModel);
    	else
    		System.out.println("Non è stato trovato alcun libro");
    	
    	//modifica la quantità
    	int result = defaultBookDao.setBookQuantity(9, 6);
    	if(result == 0) System.out.println("Non è stato trovato nessun libro per l'aggiornamento.");
    	else System.out.println("La quantità del libro è stata aggiornata");
    	
    	//Lista dei libri
    	ArrayList<BookModel> books = defaultBookDao.getBooks();
    	
    	if(books.isEmpty()) System.out.println("Non ci sono libri nel database...");
    	else {
    		System.out.println("---------- Lista libri --------");
	    	for(BookModel bm : books) {
	    		System.out.println(bm);
	    	}
    	}
    	
    }
}
