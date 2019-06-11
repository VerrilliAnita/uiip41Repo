package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Morante {

	public static ArrayList<Persona> cercaPersonePiuGiovani(ArrayList<Persona> persone) {

		ArrayList<Persona> piuGiovani = new ArrayList<Persona>();
		Date dataPiuGiovane = persone.get(0).getDataDiNascita();

		for(Persona p : persone)
			if(p.getDataDiNascita().after(dataPiuGiovane))
				dataPiuGiovane = p.getDataDiNascita();
		
		for(Persona p : persone)
			if(p.getDataDiNascita().compareTo(dataPiuGiovane) == 0)
				piuGiovani.add(p);

		return piuGiovani;

	}
	
	public static ArrayList<Persona> cercaPersonePiuAnziane(ArrayList<Persona> persone) {

		ArrayList<Persona> piuAnziani = new ArrayList<Persona>();
		Date dataPiuAnziana = persone.get(0).getDataDiNascita();

		for(Persona p : persone)
			if(p.getDataDiNascita().before(dataPiuAnziana))
				dataPiuAnziana = p.getDataDiNascita();
		
		for(Persona p : persone)
			if(p.getDataDiNascita().compareTo(dataPiuAnziana) == 0)
				piuAnziani.add(p);

		return piuAnziani;

	}

}
