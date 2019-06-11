package it.sopra.uiip;

import java.util.ArrayList;

public class Suglia {
	
	public static Persona personaPiuGiovane(ArrayList<Persona> listaPersone) {
		Persona giovane = null;
		giovane=listaPersone.get(0);
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().after(giovane.getDataDiNascita())) {
				giovane=listaPersone.get(i);
			}
		}
		return giovane;
	}
	
	public static Persona personaPiuAnziana(ArrayList<Persona>listaPersone) {
		Persona anziana=null;
		anziana=listaPersone.get(0);
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().before(anziana.getDataDiNascita())) {
				anziana=listaPersone.get(i);
			}
		}
		return anziana;
		
	}
	
	
	
}
