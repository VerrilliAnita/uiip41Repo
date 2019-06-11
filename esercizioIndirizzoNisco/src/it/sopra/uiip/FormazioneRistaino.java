package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneRistaino {
	
	public static ArrayList<Studente> formazioneStudenti(ArrayList<Studente> studenti) {
		ArrayList<Studente> result = new ArrayList<Studente>();
		for(Studente s : studenti) {
			if(!s.getCorsiDiFormazione().isEmpty()) {
				result.add(s);
			}
		}
		return result;
	}

}
