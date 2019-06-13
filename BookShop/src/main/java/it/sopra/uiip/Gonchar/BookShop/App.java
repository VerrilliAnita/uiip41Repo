package it.sopra.uiip.Gonchar.BookShop;

import it.sopra.uiip.Gonchar.BookShop.dao.impl.DefoultBookDao;
import it.sopra.uiip.Gonchar.BookShop.model.BookModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 
    	
    	BookModel  book1 = new BookModel (2, "vita", "gonchar", 15, 5 );
    	DefoultBookDao dbd = new DefoultBookDao();
    	dbd.insertBookModel(book1);
    	System.out.println();
    	
    }
}
