package it.sopra.uiip.Nisco.BookShop;

import it.sopra.uiip.Nisco.BookShop.dao.BookDao;
import it.sopra.uiip.Nisco.BookShop.dao.impl.DefaultBookDao;
import it.sopra.uiip.Nisco.BookShop.model.BookModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BookDao bk=new DefaultBookDao();
       
       //Insert
       		BookModel b=new BookModel(9,"iiiii","Bautore",19,2);
       		bk.insertBook(b);
       
       //Select by ID
       		BookModel r=bk.selectBookById(10);
       	if(r==null) {
       		System.out.println("Errore Ricerca: ID inserito non presente nel database");
       	}
       	else {
       		System.out.println(r);
       	}
      
       //Update qty by Id
       		int es=bk.updateQtyBookById(11, 16);
       		if(es==0) {
       			System.out.println("Errore Aggiornamento Qty: ID inserito non presente nel database");
       		}
       
       	//Select * from book
       		for(BookModel a: bk.selectAll()) {
       			System.out.println(a);
       		}
       
       
    }
}
