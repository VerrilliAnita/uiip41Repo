package it.sopra.uiip;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		ArrayList<Persona> listaCampania = null;
		
		
		Indirizzo i1 = new Indirizzo("Via dei Santini",15,"Cesinali",83020,"Avellino","Campania");
		
		Persona danilo = new Persona("Danilo","Ferrara",i1);
		
		System.out.println(danilo.toString());

		Persona morich = new Persona("Emanuele", "Morante", new Indirizzo("Atlantici", 16, "Benevento", 82100, "BN", "Campania"));
		
		System.out.println(morich.toString());
		

		Indirizzo i = new Indirizzo("Via Roma", 23, "Montecalvo", 83037, "Avellino", "Campania");
		Persona suglia = new Persona("Pompilio", "Suglia", i);
		
		System.out.println(suglia.toString());
		

		listaPersone.add(suglia);
		listaPersone.add(morich);
		listaPersone.add(danilo);
		listaCampania=ResidentiCampaniaSuglia.trovaResidentiCampania(listaPersone);
		
		System.out.println("LISTA PERSONE CAMPANIA");
		for (int j = 0; j < listaCampania.size(); j++) {
			System.out.println(listaCampania.get(j).toString());
		}
		
		
	


	}

}
