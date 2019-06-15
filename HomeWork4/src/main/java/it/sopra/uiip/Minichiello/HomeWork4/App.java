package it.sopra.uiip.Minichiello.HomeWork4;

import java.util.ArrayList;

import it.sopra.uiip.Minichiello.HomeWork4.dao.*;
import it.sopra.uiip.Minichiello.HomeWork4.dao.impl.*;
import it.sopra.uiip.Minichiello.HomeWork4.model.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
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
		
		
		//nuove funzionalita
		
		System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA COMPAGNIA DAO");
	    CompagniaDao compagnia=new DefaultCompagniaDao();
	    
	    System.out.println(":::::::::::::OPERAZIONE INSERIMENTO COMPAGNIA::::::::::");
		if(compagnia.insertCompagnia(new CompagniaModel(10, "compagniaNuova"))) {
			System.out.println("COMPAGNIA AGGIUNTA");
		}else
			System.out.println("COMPAGNIA NON AGGIUNTA");
		System.out.println("");
		
		System.out.println(":::::::::::::OPERAZIONE RICERCA COMPAGNIA::::::::::");
		int idCompagnia=1;
		CompagniaModel compagniaRis=compagnia.searchCompagniaById(idCompagnia);
	    if(compagniaRis!=null)
	    	System.out.println(compagniaRis.toString());
	    else
	        System.out.println("COMPAGNIA CON ID "+idCompagnia+" NON ESISTE");
	    System.out.println("");
		
	    
	    //nuove funzionalita
	    System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA VIAGGIATORE DAO");
	    ViaggiatoreDao viaggiatore=new DefaultViaggiatoreDao();
	    
	    System.out.println(":::::::::::::OPERAZIONE INSERIMENTO VIAGGIATORE::::::::::");
		if(viaggiatore.insertViaggiatore(new ViaggiatoreModel("codicefiscale", "nuovoNome", "nuovoCognome"))) {
			System.out.println("VIAGGIATORE AGGIUNTO");
		}else
			System.out.println("VIAGGIATORE NON AGGIUNTO");
		System.out.println("");
		
		System.out.println(":::::::::::::OPERAZIONE RICERCA VIAGGIATORE::::::::::");
		String cf="cf2";
		ViaggiatoreModel viaggiatoreRis=viaggiatore.searchViaggiatoreById(cf);
	    if(viaggiatoreRis!=null)
	    	System.out.println(viaggiatoreRis.toString());
	    else
	        System.out.println("VIAGGIATORE CON CODICE FISCALE "+cf+" NON ESISTE");
	    System.out.println("");
		
		
		
		System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA VOLO DAO");
	    VoloDao volo=new DefaultVoloDao();
	    AeroportoModel aeroporto1=aeroporto.selectAeroportoById(1);
	    AeroportoModel aeroporto2=aeroporto.selectAeroportoById(2);
	    CompagniaModel compagnia2=compagnia.searchCompagniaById(1);
	    AereoModel aereoM=aereo.selectAereoByType("boing 1234");
	    
	    System.out.println(":::::::::::::OPERAZIONE INSERIMENTO VOLO::::::::::");
	    if(volo.insertVolo(new VoloModel(22, "lunedi", aeroporto1, aeroporto2, aereoM ,compagnia2, 12, 23))){
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
	    
	  //nuove funzionalita
	    System.out.println("VERIFICA DELLE FUNZIONALITA DELL'INTERFACCIA PRENOTAZIONE DAO");
	    PrenotazioneDao prenotazione=new DefaultPrenotazioneDao();
	    VoloModel volo2=volo.selectVoloById(1).get(0);
	    ViaggiatoreModel viaggiatore2=viaggiatore.searchViaggiatoreById("cf2");
	    System.out.println(":::::::::::::OPERAZIONE INSERIMENTO PRENOTAZIONE::::::::::");
		if(prenotazione.insertPrenotazione(new PrenotazioneModel(10, volo2, viaggiatore2))) {
			System.out.println("PRENOTAZIONE AGGIUNTA");
		}else
			System.out.println("PRENOTAZIONE NON AGGIUNTA");
		System.out.println("");
		
		System.out.println(":::::::::::::OPERAZIONE RICERCA PRENOTAZIONE::::::::::");
		int idPrenotazione=1;
		PrenotazioneModel prenotazioneRis=prenotazione.searchPrenotazioneById(idPrenotazione);
	    if(prenotazioneRis!=null)
	    	System.out.println(prenotazioneRis.toString());
	    else
	        System.out.println("PRENOTAZIONE CON ID "+idPrenotazione+" NON ESISTE");
	    System.out.println("");
		
    }

}
