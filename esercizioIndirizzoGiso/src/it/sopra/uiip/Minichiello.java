package it.sopra.uiip;


import java.util.ArrayList;
import java.util.Date;

public class Minichiello {
	public static ArrayList<Persona> calcolaPersonaAdulta(ArrayList<Persona> listaPersone){
		ArrayList<Persona> temp=new ArrayList<>();
		Date d=listaPersone.get(0).getDataDiNascita();
		for(Persona p: listaPersone) {
			if(p.getDataDiNascita().before(d)) {
				d=p.getDataDiNascita();
			}
		}
		
		for(Persona p1: listaPersone) {
			if(p1.getDataDiNascita().compareTo(d)==0) {
				temp.add(p1);
			}
		}
		return temp;
	}
	
	public static ArrayList<Persona> calcolaPersonaGiovane(ArrayList<Persona> listaPersone){
		ArrayList<Persona> temp=new ArrayList<>();
		Date d=listaPersone.get(0).getDataDiNascita();
		for(Persona p: listaPersone) {
			if(p.getDataDiNascita().after(d)) {
				d=p.getDataDiNascita();
			}
		}
		
		for(Persona p1: listaPersone) {
			if(p1.getDataDiNascita().compareTo(d)==0) {
				temp.add(p1);
			}
		}
		return temp;
	}
}
