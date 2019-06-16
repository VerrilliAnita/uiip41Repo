package it.sopra.uiip.Nisco.Viaggi;

import java.sql.Date;
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
    	VoloDao gestorevolo=new DefaultVoloDao();
    	PersonaDao gestorepersona=new DefaultPersonaDao();
    	CompagniaAereaDao gestorecompagnia= new DefaultCompagniaAereaDao();
    	PrenotazioneDao gestoreprenotazione=new DefaultPrenotazioneDao();
   
    	System.out.println("-----------------------------------------A-E-R-O-P-O-R-T-O-----------------------------------");
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
    
        	System.out.println("-----------------------------------------A-E-R-E-O-----------------------------------");
        // Insert Aereo
            
    		AereoModel aereo=new AereoModel("t400",290,90);
        	int esitoInsAe =gestoreAereo.insertAereo(aereo);
        	if(esitoInsAe == 1) {
        		System.out.println("Aereo inserito con successo");
        	}
        	else {
        		System.out.println("Aereo non inserito , riprovare");
        	}
    	// Select AereoBy Id
        	
        	AereoModel ricercaAereo = gestoreAereo.selectAereoByTipoAereo("A100");
        	if(ricercaAereo==null) {
        		System.out.println("Aereo non trovato , ID non corretto,riprovare");
        	}
        	else {
        		System.out.println(ricercaAereo);
        	}
        // Update Npass By Id
        	
        	int esitoUpAereo = gestoreAereo.updateNpassByTipoAereo("A100", 260);
        	if(esitoUpAereo == 1) {
        		System.out.println("Passegeri Aereo modificati con successo");
        	}
        	else {
        		System.out.println("Passegeri Aereo non  modificati, dati non corretti");
        		
        	}
       
System.out.println("-----------------------------------------VOLO-----------------------------------");
        //inset volo
        	
        		AeroportoModel aeroportoPart=gestoreAeroporto.selectAeroportoById(9);
        		AeroportoModel aeroportoArr=gestoreAeroporto.selectAeroportoById(2);
        		CompagniaAereaModel compagnia= gestorecompagnia.selectCompagniaAereaByid(1);
        		
        	
        		VoloModel volo=new VoloModel(100000,"lunedi",aeroportoPart,aeroportoArr,compagnia,18,20);
        	
        		
        		int esitoInsVolo=gestorevolo.insertVolo(volo);
        		
        	if(esitoInsVolo == 1) {
        		System.out.println("Volo inserito con successo");
        	}
        	else {
        		System.out.println("Volo non inserito , riprovare");
        	}
        	
        	// select volo
        	
        	ArrayList<VoloModel> ricercaVoli = gestorevolo.selectVoloByIdVolo(111111);
        	if(ricercaAereo==null) {
        		System.out.println("volo non trovato , ID non corretto,riprovare");
        	}
        	else {
        		for(VoloModel v : ricercaVoli) {
        			System.out.println(v);
        		}
        	}
        	
 System.out.println("-----------------------------------------COMPAGNIA-----------------------------------");    	
//InsertCOmpagnia
 	AereoModel tipoaereo= gestoreAereo.selectAereoByTipoAereo("f300");
	CompagniaAereaModel compagnianuova=new CompagniaAereaModel(10,"lowcost",tipoaereo);
	int esitoInsCA =gestorecompagnia.insertCompagniaAerea(compagnianuova);
	if(esitoInsCA == 1) {
		System.out.println("Compagnia inserita con successo");
	}
	else {
		System.out.println("Compagnia non inserita , riprovare");
	}
// Select COmpagnia by Id
	
	CompagniaAereaModel ricercacompagnia=gestorecompagnia.selectCompagniaAereaByid(7);
	if(ricercacompagnia==null) {
		System.out.println("Compagnia non trovata , ID non corretto,riprovare");
	}
	else {
		System.out.println(ricercaAereo);
	}
 
	 System.out.println("-----------------------------------------PERSONA-----------------------------------");    	
	//InsertPersona
	 	
	 	PersonaModel persona=new PersonaModel("wwwwwwwwwwwwwwww","willy","smith","1940-8-9");
		int esitoInsP =gestorepersona.insertPersona(persona);
		if(esitoInsP == 1) {
			System.out.println("Persona inserita con successo");
		}
		else {
			System.out.println("Persona non inserita , riprovare");
		}
	// Select Persona by Id

		PersonaModel ricercapersona=gestorepersona.selectPersonaByCodiceFiscale("AAAAAAAAAAAAAAAA");
		if(ricercapersona==null) {
			System.out.println("persoma non trovata , Cf non corretto,riprovare");
		}
		else {
			System.out.println(ricercapersona);
		}
		
	 System.out.println("-----------------------------------------PRENOTAZIONE-----------------------------------");    	

	
		//InsertPrenotazione
	 	
	 	PersonaModel passegero=gestorepersona.selectPersonaByCodiceFiscale("CCCCCCCCCCCCCCCC");
	 	VoloModel voloPrenotato=gestorevolo.selectVoloByIdVolo(111111).get(0);
	 	PrenotazioneModel prenotazione=new PrenotazioneModel(18,passegero,voloPrenotato);
		int esitoInsPre = gestoreprenotazione.insertPrenotazione(prenotazione);
		if(esitoInsPre == 1) {
			System.out.println("Prenotazione inserita con successo");
		}
		else {
			System.out.println("Prenotazione non inserita , riprovare");
		}
		
		// Select Prenotazione
		PrenotazioneModel ricercaprenotazione=gestoreprenotazione.selectPrenotazioneById(13);
		if(ricercaprenotazione==null) {
			System.out.println("Prenotazione non trovata , ID non corretto,riprovare");
		}
		else {
			System.out.println(ricercaprenotazione);
		}
	
	
    	
    }
}
