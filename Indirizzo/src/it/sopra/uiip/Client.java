package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {


		ArrayList<Studente> listaStudenti = new ArrayList<Studente>();
		ArrayList<Studente> listaStudentiFormazione = new ArrayList<Studente>();
		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		ArrayList<Persona> listaCampania = null;


		Indirizzo iDanilo = new Indirizzo("Via dei Santini",15,"Cesinali",83020,"Avellino","Campania");
		Indirizzo iSuglia = new Indirizzo("Via Roma", 23, "Montecalvo", 83037, "Avellino", "Campania");

		Persona danilo = new Persona("Danilo","Ferrara", new Date("02/20/1987"), iDanilo);
		Persona morich = new Persona("Emanuele", "Morante", new Date("05/02/1991")  ,new Indirizzo("Atlantici", 16, "Benevento", 82100, "BN", "Campania"));
		Persona suglia = new Persona("Pompilio", "Suglia", new Date("12/25/1990"), iSuglia);

		//studente danilo
		Studente s = new Studente(danilo.getNome(),danilo.getCognome(),danilo.getDataDiNascita(),danilo.getIndirizzo(),2,"informatica");

		//studente emanuele
		Studente morichStudente = new Studente(morich.getNome(), morich.getCognome(), morich.getDataDiNascita(), morich.getIndirizzo(), 66, "Magistrale");
		ArrayList<String> corsi = new ArrayList<String>();
		corsi.add("uiip");
		morichStudente.setCorsiDiFormazione(corsi);

		//studente pompilio
		Studente sugliaStudente = new Studente(suglia.getNome(), suglia.getCognome(), suglia.getDataDiNascita(), suglia.getIndirizzo(), 1, "Triennale");
		ArrayList<String> listaCorsi =new ArrayList<String>();
		listaCorsi.add("Inglese");
		sugliaStudente.setCorsiDiFormazione(listaCorsi);

		listaPersone.add(danilo);
		listaPersone.add(morich);
		listaPersone.add(suglia);

		listaStudenti.add(morichStudente);
		listaStudenti.add(sugliaStudente);
		listaStudenti.add(s);
		
		System.out.println("\nSTAMPA PERSONE");
		System.out.println(danilo.toString());
		System.out.println(morich.toString());
		System.out.println(suglia.toString());
		System.out.println("----------------------------\n");

		System.out.println("STAMPA STUDENTI");
		System.out.println(morichStudente.toString());
		System.out.println(s.toString());
		System.out.println(sugliaStudente.toString());
		System.out.println("----------------------------\n");
		
		//residenti ferrara
		ArrayList<Persona> listaResidenti;
		System.out.println("\n------Residenti Campania Ferrara---------");
		listaResidenti = ResidentiCampaniaFerrara.trovaResidentiCampania(listaPersone);
		for(int j=0;j<listaResidenti.size();j++) {
			System.out.println(listaResidenti.get(j).toString());
		}
		System.out.println("--------------------\n");

		//residenti suglia
		listaCampania=ResidentiCampaniaSuglia.trovaResidentiCampania(listaPersone);
		System.out.println("LISTA PERSONE CAMPANIA");
		for (int j = 0; j < listaCampania.size(); j++) {
			System.out.println(listaCampania.get(j).toString());
		}
		System.out.println("--------------------\n");

		//residenti morich
		ArrayList<Persona>listaCampaniaMorante = ResidentiCampaniaMorante.trovaResidentiCampania(listaPersone);
		System.out.println("------Residenti Campania Morante---------");
		for(Persona p : listaCampaniaMorante) 
			System.out.println(p.toString());
		System.out.println("----------------------------------------\n");


		//pompilio corso formazione
		listaStudentiFormazione=FormazioneSuglia.formazioneStudente(listaStudenti);
		System.out.println("____Pompilio_______");
		System.out.println("LISTA STUDENTI CON ALMENO UN CORSO DI FORMAZIONE");
		for (int i = 0; i < listaStudentiFormazione.size(); i++) {
			System.out.println(listaStudentiFormazione.get(i).toString());
		}
		System.out.println("--------------------\n");

		//danilo corso formazione
		listaStudentiFormazione = FormazioneFerrara.formazioneStudenti(listaStudenti);
		System.out.println("____Danilo_______");
		for(int j=0;j<listaStudentiFormazione.size();j++) {
			System.out.println(listaStudentiFormazione.get(j).toString());
		}
		System.out.println("--------------------\n");

		//morich corso formazione
		listaStudentiFormazione = FormazioneMorante.formazioneStudenti(listaStudenti);
		System.out.println("____Emanuele_______");
		for(Studente sd : listaStudentiFormazione) {
			System.out.println(sd.toString());
		}
		System.out.println("--------------------\n");

		//morich persona più giovane e più ansiana
		System.out.println("____Emanuele_______GIOVANE______ANZIANO___");
		System.out.println("Secondo morich la persona più giovane è " + Morante.cercaPersonaPiuGiovane(listaPersone));
		System.out.println("Secondo morich la persona più anziana è " + Morante.cercaPersonaPiuAnziana(listaPersone));
		System.out.println("--------------------\n");
		
		//Suglia persona più giovane e persona più anziana
		System.out.println("____Pompilio_______GIOVANE______ANZIANO___");
		System.out.println("Persona più giovane: " + Suglia.personaPiuGiovane(listaPersone));
		System.out.println("Persona più anziana: " + Suglia.personaPiuAnziana(listaPersone));
		System.out.println("--------------------\n");

	}

}
