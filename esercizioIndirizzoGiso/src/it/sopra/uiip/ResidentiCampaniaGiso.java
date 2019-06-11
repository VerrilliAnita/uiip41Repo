package it.sopra.uiip;

import java.util.ArrayList;

public class ResidentiCampaniaGiso {
	
	public static ArrayList<Persona> trovaResidentiCampania(ArrayList<Persona> listaPersone){
		ArrayList<Persona> result = new ArrayList<Persona>();
		for(Persona p : listaPersone) {
			if(p.getIndirizzo().getRegione().equalsIgnoreCase("Campania"))
				result.add(p);
			
		}
		return result;
	}

}
