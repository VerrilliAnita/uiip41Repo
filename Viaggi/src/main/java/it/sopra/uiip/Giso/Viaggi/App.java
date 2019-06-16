package it.sopra.uiip.Giso.Viaggi;

import java.util.ArrayList;

import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultCompagniaDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultPrenotazioneDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultProprietaDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultVoloDao;
import it.sopra.uiip.Giso.Viaggi.model.*;

public class App 
{
    public static void main( String[] args )
    
    {		
    	
    		DefaultAereoDao defaultAereoDao = new DefaultAereoDao();
    		
    		AereoModel aereo1 = new AereoModel("Airbus A330-230",154,15433);
    		
    		System.out.println("----TEST METODO insertAereo-------");
    		if(defaultAereoDao.insertAereo(aereo1) == 1)
    			System.out.println("Inserimento aereo effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'inserimento dell'aereo");
    		
    		System.out.println("\n------TEST METODO selectAereoByTipo-----" );
    		AereoModel resultAereo = defaultAereoDao.selectAereoByTipo("Airbus A330-200");
    		if (resultAereo!=null)
    			System.out.println(resultAereo.toString());
    		else
    			System.out.println("Aereo non presente nel DB");
    			

    		
    		System.out.println("\n------TEST METODO updateAereo-----" );
    		int nuovoNpass = 322;
    		if(defaultAereoDao.updateAereo("Boeing 747-400", nuovoNpass) ==1)
    			System.out.println("Aggiornamento numero passeggeri dell'aereo effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'aggiornamento richiesto sul numero dei passeggeri dell'aereo");
    	
    		DefaultAeroportoDao defaultAeroportoDao = new DefaultAeroportoDao();
    		AeroportoModel aeroporto1 = new AeroportoModel(9,"NEW YORK CITY", "USA", 7);
    		
    		System.out.println("\n----TEST METODO insertAeroporto-------");
    		if(defaultAeroportoDao.insertAeroporto(aeroporto1) == 1)
    			System.out.println("Inserimento aeroporto effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'inserimento dell'aeroporto");
    			
    		System.out.println("\n----TEST METODO selectAeroportoById-----");
    		int idAeroporto1 = 3;
    		AeroportoModel result2 = defaultAeroportoDao.selectAereoportoById(idAeroporto1);
    		if(result2!=null)
    			System.out.println(result2.toString());
    		else
    			System.out.println("Aeroporto non presente nel DB");
    		
    		System.out.println("\n------TEST METODO updateAeroporto-----" );
    		int nuovoNpiste = 7;
    		int idAeroporto2 = 2;
    		if(defaultAeroportoDao.updateAeroporto(idAeroporto2, nuovoNpiste)==1)
    			System.out.println("Aggiornamento numero piste effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'aggiornamento richiesto");
    			
    		
    		DefaultVoloDao defaultVoloDao = new DefaultVoloDao();
    		VoloModel volo1 = new VoloModel(12,"Venerdi",3,6,"Airbus A330-200","Turkish Airlines",17,23);
    		System.out.println("\n-----TEST METODO insertVolo-------");
    		if(defaultVoloDao.insertVolo(volo1) == 1)
    			System.out.println("Inserimento del volo effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'inserimento del volo");
    		
    		System.out.println("\n----TEST METODO selectVoloById-----");
    		int idVolo = 8;
    		ArrayList<VoloModel> listaVoli = defaultVoloDao.selectVoloById(idVolo);
    		if(listaVoli.isEmpty())
    			System.out.println("Volo non presente nel DB");
    		else {
    			for (VoloModel volo : listaVoli) {
    				System.out.println(volo.toString());

				}
    		}
    		
    	
    			
    	DefaultCompagniaDao defaultCompagniaDao = new DefaultCompagniaDao();
    	CompagniaModel compagnia = new CompagniaModel("Fly Emirates","Emirati Arabi");
    	System.out.println("\n------TEST METODO insertCompagnia");
    	if(defaultCompagniaDao.insertCompagnia(compagnia) ==1)
    		System.out.println("Inserimento effettuato correttamente");
    	else
    		System.out.println("Impossibile effettuare l'inserimento");
    	
    	System.out.println("\n------TEST METODO selectCompagniaByName-----" );
    	String nomeCompagnia = "Lufthansa";
		CompagniaModel resultCompagnia = defaultCompagniaDao.selectCompagniaByName(nomeCompagnia);
		if (resultCompagnia!=null)
			System.out.println(resultCompagnia.toString());
		else
			System.out.println("Compagnia non presente nel DB");
		
		DefaultProprietaDao defaultProprietaDao = new DefaultProprietaDao();
		ProprietaModel proprieta = new ProprietaModel("Alitalia", "Boeing 747-400");
		System.out.println("\n------TEST METODO insertProprieta");
		if(defaultProprietaDao.insertProprieta(proprieta) == 1)
    		System.out.println("Inserimento effettuato correttamente");
    	else
    		System.out.println("Impossibile effettuare l'inserimento");
		
		System.out.println("\n------TEST METODO selectAereiByCompagnia-----" );
    	String nomCompagnia = "AirFrance";
    	ArrayList<String> listaAerei = defaultProprietaDao.selectAereiByCompagnia(nomCompagnia);
    	if(listaAerei.isEmpty()) 
    		System.out.println("Nessun aereo presente nel DB per la compagnia scelta");
    	else {
    		System.out.println("Lista aerei per la compagnia: "+nomCompagnia);
    		for (String aereo : listaAerei) {
				System.out.println(aereo.toString());
			}
    	}
    	
    	DefaultPrenotazioneDao defaultPrenotazioneDao = new DefaultPrenotazioneDao();
    	PrenotazioneModel prenotazione = new PrenotazioneModel(15,"RSSFRN97L55N31O9","Francesco","Rossi",7);
    	System.out.println("\n----TEST METODO insertPrenotazione-----");
    	if(defaultPrenotazioneDao.insertPrenotazione(prenotazione) == 1)
    		System.out.println("Inserimento effettuato correttamente");
    	else
    		System.out.println("Impossibile effettuare l'inserimento");
    	
    	System.out.println("\n-------TEST METODO selectPrenotazioneById");
    	int id = 6;
    	PrenotazioneModel resultPrenotazione = defaultPrenotazioneDao.selectPrenotazioneById(id);
    	if(resultPrenotazione!=null)
    		System.out.println(resultPrenotazione.toString());
    	else 
    		System.out.println("Nessuna presentazione presente nel DB per l'id scelto");
    	
    	
    		
    			
    }
}
