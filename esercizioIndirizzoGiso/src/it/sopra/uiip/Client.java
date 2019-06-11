package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		Persona p1 = new Persona("Gianluca","Giso",new Date(11, 06, 2019),
				new Indirizzo("Via Carlo Alberto Dalla Chiesa",36,"Vallata",83059,"Avellino","Campania"));
		System.out.println(p1.toString());
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

		
		ArrayList<String> corsiTommaso=new ArrayList<>();
		corsiTommaso.add("programmazione Java");
		corsiTommaso.add("Architettura");
		Studente s2=new Studente(tommaso, 1, "informatica", corsiTommaso);
		System.out.println(s2.toString());
	}

}
