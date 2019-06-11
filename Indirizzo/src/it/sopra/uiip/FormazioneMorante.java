package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneMorante {
	
	public static ArrayList<Studente> formazioneStudenti(ArrayList<Studente> listaStudenti){
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		for(Studente s : listaStudenti) {
			if(s.getCorsiDiFormazione().size()>0)
				studenti.add(s);
		}
		return studenti;
		
	}

}
