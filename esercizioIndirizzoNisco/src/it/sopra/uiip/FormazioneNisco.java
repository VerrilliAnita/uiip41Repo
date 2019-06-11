package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneNisco {
	public static ArrayList< Studente> formazioneStudenti(ArrayList<Studente> listaStudenti){
			ArrayList <Studente> risultato= new ArrayList<Studente>();
			for(Studente s: listaStudenti) {
				if(s.getCorsiDiFormazione().size()>0) {
					risultato.add(s);
				}
			}
			return risultato;
	}
}
