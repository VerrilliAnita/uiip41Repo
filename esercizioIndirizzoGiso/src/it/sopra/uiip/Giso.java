package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Giso {
	
	public static ArrayList<Persona> calcolaPiuAdulto(ArrayList<Persona> listaPersone){
		ArrayList<Persona> result = new ArrayList<>();
		Date data = listaPersone.get(0).getDataDiNascita();
		for (Persona p : listaPersone) {
			if(p.getDataDiNascita().before(data))
				data = p.getDataDiNascita();
		}
		
		for (Persona p : listaPersone) {
			if(p.getDataDiNascita().compareTo(data) == 0) 
				result.add(p);
		}
		return result;
	}
	
	public static ArrayList<Persona> calcolaPiuGiovane(ArrayList<Persona> listaPersone){
		ArrayList<Persona> result = new ArrayList<>();
		Date data = listaPersone.get(0).getDataDiNascita();
		for (Persona p : listaPersone) {
			if(p.getDataDiNascita().after(data))
				data = p.getDataDiNascita();
		}
		
		for (Persona p : listaPersone) {
			if(p.getDataDiNascita().compareTo(data) == 0) 
				result.add(p);
		}
		return result;
	}

}
