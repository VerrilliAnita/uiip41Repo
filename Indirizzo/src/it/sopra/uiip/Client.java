package it.sopra.uiip;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		
		ArrayList<Studente> listaStudenti = new ArrayList<Studente>();
		ArrayList<Studente> listaStudentiFormazione = new ArrayList<Studente>();

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		ArrayList<Persona> listaCampania = null;

		
		Indirizzo iDanilo = new Indirizzo("Via dei Santini",15,"Cesinali",83020,"Avellino","Campania");
		Indirizzo iSuglia = new Indirizzo("Via Roma", 23, "Montecalvo", 83037, "Avellino", "Campania");

		Persona danilo = new Persona("Danilo","Ferrara",iDanilo);
		Persona morich = new Persona("Emanuele", "Morante", new Indirizzo("Atlantici", 16, "Benevento", 82100, "BN", "Campania"));
		Persona suglia = new Persona("Pompilio", "Suglia", iSuglia);

		Studente studSuglia = new Studente(suglia.getNome(), suglia.getCognome(),suglia.getIndirizzo(),1,"Ingegneria Edile");
		System.out.println(studSuglia.toString());
		
		
		System.out.println(danilo.toString());
		System.out.println(morich.toString());
		System.out.println(suglia.toString());
	
		
		System.out.println(suglia.toString());
		
		
		listaPersone.add(danilo);
		listaPersone.add(morich);
		listaPersone.add(suglia);
		
		ArrayList<Persona> listaResidenti;
		listaResidenti = ResidentiCampaniaFerrara.trovaResidentiCampania(listaPersone);
		
		for(int j=0;j<listaResidenti.size();j++) {
			System.out.println(listaResidenti.get(j).toString());
		}

		
		listaCampania=ResidentiCampaniaSuglia.trovaResidentiCampania(listaPersone);
		
		System.out.println("LISTA PERSONE CAMPANIA");
		for (int j = 0; j < listaCampania.size(); j++) {
			System.out.println(listaCampania.get(j).toString());
		}
		
		
		
		
		ArrayList<Persona>listaCampaniaMorante = ResidentiCampaniaMorante.trovaResidentiCampania(listaPersone);
		
		
		System.out.println("\n------Residenti Campania Morante---------");
		for(Persona p : listaCampaniaMorante) {
			System.out.println(p.toString());
		}
		System.out.println("----------------------------------------");
		
		Indirizzo is = new Indirizzo("Via Matteotti",18,"Avellino",83100,"Avellino","Campania");
		Studente s = new Studente("Mario","Rossi",is,2,"informatica");
		
		System.out.println(s.toString());

		
		Studente morichStudente = new Studente(morich.getNome(), morich.getCognome(), morich.getIndirizzo(), 66, "Magistrale");
		System.out.println(morichStudente.toString());
		
		Studente sugliaStudente = new Studente(suglia.getNome(), suglia.getCognome(), suglia.getIndirizzo(), 1, "Triennale");
		ArrayList<String> listaCorsi =new ArrayList<String>();
		
		listaCorsi.add("Inglese");
		sugliaStudente.setCorsiDiFormazione(listaCorsi);
		
		System.out.println(sugliaStudente.toString());
		
		
		listaStudenti.add(morichStudente);
		listaStudenti.add(sugliaStudente);
		listaStudenti.add(s);
		
		listaStudentiFormazione=FormazioneSuglia.formazioneStudente(listaStudenti);
		
		System.out.println("LISTA STUDENTI CON ALMENO UN CORSO DI FORMAZIONE");
		for (int i = 0; i < listaStudentiFormazione.size(); i++) {
			System.out.println(listaStudentiFormazione.get(i).toString());
		}
		
		listaStudentiFormazione = FormazioneFerrara.formazioneStudenti(listaStudenti);
		
		for(int j=0;j<listaStudentiFormazione.size();j++) {
			System.out.println(listaStudentiFormazione.get(j).toString());
		}
	
	}
	
}
