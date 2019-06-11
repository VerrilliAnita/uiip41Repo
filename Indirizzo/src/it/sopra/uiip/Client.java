package it.sopra.uiip;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		Indirizzo i1 = new Indirizzo("Via dei Santini",15,"Cesinali",83020,"Avellino","Campania");
		
		Persona danilo = new Persona("Danilo","Ferrara",i1);
		
		System.out.println(danilo.toString());

		Persona morich = new Persona("Emanuele", "Morante", new Indirizzo("Atlantici", 16, "Benevento", 82100, "BN", "Campania"));
		
		System.out.println(morich.toString());
		

		Indirizzo i = new Indirizzo("Via Roma", 23, "Roma", 80045, "Roma", "Lazio");
		Persona suglia = new Persona("Pompilio", "Suglia", i);
		
		System.out.println(suglia.toString());
		
		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		
		listaPersone.add(suglia);
		listaPersone.add(morich);
		listaPersone.add(danilo);
		
		ArrayList<Persona> listaCampania = ResidentiCampaniaMorante.trovaResidentiCampania(listaPersone);
		
		
		System.out.println("\n------Residenti Campania Morante---------");
		for(Persona p : listaCampania) {
			System.out.println(p.toString());
		}
		System.out.println("----------------------------------------");
		
		

	}

}
