package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {

		Persona giuseppe = new Persona("Giuseppe", "Ristaino", new Date(1989, 4, 25), 
				new Indirizzo("Via prov. Cerzete", 22, "Atripalda", 83042, "AV", 
						"Campania"));
		
		System.out.println(giuseppe.toString());
	}

}
