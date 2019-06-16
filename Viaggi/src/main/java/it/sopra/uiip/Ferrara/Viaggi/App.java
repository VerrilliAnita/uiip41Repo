package it.sopra.uiip.Ferrara.Viaggi;

import java.util.ArrayList;

import it.sopra.uiip.Ferrara.Viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.Ferrara.Viaggi.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.Ferrara.Viaggi.dao.impl.DefaultCompagniaDao;
import it.sopra.uiip.Ferrara.Viaggi.dao.impl.DefaultPrenotazioneDao;
import it.sopra.uiip.Ferrara.Viaggi.dao.impl.DefaultProprietaDao;
import it.sopra.uiip.Ferrara.Viaggi.dao.impl.DefaultVoloDao;
import it.sopra.uiip.Ferrara.Viaggi.model.AereoModel;
import it.sopra.uiip.Ferrara.Viaggi.model.AeroportoModel;
import it.sopra.uiip.Ferrara.Viaggi.model.CompagniaModel;
import it.sopra.uiip.Ferrara.Viaggi.model.PrenotazioneModel;
import it.sopra.uiip.Ferrara.Viaggi.model.ProprietaModel;
import it.sopra.uiip.Ferrara.Viaggi.model.VoloModel;

public class App {
	
    public static void main( String[] args ) {
    	
    	//TEST Metodi Aereo
    	
    	DefaultAereoDao defaultAereoDao = new DefaultAereoDao();

		AereoModel newAereo = new AereoModel("Boeing745-288", 500, 200);

		System.out.println("----TEST Metodo insertAereo-------");
		if(defaultAereoDao.insertAereo(newAereo) == 1)
			System.out.println("Inserimento aereo eseguito correttamente");
		else
			System.out.println("Impossibile eseguire l'inserimento dell'aereo");

		
		System.out.println("\n------TEST Metodo selectAereoByTipo-----" );
		AereoModel aereo = defaultAereoDao.selectAereoByTipo("AirbusA340-500");
		if (aereo!=null)
			System.out.println(aereo.toString());
		else
			System.out.println("Aereo non presente nel DataBase");
		
		
		System.out.println("\n------TEST Metodo updateAereo-----" );
		int newNpass = 600;
		if(defaultAereoDao.updateAereo("Boeing777-300", newNpass) == 1)
			System.out.println("Aggiornamento dei numero passeggeri dell'aereo eseguito correttamente");
		else
			System.out.println("Impossibile eseguire l'aggiornamento riguardo al numero dei passeggeri dell'aereo richiesto");
		
		System.out.println("\n-------------------------------------------");
		
		
		//TEST Metodi Aeroporto
		
		DefaultAeroportoDao defaultAeroportoDao = new DefaultAeroportoDao();
		
		AeroportoModel newAeroporto = new AeroportoModel(8,"Dubai", "Emirati Arabi Uniti", 23);
		
		System.out.println("\n----TEST Metodo insertAeroporto-------");
		if(defaultAeroportoDao.insertAeroporto(newAeroporto) == 1)
			System.out.println("Inserimento aeroporto eseguito correttamente");
		else
			System.out.println("Impossibile eseguire l'inserimento dell'aeroporto");

		
		System.out.println("\n----TEST Metodo selectAeroportoById-----");
		int idAeroporto = 5;
		AeroportoModel aeroporto = defaultAeroportoDao.selectAereoportoById(idAeroporto);
		if(aeroporto!=null)
			System.out.println(aeroporto.toString());
		else
			System.out.println("Aeroporto non presente nel DataBase");

		
		System.out.println("\n------TEST Metodo updateAeroporto-----" );
		int newNpiste = 10;
		int idAeroporto2 = 5;
		if(defaultAeroportoDao.updateAeroporto(idAeroporto2, newNpiste) == 1)
			System.out.println("Aggiornamento numero piste eseguito correttamente");
		else
			System.out.println("Impossibile eseguire l'aggiornamento richiesto");
		
		System.out.println("\n-------------------------------------------");
		
		
		//TEST Metodi Volo
		
		DefaultVoloDao defaultVoloDao = new DefaultVoloDao();
		
		VoloModel newVolo = new VoloModel(8,"Domenica",4,6,"Boeing777-6",18,21);
		
		System.out.println("\n-----TEST Metodo insertVolo-------");
		if(defaultVoloDao.insertVolo(newVolo) == 1)
			System.out.println("Inserimento del volo eseguito correttamente");
		else
			System.out.println("Impossibile eseguire l'inserimento del volo");
		

		System.out.println("\n----TEST Metodo selectVoloById-----");
		int idVolo = 7;
		ArrayList<VoloModel> listaVoli = defaultVoloDao.selectVoloById(idVolo);
		if(listaVoli.isEmpty())
			System.out.println("Volo non presente nel DataBase");
		else {
			for (VoloModel volo : listaVoli) {
				System.out.println(volo.toString());

			}
		}
		
		System.out.println("\n-------------------------------------------");
		
		
		//TEST Metodi Compagnia
		
		DefaultCompagniaDao defaultCompagniaDao = new DefaultCompagniaDao();
		
    	CompagniaModel newCompagnia = new CompagniaModel("Lufthansa","Germania");
    	
    	System.out.println("\n------TEST Metodo insertCompagnia-----");
    	if(defaultCompagniaDao.insertCompagnia(newCompagnia) == 1)
    		System.out.println("Inserimento eseguito correttamente");
    	else
    		System.out.println("Impossibile eseguire l'inserimento");
    	
    	

    	System.out.println("\n------TEST Metodo selectCompagniaByName-----");
    	String nomeCompagnia = "Fly Emirates";
		CompagniaModel Compagnia = defaultCompagniaDao.selectCompagniaByName(nomeCompagnia);
		if (Compagnia!=null)
			System.out.println(Compagnia.toString());
		else
			System.out.println("Compagnia non presente nel DataBase");
		
		System.out.println("\n-------------------------------------------");
		
		
		
		//TEST Metodi Proprietà
		
		DefaultProprietaDao defaultProprietaDao = new DefaultProprietaDao();
		
		ProprietaModel proprieta = new ProprietaModel("Lufthansa", "AirbusA270-300");
		
		System.out.println("\n------TEST Metodo insertProprieta");
		if(defaultProprietaDao.insertProprieta(proprieta) == 1)
    		System.out.println("Inserimento eseguito correttamente");
    	else
    		System.out.println("Impossibile eseguire l'inserimento");
		

		System.out.println("\n------TEST Metodo selectAereiByCompagnia-----" );
    	String nomeCompagnia1 = "Easyjet";
    	ArrayList<String> listaAerei = defaultProprietaDao.selectAereiByCompagnia(nomeCompagnia1);
    	if(listaAerei.isEmpty()) 
    		System.out.println("Nessun aereo presente nel DataBase corrispondente alla compagnia scelta");
    	else {
    		System.out.println("Lista aerei corrispondente alla compagnia scelta: "+nomeCompagnia1);
    		for (String aereo1 : listaAerei) {
				System.out.println(aereo1.toString());
			}
    	}
    	
    	System.out.println("\n-------------------------------------------");
    	
    	
    	//TEST Metodi Prenotazione
    	
    	DefaultPrenotazioneDao defaultPrenotazioneDao = new DefaultPrenotazioneDao();
    	
    	PrenotazioneModel prenotazione = new PrenotazioneModel(23, "MRORSS90T15A415T", "Mario", "Rossi", 1);
    	
    	System.out.println("\n----TEST Metodo insertPrenotazione-----");
    	if(defaultPrenotazioneDao.insertPrenotazione(prenotazione) == 1)
    		System.out.println("Inserimento eseguito correttamente");
    	else
    		System.out.println("Impossibile eseguire l'inserimento");
    	

    	System.out.println("\n-------TEST Metodo selectPrenotazioneById");
    	int id = 2;
    	PrenotazioneModel Prenotazione = defaultPrenotazioneDao.selectPrenotazioneById(id);
    	if(Prenotazione!=null)
    		System.out.println(Prenotazione.toString());
    	else 
    		System.out.println("Nessuna presentazione presente nel DataBase corrispondente all'id scelto");

    }
    
    
    	
}
