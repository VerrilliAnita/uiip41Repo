package it.sopra.uiip.Minichiello.Viaggi;

import java.util.ArrayList;

import it.sopra.uiip.Minichiello.Viaggi.dao.AereoDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.AeroportoDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.VoloDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.Minichiello.Viaggi.dao.impl.DefaultVoloDao;
import it.sopra.uiip.Minichiello.Viaggi.model.AereoModel;
import it.sopra.uiip.Minichiello.Viaggi.model.AeroportoModel;
import it.sopra.uiip.Minichiello.Viaggi.model.VoloModel;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args) {
		System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA AEROPORTO DAO");
		AeroportoDao aeroporto=new DefaultAeroportoDao();
		
		
		System.out.println(":::::::::::::OPERAZIONE INSERIMENTO AEROPORTO::::::::::");
		if(aeroporto.insertAeroporto(new AeroportoModel(10, "Avellino", "italia"))) {
			System.out.println("AEROPORTO AGGIUNTO");
		}else
			System.out.println("AEROPORTO NON AGGIUNGO");
		System.out.println("");
		
		System.out.println(":::::::::::::OPERAZIONE RICERCA AEROPORTO::::::::::");
		int idAeroportoRicerca=4;
		AeroportoModel aeroportoQuery=aeroporto.selectAeroportoById(idAeroportoRicerca);
	    if(aeroportoQuery!=null)
	    	System.out.println(aeroportoQuery.toString());
	    else
	        System.out.println("AEREOPORTO CON ID "+idAeroportoRicerca+" NON ESISTE");
	    System.out.println("");
	        
	   
		System.out.println(":::::::::::::OPERAZIONE UPDATE AEROPORTO::::::::::");
		int idAereoportoUpdate=10;
		if(aeroporto.updateNPisteAeroporto(idAereoportoUpdate, 20)) {
			System.out.println("AEROPORTO MODIFICATO");
		}else
			System.out.println("AEROPORTO CON ID"+idAereoportoUpdate+" NON MODIFICATO");
		System.out.println("");
		
		
		
		System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA AEREO DAO");
	    AereoDao aereo=new DefaultAereoDao();
	    
	    System.out.println(":::::::::::::OPERAZIONE INSERIMENTO AEREO::::::::::");
		if(aereo.insertAereo(new AereoModel("boing 1234", 300, 981256))) {
			System.out.println("AEREO AGGIUNTO");
		}else
			System.out.println("AEREO NON AGGIUNGO");
		System.out.println("");
		
		System.out.println(":::::::::::::OPERAZIONE RICERCA AEREO::::::::::");
		String tipoAereo="boing 1234";
		AereoModel aereoRis=aereo.selectAereoByType(tipoAereo);
	    if(aereoRis!=null)
	    	System.out.println(aereoRis.toString());
	    else
	        System.out.println("AEREO DI TIPO "+tipoAereo+" NON ESISTE");
	    System.out.println("");
		
	    System.out.println(":::::::::::::OPERAZIONE UPDATE AEREO::::::::::");
		String tipoAereoUpdate="boing 1234";
		if(aereo.updateNPostiByAereoModel(tipoAereoUpdate, 312)) {
			System.out.println("AEREO MODIFICATO");
		}else
			System.out.println("AEREO CON ID"+tipoAereoUpdate+" NON MODIFICATO");
		System.out.println("");
		
		
		System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA VOLO DAO");
	    VoloDao volo=new DefaultVoloDao();
	    AeroportoModel aeroporto1=aeroporto.selectAeroportoById(1);
	    AeroportoModel aeroporto2=aeroporto.selectAeroportoById(2);
	    
	    AereoModel aereoM=aereo.selectAereoByType("boing 1234");
	    
	    System.out.println(":::::::::::::OPERAZIONE INSERIMENTO VOLO::::::::::");
	    if(volo.insertVolo(new VoloModel(22, "lunedi", aeroporto1, aeroporto2, aereoM , 12, 23))){
	    	System.out.println("VOLO AGGIUNTO");
	    }else {
	    	System.out.println("VOLO NON AGGIUNGO");
	    }
	    
	    
		System.out.println(":::::::::::::OPERAZIONE RICERCA VOLO::::::::::");
		int idVolo=1;
		ArrayList<VoloModel> voli=volo.selectVoloById(idVolo);
	    if(voli.size()>0) {
	    	for(VoloModel v: voli) {
	    		System.out.println(v.toString());
	    	}
	    }else {
	        System.out.println("VOLO CON ID "+idVolo+" NON ESISTE");
	    }
	    System.out.println("");
		
	   
	}
}