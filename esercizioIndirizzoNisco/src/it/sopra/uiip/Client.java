package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		Persona oksana =new Persona ("Oksana", "Gonchar", new Date(1986, 8, 4), new Indirizzo ("via Torreamando", 19,  "Ariano", 83010, "AV","Campania"));
		
		System.out.println(oksana.toString());

		Persona antonio= new Persona("Antonio","Nisco",new Date(1996,10,9),new Indirizzo("Tufi",47,"Zungoli",83030,"AV","Campania"));
		System.out.println(antonio.toString());


		Persona giuseppe = new Persona("Giuseppe", "Ristaino", new Date(1989, 4, 25), 
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
		
		
	}

}
