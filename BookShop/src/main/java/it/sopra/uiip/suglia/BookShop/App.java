package it.sopra.uiip.suglia.BookShop;

import java.util.ArrayList;

import it.sopra.uiip.suglia.BookShop.dao.BookDao;
import it.sopra.uiip.suglia.BookShop.dao.impl.DefaulBookDao;
import it.sopra.uiip.suglia.BookShop.model.BookModel;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ){
        ArrayList<BookModel> listaLibri = new ArrayList<BookModel>();
        BookDao q1 = new DefaulBookDao();
    	BookModel b1 = new BookModel(13, "Medicina", "Nisco", 3, 4);
    	
    	//Selezione di un libro
    	System.out.println("Selezione del libro\n" + q1.selectBookbyId(1).toString()+ "\n");
 
    	//Inserimento di un libro
    	System.out.println("---Iserimento di un libro---");
    	int inserimento = q1.insertBook(b1);
    	if(inserimento==1) {
    		System.out.println("L'inserimento è andato a buon fine");
    	}else {
    		System.out.println("Il libro non è stato inserito");
    	}
    	
    	//Aggiornamento quantità
    	System.out.println("\n---Aggiornamento di un libro---");
    	int aggiorna = q1.aggiornaQtyLibro(4, 12);
    	if(aggiorna==1) {
    		System.out.println("L'aggiornamento è andato a buon fine");
    	}else {
    		System.out.println("L'aggiornameto non è stato effettuato");
    	}
    	
    	//Lista libri
    	System.out.println("\n---LISTA LIBRI AGGIORNATA---");
    	listaLibri=q1.selectLibri();
    	for (int i = 0; i < listaLibri.size(); i++) {
    		System.out.println(listaLibri.get(i).toString());
		}
    	
    
    	
    }
}
