package it.sopra.uiip;

import java.util.ArrayList;

public class Ferrara {
	
	public static Persona personaPiuGiovane(ArrayList<Persona> listaPersone) {
		Persona piuGiovane = null;
		piuGiovane = listaPersone.get(0);
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().after(piuGiovane.getDataDiNascita())) {
				piuGiovane = listaPersone.get(i);
			}
		}
		return piuGiovane;
	}
	
	public static Persona personaPiuAdulta(ArrayList<Persona>listaPersone) {
		Persona piuAdulta = null;
		piuAdulta = listaPersone.get(0);
		for (int i = 0; i < listaPersone.size(); i++) {
			if(listaPersone.get(i).getDataDiNascita().before(piuAdulta.getDataDiNascita())) {
				piuAdulta = listaPersone.get(i);
			}
		}
		return piuAdulta;
	}
}
