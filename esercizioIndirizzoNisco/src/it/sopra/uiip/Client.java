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
		
	}

}
