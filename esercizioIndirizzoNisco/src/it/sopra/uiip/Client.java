package it.sopra.uiip;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		Persona oksana =new Persona ("Oksana", "Gonchar", new Date(1986, 8, 4), new Indirizzo ("via Torreamando", 19,  "Ariano", 83010, "AV","Campania"));
		
		System.out.println(oksana.toString());

	}

}
