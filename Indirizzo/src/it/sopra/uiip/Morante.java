package it.sopra.uiip;

import java.util.ArrayList;

public class Morante {

	public static Persona cercaPersonaPiuGiovane(ArrayList<Persona> persone) {

		Persona piuGiovane = persone.get(0);

		for(Persona p : persone)
			if(p.getDataDiNascita().after(piuGiovane.getDataDiNascita()))
				piuGiovane = p;

		return piuGiovane;

	}

	public static Persona cercaPersonaPiuAnziana(ArrayList<Persona> persone) {

		Persona piuAnziana = persone.get(0);

		for(Persona p : persone)
			if(p.getDataDiNascita().before(piuAnziana.getDataDiNascita()))
				piuAnziana = p;

		return piuAnziana;

	}

}
