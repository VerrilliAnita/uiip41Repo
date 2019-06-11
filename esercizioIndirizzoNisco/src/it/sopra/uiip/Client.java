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
		
		ArrayList<Persona>listaPersone = new ArrayList<Persona>();
		listaPersone.add(antonio);
		listaPersone.add(giuseppe);
		listaPersone.add(oksana);
		ArrayList<Persona>result = ResidentiCampaniaGonchar.trovaResidentiCampania(listaPersone);
		
		System.out.println("Abbitanti di Campania");
		for (Persona p: listaPersone) {
			System.out.println(p);
		}
	}
}
