package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneSuglia {
	
	public static ArrayList<Studente> formazioneStudente(ArrayList<Studente>listaStudenti){
		ArrayList<Studente> listaStudentiFormazione = new ArrayList<Studente>();
		for(Studente s: listaStudenti) {
			if(s.getCorsiDiFormazione().size()>=1) {
				listaStudentiFormazione.add(s);
			}
		}
		return listaStudentiFormazione;
	}

}
