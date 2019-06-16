package it.sopra.uiip.ristaino;

import it.sopra.uiip.ristaino.dao.AereoDao;
import it.sopra.uiip.ristaino.dao.AeroportoDao;
import it.sopra.uiip.ristaino.dao.CompagniaDao;
import it.sopra.uiip.ristaino.dao.PasseggeroDao;
import it.sopra.uiip.ristaino.dao.PrenotazioneDao;
import it.sopra.uiip.ristaino.dao.VoloDao;
import it.sopra.uiip.ristaino.dao.impl.DefaulPasseggeroDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultAereoDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultCompagniaDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultPrenotazioneDao;
import it.sopra.uiip.ristaino.dao.impl.DefaultVoloDao;
import it.sopra.uiip.ristaino.model.AereoModel;
import it.sopra.uiip.ristaino.model.AeroportoModel;
import it.sopra.uiip.ristaino.model.CompagniaModel;
import it.sopra.uiip.ristaino.model.PasseggeroModel;
import it.sopra.uiip.ristaino.model.PrenotazioneModel;
import it.sopra.uiip.ristaino.model.VoloModel;

public class App 
{
    public static void main( String[] args )
    {
    	//Passeggero
    	PasseggeroModel passeggeroModel = new PasseggeroModel("CRMCRG45HTPLODTU", "Carmine", "Coraggio");
    	
    	PasseggeroDao passeggeroDao = new DefaulPasseggeroDao();
    	
    	int resultQuery = 0;
    	
    	//Inserimento nuovo passeggero
    	resultQuery = passeggeroDao.insertPasseggero(passeggeroModel);
    	System.out.println("--------- Inserimento Passeggero ----------");
    	if(resultQuery == 0)
    		System.out.println("Non è stato possibile inserire il passeggero nel database");
    	else
    		System.out.println("Il passeggero \n" +passeggeroModel +"\n è stato inserito correttamente nel database");
    
    	//Selezione passeggero per id
    	passeggeroModel = passeggeroDao.selectPasseggeroByCF("CRMCRG45HTPLODTU");
    	System.out.println("--------- Selezione Passeggero ----------");
    	if(passeggeroModel != null)
    		System.out.println(passeggeroModel);
    	else
    		System.out.println("Nessun passeggero individuato nel database con il codice fiscale prescelto");
    	
    	//Compagnia
    	CompagniaModel compagniaModel = new CompagniaModel("Air France", "Francia");
    	
    	CompagniaDao compagniaDao = new DefaultCompagniaDao();
    	
    	//Inserimento nuova compagnia
    	resultQuery = compagniaDao.insertCompagnia(compagniaModel);
    	System.out.println("--------- Inserimento Compagnia ----------");
    	if(resultQuery == 0)
    		System.out.println("Non è stato possibile inserire la compagnia nel database");
    	else
    		System.out.println("La compagnia \n" +compagniaModel +"\n è stata inserita correttamente nel database");
    
    	//Selezione compagnia per nome
    	compagniaModel = compagniaDao.selectCompagniaById("Air France");
    	System.out.println("--------- Selezione Compagnia ----------");
    	if(compagniaModel != null)
    		System.out.println(compagniaModel);
    	else
    		System.out.println("Nessuna compagnia individuata nel database con il nome specificato");
    	
    	//Test modifiche aereo
    	AereoModel aereoModel = new AereoModel("Airbus A340-300", 295, 0, compagniaModel);
    	
    	AereoDao aereoDao = new DefaultAereoDao();
    	
    	//Inserimento Aereo
    	resultQuery = aereoDao.insertAereo(aereoModel);
    	System.out.println("--------- Inserimento Aereo ----------");
    	if(resultQuery == 0)
    		System.out.println("Non è stato possibile inserire l'aereo nel database");
    	else
    		System.out.println("L'aereo \n" +aereoModel +"\n è stato inserito correttamente nel database");
    	
    	VoloDao voloDao = new DefaultVoloDao();
    	VoloModel voloModel = voloDao.selectVoloByIdAndGiorno(1, "lunedi");
    	System.out.println("--------- Selezione Volo ----------");
    	if(voloModel != null)
    		System.out.println(voloModel);
    	else
    		System.out.println("Nessun volo individuato nel database con l'id e il giorno specificato");
    	
    	//Prenotazione
    	PrenotazioneModel prenotazioneModel = new PrenotazioneModel(9, passeggeroModel, voloModel, 34.67f);
    	
    	PrenotazioneDao prenotazioneDao = new DefaultPrenotazioneDao();
    	
    	//Inserimento prenotazione
    	resultQuery = prenotazioneDao.insertPrenotazione(prenotazioneModel);
    	System.out.println("--------- Inserimento Prenotazione ----------");
    	if(resultQuery == 0)
    		System.out.println("Non è stato possibile inserire la prenotazione nel database");
    	else
    		System.out.println("La prenotazione \n" +prenotazioneModel +"\n è stata inserita correttamente nel database");
    	
    	//Selezione prenotazione
    	prenotazioneModel = prenotazioneDao.selectPrenotazioneById(9);
    	System.out.println("--------- Selezione Prenotazione ----------");
    	if(prenotazioneModel != null)
    		System.out.println(prenotazioneModel);
    	else
    		System.out.println("Nessuna prenotazione individuata nel database con l'id e il giorno specificato");
    	
    	
    }
}
