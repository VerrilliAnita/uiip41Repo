package it.sopra.uiip;

import java.util.ArrayList;

public class ResidentiCampaniaGonchar {
	
	public static ArrayList<Persona> trovaResidentiCampania(ArrayList<Persona> listaPersone) {
		ArrayList<Persona> campania = new ArrayList<Persona>();
		for (Persona p: listaPersone) {
			if (p.getIndirizzo().getRegione().equals("Campania"))campania.add(p);
			
		
		}
		return campania;
	}
	
		
}
