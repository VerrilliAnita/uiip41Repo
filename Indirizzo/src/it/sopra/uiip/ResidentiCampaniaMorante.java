package it.sopra.uiip;

import java.util.ArrayList;

public class ResidentiCampaniaMorante {
	
	public static ArrayList<Persona> trovaResidentiCampania(ArrayList<Persona> listaPersone){
		
		ArrayList<Persona> listaCampania = new ArrayList<Persona>();
		
		for(Persona p : listaPersone) {
			if(p.getIndirizzo().getRegione().equals("Campania"))
				listaCampania.add(p);
		}
		
		return listaCampania;
		
	}

}
