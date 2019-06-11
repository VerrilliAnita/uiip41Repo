package it.sopra.uiip;

import java.util.ArrayList;

public class ResidentiCampaniaFerrara {
	

	public static ArrayList<Persona> trovaResidentiCampania(ArrayList<Persona> listaPersone){
		ArrayList<Persona> listaResidenti = new ArrayList<>();
		for(Persona p:listaPersone) {
			if(p.getIndirizzo().getRegione().equals("Campania"))
				listaResidenti.add(p);
		}
		return listaResidenti;
	}
	
}
