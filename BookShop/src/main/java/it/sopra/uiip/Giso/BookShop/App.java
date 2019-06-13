package it.sopra.uiip.Giso.BookShop;

import java.util.ArrayList;

import it.sopra.uiip.Giso.BookShop.dao.impl.DefaultBookDao;
import it.sopra.uiip.Giso.BookShop.model.BookModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       DefaultBookDao q1 = new DefaultBookDao();
       
       BookModel book1 = new BookModel(6,"DDDDD","FFDFFF",21,2);
       
       q1.insertBook(book1);
       
       System.out.println("----------TEST SEARCHBYID--------");
       
       
       int id = 3;
       BookModel resSearchbyId = q1.selectBookById(id);
       if(resSearchbyId!=null) 
       System.out.println(resSearchbyId.toString());
       else
    	  System.out.println("ID non presente");
       
       System.out.println("----------TEST UPDATE--------");
       if(q1.setQuantity(9, 2) == 1)
          	System.out.println("Aggiornamento effettuato");
          else
       	   System.out.println("ID non presente");
       
    	   
       System.out.println("----------TEST ALLBOOKS--------");
       ArrayList<BookModel> lista = new ArrayList<BookModel>();
       lista = q1.allBooks();
       for (BookModel bookModel : lista) {
    	   System.out.println(bookModel.toString());
    	   
      
		
	}
       
       
    }
}
