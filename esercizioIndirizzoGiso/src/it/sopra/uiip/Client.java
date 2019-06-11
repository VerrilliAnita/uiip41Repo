package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		Persona p1 = new Persona("Gianluca","Giso",new Date(11, 06, 2019),
				new Indirizzo("Via Carlo Alberto Dalla Chiesa",36,"Vallata",83059,"Avellino","Campania"));
		
		
		ArrayList<String> corsiS1 = new ArrayList<String>();
		corsiS1.add("Ingegneria del Software");
		corsiS1.add("Tecniche di Programmazione");
		corsiS1.add("ASSD");
		Studente s1 = new Studente(p1,2,"Ingegneria Informatica",corsiS1);
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		
		Indirizzo indi=new Indirizzo("c.da sant'andrea", 21, "Grottaminarda", 83035, "Avellino", "Campania");
		Persona tommaso=new Persona("tommaso", "minichiello", new Date(05, 01, 1994), indi);
		System.out.println(tommaso.toString());
		listaPersone.add(p1);
		listaPersone.add(tommaso);
		
		System.out.println("PERSONE CON INDIRIZZO CAMPANIA MINICHIELLO");
		for(Persona pp: ResidentiCampaniaMinichiello.trovaResidentiCampania(listaPersone)) {
			System.out.println(pp.toString());
		}

		
		System.out.println("PERSONE CON INDIRIZZO CAMPANIA GISO");
		for(Persona p: ResidentiCampaniaGiso.trovaResidentiCampania(listaPersone))
			System.out.println(p.toString());

		

	}

}
