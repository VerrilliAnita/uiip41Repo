package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		Indirizzo indi=new Indirizzo("c.da sant'andrea", 21, "Grottaminarda", 83035, "Avellino", "Campania");
		Persona tommaso=new Persona("tommaso", "minichiello", new Date(05, 01, 1994), indi);
		System.out.println(tommaso.toString());
	}

}
