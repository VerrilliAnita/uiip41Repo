package it.sopra.uiip.Giso.Viaggi;

import java.util.ArrayList;

import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.Giso.Viaggi.dao.impl.DefaultVoloDao;
import it.sopra.uiip.Giso.Viaggi.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {		
    		DefaultAereoDao defaultAereoDao = new DefaultAereoDao();
    		
    		AereoModel aereo1 = new AereoModel("Airbus 740-355",154,15433);
    		
    		System.out.println("----TEST METODO insertAereo-------");
    		if(defaultAereoDao.insertAereo(aereo1) == 1)
    			System.out.println("Inserimento aereo effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'inserimento dell'aereo");
    		
    		System.out.println("------TEST METODO selectAereoByTipo-----" );
    		AereoModel result1 = defaultAereoDao.selectAereoByTipo("Boeing 747-9");
    		if (result1!=null)
    			System.out.println(result1.toString());
    		else
    			System.out.println("Aereo non presente nel DB");
    			

    		
    		System.out.println("------TEST METODO updateAereo-----" );
    		int nuovoNpass = 743;
    		if(defaultAereoDao.updateAereo("Boeing 747-9", nuovoNpass)==1)
    			System.out.println("Aggiornamento numero passeggeri dell'aereo effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'aggiornamento richiesto sul numero dei passeggeri dell'aereo");
    	
    		DefaultAeroportoDao defaultAeroportoDao = new DefaultAeroportoDao();
    		AeroportoModel aeroporto1 = new AeroportoModel(8,"NEW YORK CITY", "USA", 9);
    		
    		System.out.println("----TEST METODO insertAeroporto-------");
    		if(defaultAeroportoDao.insertAeroporto(aeroporto1) == 1)
    			System.out.println("Inserimento aeroporto effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'inserimento dell'aeroporto");
    			
    		System.out.println("----TEST METODO selectAeroportoById-----");
    		int idAeroporto1 = 3;
    		AeroportoModel result2 = defaultAeroportoDao.selectAereoportoById(idAeroporto1);
    		if(result2!=null)
    			System.out.println(result2.toString());
    		else
    			System.out.println("Aeroporto non presente nel DB");
    		
    		System.out.println("------TEST METODO updateAeroporto-----" );
    		int nuovoNpiste = 9;
    		int idAeroporto2 = 2;
    		if(defaultAeroportoDao.updateAeroporto(idAeroporto2, nuovoNpiste)==1)
    			System.out.println("Aggiornamento numero piste effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'aggiornamento richiesto");
    		
    		DefaultVoloDao defaultVoloDao = new DefaultVoloDao();
    		VoloModel volo1 = new VoloModel(2,"Venerdi",3,6,"Airbus 740-355",17,23);
    		
    		if(defaultVoloDao.insertVolo(volo1) == 1)
    			System.out.println("Inserimento del volo effettuato correttamente");
    		else
    			System.out.println("Impossibile effettuare l'inserimento del volo");
    		
    		System.out.println("----TEST METODO selectVoloById-----");
    		int idVolo = 1;
    		ArrayList<VoloModel> listaVoli = defaultVoloDao.selectVoloById(idVolo);
    		if(listaVoli!=null)
    			for (VoloModel volo : listaVoli) {
    				System.out.println(volo.toString());

				}
    		else
    			System.out.println("Volo non presente nel DB");
    		
    			
    }
}
