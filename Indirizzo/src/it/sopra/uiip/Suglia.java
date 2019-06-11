package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Suglia {
	
	public static ArrayList<Persona> personaPiuGiovane(ArrayList<Persona> listaPersone) {
		Date dataPiuGiovane=listaPersone.get(0).getDataDiNascita();
		ArrayList<Persona> listaGiovani = new ArrayList<Persona>();
		
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().after(dataPiuGiovane)) {
				dataPiuGiovane=listaPersone.get(i).getDataDiNascita();
			}
		}
		
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().compareTo(dataPiuGiovane)==0){
				listaGiovani.add(listaPersone.get(i));
			}
		}
		return listaGiovani;
	}
	
	public static ArrayList<Persona> personaPiuAnziana(ArrayList<Persona>listaPersone) {
		Date dataPiuAnziana=listaPersone.get(0).getDataDiNascita();
		ArrayList<Persona> listaAnziani = new ArrayList<Persona>();
		
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().before(dataPiuAnziana)) {
				dataPiuAnziana=listaPersone.get(i).getDataDiNascita();
			}
		}
		
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().compareTo(dataPiuAnziana)==0){
				listaAnziani.add(listaPersone.get(i));
			}
		}
		return listaAnziani;
		
	}
	
	
	
}