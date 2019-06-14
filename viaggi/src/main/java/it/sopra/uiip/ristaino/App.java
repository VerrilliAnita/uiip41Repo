package it.sopra.uiip.ristaino;

import java.util.ArrayList;

import it.sopra.uiip.ristaino.dao.AereoDao;
import it.sopra.uiip.ristaino.dao.AeroportoDao;
import it.sopra.uiip.ristaino.dao.VoloDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultAereoDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultVoloDao;
import it.sopra.uiip.ristaino.model.AereoModel;
import it.sopra.uiip.ristaino.model.AeroportoModel;
import it.sopra.uiip.ristaino.model.VoloModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AereoDao aereoDao = new DefaultAereoDao();
    	
    	//Test Aereo DOA
    	AereoModel aereoModel = new AereoModel("jet-747", 10, 1);
    	
    	int resultQuery = 0;
    	
    	//Inserimento aereo
    	resultQuery = aereoDao.insertAereo(aereoModel);
    	if(resultQuery == 0)
    		System.out.println("Non è stato possibile inserire l'aereo nel database");
    	else
    		System.out.println("Aereo inserito correttamente nel database");
    	
    	//Seleziona aereo per tipo
    	aereoModel = aereoDao.selectAereoByTipoAereo("jet-747");
    	if(aereoModel != null)
    		System.out.println(aereoModel);
    	else
    		System.out.println("Non è stato trovato nessun aereo del tipo richiesto");
    	
    	//Aggiorna il numero di posti di un aereo
    	resultQuery = aereoDao.updateNpass("jet-747", 15);
    	if(resultQuery == 0) 
    		System.out.println("Non è stato possibile modificare il numero id posti del tipo di aereo richiesto");
    	else
    		System.out.println("Il numero dei posti del tipo di aereo richiesto è stato aggiornato");
    	
    	//Test Aeroporto DAO
    	AeroportoDao aeroportoDao = new DefaultAeroportoDao();
    	
    	AeroportoModel aeroportoModel = new AeroportoModel(9, "Amsterdam", "Olanda", 6);
    	
    	//Inserimento aeroporto
    	resultQuery = aeroportoDao.insertAeroporto(aeroportoModel);
    	if(resultQuery == 0) 
    		System.out.println("Non è stato possibile inserire l'aeroporto nel database");
    	else
    		System.out.println("L'aeroporto è stato inserito correttamente nel database");
    	
    	//Seleziona aeroporto in base all'id
    	aeroportoModel = aeroportoDao.selectAeroportoById(1);
    	if(aeroportoModel != null)
    		System.out.println(aeroportoModel);
    	else
    		System.out.println("Non è stato trovato nessun aeroporto con l'id specificato");
    	
    	//Aggiornamento piste
    	resultQuery = aeroportoDao.updateNpiste(aeroportoModel, 3);
    	if(resultQuery == 0) 
    		System.out.println("Non è stato possibile aggiornare il numero di piste per l'aeroporto specificato");
    	else
    		System.out.println("Il numero di piste dell'aeroporto richiesto è stato aggiornato correttamente nel database");
    	
    	//Test Volo DAO
    	VoloDao voloDao = new DefaultVoloDao();
    	
    	AeroportoModel aeroportoPartenza = aeroportoDao.selectAeroportoById(5);
    	AeroportoModel aeroportoArrivo = aeroportoDao.selectAeroportoById(7);
    	aereoModel = aereoDao.selectAereoByTipoAereo("Airbus A340-300");
    	
    	VoloModel voloModel = new VoloModel(12, "mercoledi", aeroportoPartenza, aeroportoArrivo, aereoModel, 12, 18);
    	
    	//Inserimento volo
    	resultQuery = voloDao.insertVolo(voloModel);
    	if(resultQuery == 0) 
    		System.out.println("Non è stato possibile inserire il volo nel database");
    	else
    		System.out.println("Il volo è stato inserito correttamente nel database");
    	
    	//Select volo
    	ArrayList<VoloModel> listaVoliById = voloDao.selectVoloById(1);
    	if(listaVoliById.isEmpty())
    		System.out.println("Non è stato trovato alcun volo con l'id richiesto");
    	else {
    		System.out.println("--------------- Lista Voli Per Id -------------");
    		for(VoloModel volo : listaVoliById)
    			System.out.println(volo);
    	}
    }
}
