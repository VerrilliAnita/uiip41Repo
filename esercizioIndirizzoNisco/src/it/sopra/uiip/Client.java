package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		Persona oksana =new Persona ("Oksana", "Gonchar", new Date(1986, 8, 4), new Indirizzo ("via Torreamando", 19,  "Ariano", 83010, "AV","Campania"));
		
		System.out.println(oksana.toString());

		Persona giuseppe = new Persona("Giuseppe", "Ristaino", new Date(1989, 4, 25), 
				new Indirizzo("Via prov. Cerzete", 22, "Atripalda", 83042, "AV", 
						"Campania"));
		
		System.out.println(giuseppe.toString());
	}

}
