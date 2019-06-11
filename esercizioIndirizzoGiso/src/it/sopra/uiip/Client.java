package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {

		
		Persona p1 = new Persona("Gianluca","Giso",new Date(11, 06, 2019),
				new Indirizzo("Via Carlo Alberto Dalla Chiesa",36,"Vallata",83059,"Avellino","Campania"));
		System.out.println(p1.toString());
		Indirizzo indi=new Indirizzo("c.da sant'andrea", 21, "Grottaminarda", 83035, "Avellino", "Campania");
		Persona tommaso=new Persona("tommaso", "minichiello", new Date(05, 01, 1994), indi);
		System.out.println(tommaso.toString());

	}

}
