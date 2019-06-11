package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		Persona oksana =new Persona ("Oksana", "Gonchar", new Date(1986, 8, 4), new Indirizzo ("via Torreamando", 19,  "Ariano", 83010, "AV","Campania"));
		
		System.out.println(oksana.toString());

		Persona antonio= new Persona("Antonio","Nisco",new Date(1996,10,9),new Indirizzo("Tufi",47,"Zungoli",83030,"AV","Campania"));
		System.out.println(antonio.toString());

		//Codice Giuseppe
		Persona giuseppe = new Persona("Giuseppe", "Ristaino", new Date(1989, 3, 25), 
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
		Studente studente = new Studente("Pippo", "Baudo", new Date(1990, 2, 22), new Indirizzo("Via delle cirase", 88, "Tronto", 92033, "Ciao", "Lapponia"), 1, "Economia", listaCorsiBaudo);
		System.out.println(studente.toString());


		ArrayList<String>listaCorsiDiFormazione= new ArrayList<String>();
		listaCorsiDiFormazione.add("Italiano");
		listaCorsiDiFormazione.add("Ingeneria");
		Studente gonchar = new Studente("Gonchar", "Oksana", new Date(1990, 5, 3), 
				new Indirizzo("Via prov. Cerzete", 22, "Atripalda", 83042, "AV", 
						"Campania"), 3, "ingeneria", listaCorsiDiFormazione);

		System.out.println(gonchar.toString());
		
		ArrayList<String> corsi= new ArrayList<String>();
		
		corsi.add("Economia");
		corsi.add("Diritto");
		corsi.add("Matematica");
		corsi.add("Programmazione");
		Studente nisco= new Studente("Antonio","Nisco",new Date(1996,10,9),new Indirizzo("Tufi",47,"Zungoli",83030,"AV","Campania"),1,"Economia",corsi);
		
		System.out.println(nisco.toString());
		
	}

}
