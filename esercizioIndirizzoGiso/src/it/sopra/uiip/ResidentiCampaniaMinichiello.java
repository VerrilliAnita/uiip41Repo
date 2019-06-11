package it.sopra.uiip;

import java.util.ArrayList;

public class ResidentiCampaniaMinichiello {
	
	public static ArrayList<Persona> trovaResidentiCampania(ArrayList<Persona> listaPersone){
		ArrayList<Persona> temp=new ArrayList<>();
		for(Persona p: listaPersone) {
			if(p.getIndirizzo().getRegione().equalsIgnoreCase("Campania")) {
				temp.add(p);
			}
		}
		return temp;
	}
}
