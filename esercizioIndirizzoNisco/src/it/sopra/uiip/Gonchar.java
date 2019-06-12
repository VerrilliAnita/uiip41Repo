package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Gonchar {
	public static ArrayList<Persona> pi�Anziana(ArrayList<Persona> listaPersone){
		Date max=listaPersone.get(0).getDataNascita();
		ArrayList<Persona> result=new ArrayList<Persona>();
		for(Persona p:listaPersone) {
			if(max.after(p.getDataNascita())) {
				max=p.getDataNascita();
			}
		}
		
		for(Persona p:listaPersone) {
			if(p.getDataNascita().equals(max)) {
				result.add(p);
			}
		}
		return result;
	}
	
	public static ArrayList<Persona> pi�Giovane(ArrayList<Persona> listaPersone){
		Date min=listaPersone.get(0).getDataNascita();
		ArrayList<Persona> result=new ArrayList<Persona>();
		for(Persona p:listaPersone) {
			if(min.before(p.getDataNascita())) {
				min=p.getDataNascita();
			}
		}
		
		for(Persona p:listaPersone) {
			if(p.getDataNascita().equals(min)) {
				result.add(p);
			}
		}
		return result;
	}

}
