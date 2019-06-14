package it.sopra.uiip.Nisco.Viaggi;

import java.util.ArrayList;

import it.sopra.uiip.Nisco.Viaggi.dao.*;
import it.sopra.uiip.Nisco.Viaggi.dao.impls.*;
import it.sopra.uiip.Nisco.Viaggi.model.*;

public class App 
{
    public static void main( String[] args )
    {	
    	AeroportoDao gestoreAeroporto=new DefaultAeroportoDao();
    	AereoDao gestoreAereo=new DefaultAereoDao();
   
       
       // Insert Aereoporto
        
    		AeroportoModel aeroporto=new AeroportoModel(9,"Napoli","Italia");
        	int esitoIns =gestoreAeroporto.insertAeroporto(aeroporto);
        	if(esitoIns == 1) {
        		System.out.println("Aeroporto inserito con successo");
        	}
        	else {
        		System.out.println("Aeroporto non inserito , riprovare");
        	}
    	// Select Aereoporto By Id
        	
        	AeroportoModel ricerca = gestoreAeroporto.selectAeroportoById(9);
        	if(ricerca==null) {
        		System.out.println("Aeroporto non trovato , ID non corretto,riprovare");
        	}
        	else {
        		System.out.println(ricerca);
        	}
        // Update Npiste By Id
        	
        	int esitoUp = gestoreAeroporto.updateNpisteById(9, 8);
        	if(esitoUp == 1) {
        		System.out.println("Piste Aeroporto modificate con successo");
        	}
        	else {
        		System.out.println("Aeroporto non presente,operazione annullata");
        	}
    	
        // Insert Aereo
            
    		AereoModel aereo=new AereoModel("AirChina",220,90);
        	int esitoInsAe =gestoreAereo.insertAereo(aereo);
        	if(esitoInsAe == 1) {
        		System.out.println("Aereo inserito con successo");
        	}
        	else {
        		System.out.println("Aereo non inserito , riprovare");
        	}
    	// Select AereoBy Id
        	
        	AereoModel ricercaAereo = gestoreAereo.selectAereoByTipoAereo("Iberia333");
        	if(ricercaAereo==null) {
        		System.out.println("Aereo non trovato , ID non corretto,riprovare");
        	}
        	else {
        		System.out.println(ricercaAereo);
        	}
        // Update Npiste By Id
        	
        	int esitoUpAereo = gestoreAereo.updateNpassByTipoAereo("Alitalia", 260);
        	if(esitoUpAereo == 1) {
        		System.out.println("Passegeri Aereo modificati con successo");
        	}
        	else {
        		System.out.println("Passegeri Aereo non  modificati, dati non corretti");
        	}
        //inset volo
        	VoloDao gestorevolo=new DefaultVoloDao();
        		AeroportoModel aeroportoPart=gestoreAeroporto.selectAeroportoById(9);
        		AeroportoModel aeroportoArr=gestoreAeroporto.selectAeroportoById(2);
        		
        		AereoModel aereoV= gestoreAereo.selectAereoByTipoAereo("Iberia333");
        	
        		VoloModel volo=new VoloModel(100000,"lunedi",aeroportoPart,aeroportoArr,aereoV,18,20);
        	
        		
        		int esitoInsVolo=gestorevolo.insertVolo(volo);
        		
        	if(esitoInsVolo == 1) {
        		System.out.println("Volo inserito con successo");
        	}
        	else {
        		System.out.println("Volo non inserito , riprovare");
        	}
        	
        	// select volo
        	
        	ArrayList<VoloModel> ricercaVoli = gestorevolo.selectVoloByIdVolo(101010);
        	if(ricercaAereo==null) {
        		System.out.println("volo non trovato , ID non corretto,riprovare");
        	}
        	else {
        		for(VoloModel v : ricercaVoli) {
        			System.out.println(v);
        		}
        	}
        	
        	
        
    	
    }
}
