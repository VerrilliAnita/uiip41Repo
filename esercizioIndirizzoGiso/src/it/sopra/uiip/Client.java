package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Gianluca","Giso",new Date(11, 06, 2019),
				new Indirizzo("Via Carlo Alberto Dalla Chiesa",36,"Vallata",83059,"Avellino","Campania"));
		
		System.out.println(p1.toString());
		
	}

}
