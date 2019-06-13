package it.sopra.uiip.Minichiello.bookShop;

import it.sopra.uiip.Minichiello.bookShop.dao.BookDao;
import it.sopra.uiip.Minichiello.bookShop.dao.impl.DefaultBookDao;
import it.sopra.uiip.Minichiello.bookShop.model.BookModel;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        BookDao b=new DefaultBookDao();
        
        //prima query
        System.out.println("INSERIMENTO BOOK id 27");
        if(b.insertBook(new BookModel(30,"titolo","io",12,12))) {
        	System.out.println("LIBRO INSERITO");
        	System.out.println("RISULTATO: SELEZIONARE TUTTI I LIBRI DOPO L'AGGIUNTA DI UN LIBRO");
            for(BookModel bb:b.selectAllBook()) {
            	System.out.println(bb.toString());
            }
        }else {
        	System.out.println("LIBRO NON INSERITO");
        }
        
        System.out.println("");
 
        //seconda query
        System.out.println("RISULTATO: SELEZIONARE UN LIBRO DATO L'ID");
        BookModel d=b.selectBookById(22);
        if(d!=null)
        	System.out.println(d.toString());
        else
        	System.out.println("LIBRO CON ID 22 NON ESISTE");
        System.out.println("");
        
        //terza query
        System.out.println("RISULTATO: AGGIORNAMENTO DELLA QUANTITA DI UN LIBRO PASSATO L'ID");
        if(b.UpdateQtyBookById(38, 23)) {
        	System.out.println("DOPO L'AGGIORNAMENTO");
            System.out.println(b.selectBookById(23).toString());
        }else {
        	System.out.println("LIBRO NON TROVATO");
        }
        
        //quarta query
        System.out.println("RISULTATO: SELEZIONARE TUTTI I LIBRI");
        for(BookModel bb:b.selectAllBook()) {
        	System.out.println(bb.toString());
        }
        System.out.println("");
        
    }
}
