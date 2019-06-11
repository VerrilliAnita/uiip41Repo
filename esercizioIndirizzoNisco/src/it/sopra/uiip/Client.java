package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		Persona oksana =new Persona ("Oksana", "Gonchar", new Date("08/04/1986"), new Indirizzo ("via Torreamando", 19,  "Ariano", 83010, "AV","Campania"));
		
		System.out.println(oksana.toString());

		Persona antonio= new Persona("Antonio","Nisco",new Date("10/09/1996"),new Indirizzo("Tufi",47,"Zungoli",83030,"AV","Campania"));
		System.out.println(antonio.toString());

		//Codice Giuseppe
		Persona giuseppe = new Persona("Giuseppe", "Ristaino", new Date("03/05/1989"), 
				new Indirizzo("Via prov. Cerzete", 22, "Atripalda", 83042, "AV", 
						"Campania"));
		System.out.println(giuseppe.toString());
		ArrayList<Persona> listaPersoneGiuseppe = new ArrayList<Persona>();
		listaPersoneGiuseppe.add(oksana);
		listaPersoneGiuseppe.add(antonio);
		listaPersoneGiuseppe.add(giuseppe);
		ArrayList<Persona> resultGiuseppe = ResidentiCampaniaRistaino.trovaResidentiCampania(listaPersoneGiuseppe);
		System.out.println("Lista delle persone che vivono in campania:");
		for(Persona p: resultGiuseppe) {
			System.out.println(p.toString());
		}
		
		ArrayList<Persona>listaPersoneOksana = new ArrayList<Persona>();
		listaPersoneOksana.add(antonio);
		listaPersoneOksana.add(giuseppe);
		listaPersoneOksana.add(oksana);
		ArrayList<Persona>resultoksana = ResidentiCampaniaGonchar.trovaResidentiCampania(listaPersoneOksana);
		
		System.out.println("Abbitanti di Campania");
		for (Persona p: resultoksana) {
			System.out.println(p);
		}
		
		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		listaPersone.add(oksana);
		listaPersone.add(antonio);
		listaPersone.add(giuseppe);
		
		ArrayList<Persona> result = ResidentiCampaniaNisco.trovaResidentiCampania(listaPersone);
		
		System.out.println("La lista di Antonio Nisco");
		for(Persona r: result) {
			System.out.println(r.toString());
		}
		

		//Codice di Giuseppe
		ArrayList<String> listaCorsiBaudo = new ArrayList<String>();
		listaCorsiBaudo.add("Geometria applicata");
		listaCorsiBaudo.add("Lirica");
		listaCorsiBaudo.add("Seduta spiritica");
		Studente studente = new Studente("Pippo", "Baudo", new Date("02/22/1990"), new Indirizzo("Via delle cirase", 88, "Tronto", 92033, "Ciao", "Lapponia"), 1, "Economia", listaCorsiBaudo);
		System.out.println(studente.toString());


		ArrayList<String>listaCorsiDiFormazione= new ArrayList<String>();
		listaCorsiDiFormazione.add("Italiano");
		listaCorsiDiFormazione.add("Ingeneria");
		Studente gonchar = new Studente("Gonchar", "Oksana", new Date("03/05/1990"), 
				new Indirizzo("Via prov. Cerzete", 22, "Atripalda", 83042, "AV", 
						"Campania"), 3, "ingeneria", listaCorsiDiFormazione);

		System.out.println(gonchar.toString());
		
		ArrayList<String> corsi= new ArrayList<String>();
		
		corsi.add("Economia");
		corsi.add("Diritto");
		corsi.add("Matematica");
		corsi.add("Programmazione");
		Studente nisco= new Studente("Antonio","Nisco",new Date("10/09/1996"),new Indirizzo("Tufi",47,"Zungoli",83030,"AV","Campania"),1,"Economia",corsi);
		
		System.out.println(nisco.toString());
		

		ArrayList<Studente> listaGonchar = new ArrayList<Studente>();
		listaGonchar.add(studente);
		listaGonchar.add(gonchar);
		listaGonchar.add(nisco);
		
		
		for (Studente s:listaGonchar) {
			System.out.println(s);
		}

		//Codice Giuseppe
		ArrayList<Studente> studentiGiuseppe = new ArrayList<Studente>();
		studentiGiuseppe.add(studente);
		studentiGiuseppe.add(gonchar);
		studentiGiuseppe.add(nisco);
		System.out.println("Stampa della lista degli studenti che hanno almeno un corso di formazione: ");
		for(Studente s: studentiGiuseppe) {
			System.out.println(s.toString());
		}
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		studenti.add(gonchar);
		studenti.add(nisco);
		studenti.add(studente);
		
		ArrayList<Studente> st = FormazioneNisco.formazioneStudenti(studenti);
		
		System.out.println("La lista di Antonio Nisco");
		for(Studente r: st) {
			System.out.println(r.toString());
		}
		
		//Metodi Nisco Antonio e relativo test
			ArrayList<Persona> giovaniNisco=Nisco.piùGiovane(listaPersone);
			ArrayList<Persona> anzianiNisco=Nisco.piùAnziana(listaPersone);
			System.out.println("TEST METODI HOMEWORK");
			System.out.println(giovaniNisco.toString());
			System.out.println(anzianiNisco.toString());
		
		
		
	}

}
