package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {

		Persona antonio= new Persona("Antonio","Nisco",new Date(1996,10,9),new Indirizzo("Tufi",47,"Zungoli",83030,"AV","Campania"));
		System.out.println(antonio.toString());


		Persona giuseppe = new Persona("Giuseppe", "Ristaino", new Date(1989, 4, 25), 
				new Indirizzo("Via prov. Cerzete", 22, "Atripalda", 83042, "AV", 
						"Campania"));
		
		System.out.println(giuseppe.toString());
	}

}
